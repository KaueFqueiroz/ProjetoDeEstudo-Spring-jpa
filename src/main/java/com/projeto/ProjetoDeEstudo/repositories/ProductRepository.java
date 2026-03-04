package com.projeto.ProjetoDeEstudo.repositories;


import com.projeto.ProjetoDeEstudo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
