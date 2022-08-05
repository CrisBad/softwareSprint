package co.unicauca.sprintapi.domain.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.unicauca.sprintapi.domain.model.Product;

@Repository
public interface IProduct extends CrudRepository<Product, Long> {

}
