package com.api.ec.RestfulAPI.model.dao;

import com.api.ec.RestfulAPI.model.entity.Client;
import org.springframework.data.repository.CrudRepository;
//heredo clase para CRUD
public interface ClientDao extends CrudRepository<Client, Integer> {

}
