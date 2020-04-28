package com.greenfoxacademy.connwithmysql;

import com.greenfoxacademy.connwithmysql.models.Todo;
import com.greenfoxacademy.connwithmysql.repositories.TodoRepository;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnwithmysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public ConnwithmysqlApplication(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }
  public static void main(String[] args) {
    SpringApplication.run(ConnwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    // I need to modify Logger level here otherwise IntelliJ goes into
    // an infinite loop of displaying error messages - couldn't solve this
    // problem with mentor help either
    Logger tcpLogger = Logger.getLogger("sun.rmi.transport.tcp");
    tcpLogger.setLevel(Level.SEVERE);

    todoRepository.save(new Todo("daily task",false,false));
    todoRepository.save(new Todo("make the beds",true,true));
    todoRepository.save(new Todo("do the washing up",true,false));
    todoRepository.save(new Todo("tidy up",false,false));
  }
}
