package com.crud.app.rest.Repo;

import com.crud.app.rest.Models.Vendedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendedoresRepo extends JpaRepository<Vendedores,String> {

    //List<Object> findById(String id);
}
