package io.bankapp.dao;

import org.springframework.data.repository.CrudRepository;

import io.bankapp.model.Logger;

public interface LoggerRepository extends CrudRepository<Logger, Integer> {

}
