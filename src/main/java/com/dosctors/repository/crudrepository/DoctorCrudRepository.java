package com.dosctors.repository.crudrepository;

import com.dosctors.model.DoctorModel;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<DoctorModel,Integer> {
}
