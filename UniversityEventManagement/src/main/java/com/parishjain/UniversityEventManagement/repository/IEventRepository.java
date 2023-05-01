package com.parishjain.UniversityEventManagement.repository;

import com.parishjain.UniversityEventManagement.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventRepository extends CrudRepository<Event,Integer> {


}
