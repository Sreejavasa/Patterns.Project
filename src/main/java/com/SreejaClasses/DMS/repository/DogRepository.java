package com.SreejaClasses.DMS.repository;

/**
* @author S560715 Sreeja Vasa
*/
import java.util.List;

/**
* @author S560715 Sreeja Vasa
*/
import org.springframework.data.repository.CrudRepository;

import com.SreejaClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {

	List<Dog> findByName(String name);
}
