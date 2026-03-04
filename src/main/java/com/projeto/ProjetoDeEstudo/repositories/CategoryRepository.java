package com.projeto.ProjetoDeEstudo.repositories;

import com.projeto.ProjetoDeEstudo.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
