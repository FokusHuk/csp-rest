package com.petshopspringboot.petshopspring.resource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.petshopspringboot.petshopspring.model.Animal;
import com.petshopspringboot.petshopspring.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/shop")
public class AnimalController {

    @Autowired
    private AnimalRepository _animalRepository;

    @RequestMapping("/animals")
    public List<Animal> getAllAnimals()
    {
        return _animalRepository.findAll();
    }

   @RequestMapping("/animals/id={id}")
   public Optional<Animal> getAnimalByID(@PathVariable int id)
   {
       return _animalRepository.findById(id);
   }

   @RequestMapping("/animals/type={type}")
   public List<Animal> getAnimalByID(@PathVariable String type)
   {
       List<Animal> animals = _animalRepository.findAll();
       return animals.stream().filter(p -> p.getType().equals(type)).collect(Collectors.toList());
   }

   @PostMapping("/animals")
   public List<Animal> addAnimal(@RequestBody Animal animal)
   {
       _animalRepository.save(animal);
       return _animalRepository.findAll();
   }


  @PutMapping("/animals/id={id}")
  public Optional<Animal> updateAnimalData(@PathVariable("id") int animalID, @RequestBody Animal animal)
  {
      Optional<Animal> animalObject = _animalRepository.findById(animalID);
      Animal an = animalObject.get();
      an.setName(animal.getName());
      an.setAge(animal.getAge());
      an.setType(animal.getType());
      an.setSex(animal.getSex());
      an.setPrice(animal.getPrice());
      _animalRepository.save(an);
      return _animalRepository.findById(animalID);
  }


   @DeleteMapping("/animals/basket={id}")
   public List<Animal> deleteAnimal(@PathVariable int id)
   {
       _animalRepository.deleteById(id);
       return _animalRepository.findAll();
   }

}
