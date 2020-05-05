package com.greenfoxacademy.backendtest.repositories;

import com.greenfoxacademy.backendtest.models.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log,Integer> {
}
