package com.crud.app.rest.Controller;

import com.crud.app.rest.Models.Clientes;
import com.crud.app.rest.Models.Vendedores;
import com.crud.app.rest.Repo.ClientesRepo;
import com.crud.app.rest.Repo.VendedoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private VendedoresRepo vendedoresRepo; //Insert the repository

    public ApiControllers() {
    }

    @GetMapping(value = "/")
    public String getPage(){
        return "Home";
    }

    @GetMapping(value = "/vendedores")
    public List<Vendedores> getVend(){
        return vendedoresRepo.findAll();//Returns all users from the database
    }

    @PostMapping(value = "/vendedor_save")
    public String saveVend(@RequestBody Vendedores vendedores){
        vendedoresRepo.save(vendedores);
        return "Salvo!!";
    }

    @PutMapping(value = "/vendedor_update/{id}")
    public String updateVend(@PathVariable String id,@RequestBody Vendedores vendedores){
        Vendedores updatedVend = vendedoresRepo.findById(id).get();
        updatedVend.setCdVend(vendedores.getCdVend());
        updatedVend.setDsNome(vendedores.getDsNome());
        updatedVend.setDtNasc(vendedores.getDtNasc());
        updatedVend.setCdTab(vendedores.getCdTab());
        vendedoresRepo.save(updatedVend);
        return "Atualizado!!";
    }

    @DeleteMapping(value = "/vendedor_delete/{id}")
    public String deleteUser(@PathVariable String id){
        Vendedores deleteVend = vendedoresRepo.findById(id).get();
        vendedoresRepo.delete(deleteVend);
        return "Deletado vendedor com a id: "+id;
    }
    @Autowired
    private ClientesRepo clientesRepo; //Insert the repository

    @PostMapping(value = "/cliente_save")
    public String saveCliente(@RequestBody Clientes clientes){
        clientesRepo.save(clientes);
        return "Salvo!!";
    }

    @GetMapping(value = "/clientes")
    public List<Clientes> getCliente(){
        return clientesRepo.findAll();//Returns all users from the database
    }

    @PutMapping(value = "/cliente_update/{id}")
    public String updateCliente(@PathVariable String id,@RequestBody Clientes clientes){
        Clientes updatedCliente = clientesRepo.findById(id).get();
        updatedCliente.setCdCl(clientes.getCdCl());
        updatedCliente.setDtNome(clientes.getDtNome());
        updatedCliente.setIdTipo(clientes.getIdTipo());
        updatedCliente.setDsLim(clientes.getDsLim());
        clientesRepo.save(updatedCliente);
        return "Atualizado!!";
    }

    @DeleteMapping(value = "/cliente_delete/{id}")
    public String deleteCliente(@PathVariable String id){
        Clientes deleteCliente = clientesRepo.findById(id).get();
        clientesRepo.delete(deleteCliente);
        return "Deletado vendedor com a id: "+id;
    }
}
