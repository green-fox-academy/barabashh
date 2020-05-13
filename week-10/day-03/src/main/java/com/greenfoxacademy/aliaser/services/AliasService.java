package com.greenfoxacademy.aliaser.services;

import com.greenfoxacademy.aliaser.models.Aliaser;
import com.greenfoxacademy.aliaser.repositories.AliasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliasService {
  private AliasRepository aliasRepository;

  @Autowired
  public AliasService(AliasRepository aliasRepository) {
    this.aliasRepository = aliasRepository;
  }

  public Boolean findIfAliasExists(String alias) {

    return (aliasRepository.findAliasByAlias(alias) != null);
  }

  public Aliaser findAliaserByAlias(String alias) {
    return aliasRepository.findAliasByAlias(alias);
  }

  public String generateSecretCode() {
    return Aliaser.generateSecreCode();
  }

  public void saveAliaser(Aliaser aliaser) {
    aliasRepository.save(aliaser);
  }

  public List<Aliaser> returnAllAliasersInSpecificFormat() {
    return (List<Aliaser>) aliasRepository.findAll();
  }

  public int deleteLinkByIdAndSecretCodeAndReturnStatusCode(Long id, String secretCode) {
    Optional<Aliaser> aliaser = aliasRepository.findById(id);
    if (!aliaser.isPresent()) {
      return 404;
    } else if (aliaser.get().getSecretCode().equals(secretCode)) {
      aliasRepository.deleteById(id);
      return 204;
    } else {
      return 403;
    }
  }
}
