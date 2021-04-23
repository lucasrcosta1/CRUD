package com.crud.app.rest.Repo;

import com.crud.app.rest.Models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientesRepo extends JpaRepository<Clientes,String> {

}

