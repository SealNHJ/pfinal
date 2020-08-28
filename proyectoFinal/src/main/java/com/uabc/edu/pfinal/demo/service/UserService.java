package com.uabc.edu.pfinal.demo.service;

import com.uabc.edu.pfinal.demo.entity.User;
import com.uabc.edu.pfinal.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User registrarUsuario(User user){

        User userSaved=repo.save(user);
        return userSaved;
    }
    //De un listado
    public void editarUsuario(long id){

        User user = repo.findById(id).orElseThrow(()->
                new IllegalArgumentException("Invalid user Id:" + id));
    }

    //Este usuario proviene de un formulario de edicion
    public void actualizarUsuario(User user){

        repo.save(user);
    }

    public void eliminarUsuario(long id){
        User user = repo.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Invalid user Id:" + id));
        repo.delete(user);
    }

    public List<User> obtenerTodosUsuario(){

        List<User> actualList = new ArrayList<User>();
        repo.findAll().forEach(actualList::add);

        return actualList;
    }

}
