package io.bankapp.dao;

import org.springframework.data.repository.CrudRepository;

import io.bankapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
