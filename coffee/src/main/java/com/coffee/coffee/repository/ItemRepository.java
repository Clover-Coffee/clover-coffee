package com.coffee.coffee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coffee.coffee.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
