package com.betrybe.repository;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import com.betrybe.model.Carro;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class CarroRepository implements PanacheRepositoryBase<Carro, Long> {

  public List<Carro> listAll() {
    // TODO Auto-generated method stub
    return null;
  }

  public Carro findById(Long id) {
    // TODO Auto-generated method stub
    return null;
  }

  public void persist(Carro carro) {
    // TODO Auto-generated method stub

  }

  public void deleteById(Long id) {
    // TODO Auto-generated method stub

  }


}
