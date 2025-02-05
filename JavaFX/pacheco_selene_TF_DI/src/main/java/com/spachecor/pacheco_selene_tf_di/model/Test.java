package com.spachecor.pacheco_selene_tf_di.model;

import com.spachecor.pacheco_selene_tf_di.model.entity.Cliente;
import com.spachecor.pacheco_selene_tf_di.model.service.repository.GenericRepositoryService;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        GenericRepositoryService<Cliente> clienteRepository = new GenericRepositoryService<Cliente>(Cliente.class);
        List<Cliente> clienteList = clienteRepository.listar();
        for (Cliente cliente : clienteList) {
            System.out.println(cliente);
        }
    }
}
