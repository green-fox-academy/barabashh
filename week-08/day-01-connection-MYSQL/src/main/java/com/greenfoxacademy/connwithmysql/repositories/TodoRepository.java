package com.greenfoxacademy.connwithmysql.repositories;

import com.greenfoxacademy.connwithmysql.models.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  public List<Todo> findAllByDoneEquals(boolean isDone);
}
