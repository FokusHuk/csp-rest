package com.petshopspringboot.petshopspring.repository;

import com.petshopspringboot.petshopspring.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
