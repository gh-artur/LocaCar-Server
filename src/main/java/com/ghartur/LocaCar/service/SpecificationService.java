package com.ghartur.LocaCar.service;

import com.ghartur.LocaCar.model.Specification;

import java.util.List;


public interface SpecificationService {

    Specification saveSpecification(Specification Specification); //tela de cadastro vai passar somento o nome da especificação e salvar
    Specification findSpecificationById(Long id); //search purposes
    List<Specification> findAllSpecifications(); //Listagem das especificações disponíveis para vincular aos veiculos
    void deleteSpecification(Long id); //botão delete na listagem de especificações
    Specification updateSpecification(Specification specification);
}
