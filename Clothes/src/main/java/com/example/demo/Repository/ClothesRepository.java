package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Clothes;

@Repository
public interface ClothesRepository extends JpaRepository<Clothes,Integer>
{

}
