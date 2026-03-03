package com.projeto.ProjetoDeEstudo.repositories;

import com.projeto.ProjetoDeEstudo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
