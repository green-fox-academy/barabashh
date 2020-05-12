package com.greenfoxacademy.urlaliaser.repositories;

import com.greenfoxacademy.urlaliaser.models.Aliaser;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends CrudRepository<Aliaser, Long> {
  List<Aliaser> findByAlias(String alias);
}
