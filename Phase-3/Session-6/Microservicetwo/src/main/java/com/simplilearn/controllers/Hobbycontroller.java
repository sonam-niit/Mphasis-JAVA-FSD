package com.simplilearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.HobbyEntity;
import com.simplilearn.service.HobbyService;

@RestController
@RequestMapping("/api/hobby")
public class Hobbycontroller {
	
	@Autowired
	private HobbyService hobbyService;

	@PostMapping("/")
	public ResponseEntity<HobbyEntity> addHobby(@RequestBody HobbyEntity entity)
	{
		HobbyEntity hobby= hobbyService.addHobby(entity);
		return new ResponseEntity<HobbyEntity>(hobby,HttpStatus.CREATED);
	}
	@GetMapping("/{personId}")
	public String getHobbyByPId(@PathVariable int personId)
	{
		return hobbyService.findByPersonId(personId);
	}
	
}
