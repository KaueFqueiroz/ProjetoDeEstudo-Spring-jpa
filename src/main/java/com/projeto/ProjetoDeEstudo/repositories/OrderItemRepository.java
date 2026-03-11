package com.projeto.ProjetoDeEstudo.repositories;

import com.projeto.ProjetoDeEstudo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
