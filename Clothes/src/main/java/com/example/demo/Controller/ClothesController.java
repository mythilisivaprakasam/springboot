package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Clothes;
import com.example.demo.Service.ClothesService;

@RestController
public class ClothesController {
	
	@Autowired
	ClothesService cloth; 
	
	@PostMapping(value="/saveClothes")
	public 	Clothes saveClothes(@RequestBody Clothes c )
	{
		return cloth.saveClothes(c);
	}
	
	@PutMapping(value="/updateClothes")
	public Clothes updateClothes(@RequestBody Clothes c)
	{
		return cloth.updateClothes(c);
	}
	
	@DeleteMapping(value="/deleteClothes/{id}")
	public String deleteClothes(@PathVariable("id") int id)
	{
		cloth.getClothes(id);
		return "deleted";
	}
	
	@GetMapping(value="/getClothes/{id}")
	public Clothes getClothes(@PathVariable("id")int id)
	{
		return cloth.getClothes(id);
	}

}