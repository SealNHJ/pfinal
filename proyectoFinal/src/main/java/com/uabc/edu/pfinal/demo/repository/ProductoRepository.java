package com.uabc.edu.pfinal.demo.repository;

import com.uabc.edu.pfinal.demo.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

    List<Producto> findByName(String name);

}
