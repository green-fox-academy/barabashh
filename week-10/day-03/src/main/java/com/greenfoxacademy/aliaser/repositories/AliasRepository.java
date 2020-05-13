package com.greenfoxacademy.aliaser.repositories;

import com.greenfoxacademy.aliaser.models.Aliaser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends CrudRepository<Aliaser, Long> {
  Aliaser findAliasByAlias(String alias);
}
