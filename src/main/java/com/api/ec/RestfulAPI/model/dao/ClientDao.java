package com.api.ec.RestfulAPI.model.dao;

import com.api.ec.RestfulAPI.model.entity.Client;
import org.springframework.data.repository.PagingAndSortingRepository;

//heredo clase para CRUD
public interface ClientDao extends PagingAndSortingRepository<Client, Integer> {

}
