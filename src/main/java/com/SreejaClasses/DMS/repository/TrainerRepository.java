package com.SreejaClasses.DMS.repository;


/**
* @author S560715 Sreeja Vasa
*/
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.SreejaClasses.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
