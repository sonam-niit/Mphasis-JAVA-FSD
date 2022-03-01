package com.simplilearn.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.simplilearn.entity.PersonEntity;
import com.simplilearn.repo.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	private RestTemplate restTemplate=new RestTemplate();
	
	public PersonEntity addPerson(PersonEntity person) {
			return personRepository.save(person);
	}
	
	public PersonResponse getPerson(int personId)
	{
		//microservice
		final String url="http://localhost:8082/api/hobby/{personId}";
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("personId", personId);
		String hobby= restTemplate.getForObject(url, String.class,map);
		
		PersonEntity entity= personRepository.getById(personId);
		
		PersonResponse resp= new PersonResponse();
		resp.setPersonId(entity.getPersonId());
		resp.setName(entity.getName());
		resp.setAge(entity.getAge());
		resp.setHobby(hobby);
		
		return resp;
	}
}
