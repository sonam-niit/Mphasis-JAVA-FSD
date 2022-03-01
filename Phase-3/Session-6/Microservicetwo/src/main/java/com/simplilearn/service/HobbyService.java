package com.simplilearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.HobbyEntity;
import com.simplilearn.repo.HobbyRepository;

@Service
public class HobbyService {

	@Autowired
	private HobbyRepository hobbyRepository;
	
	public HobbyEntity addHobby(HobbyEntity hobby)
	{
		return hobbyRepository.save(hobby);
	}
	
	public String findByPersonId(int personId) {
		return hobbyRepository.findByPersonId(personId);
	}
}
