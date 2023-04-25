package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ClothesRepository;
import com.example.demo.model.Clothes;

@Service
public class ClothesService {
	
	@Autowired
	ClothesRepository clothRepository;
	public List<Clothes> getAllClothes()
	{
		List<Clothes> clothList=clothRepository.findAll();
		return clothList;
	}
	public Clothes saveClothes(Clothes s)
	{
		Clothes obj=clothRepository.save(s);
		return obj;
		//return clothRepository.save(s);
	}
	public Clothes updateClothes(Clothes s)
	{
		Clothes obj=clothRepository.save(s);
		return obj;
		//return clothRepository.save(s);
	}
	public void deleteSIcecream(int id)
	{
		clothRepository.deleteById(id);
	}
	public Clothes getClothes(int id)
	{
		Clothes s=clothRepository.findById(id).get();
		return s;
	}

}
