package com.projeto.ProjetoDeEstudo.services;

import com.projeto.ProjetoDeEstudo.entities.Product;
import com.projeto.ProjetoDeEstudo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository product;

    public List<Product> findAll(){
        return product.findAll();
    }
    
    public Product findById(Long id){
        Optional<Product> obj = product.findById(id);
        return obj.get();
    }






}
