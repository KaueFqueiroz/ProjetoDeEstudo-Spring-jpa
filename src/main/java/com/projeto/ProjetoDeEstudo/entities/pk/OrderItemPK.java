package com.projeto.ProjetoDeEstudo.entities.pk;

import com.projeto.ProjetoDeEstudo.entities.Order;
import com.projeto.ProjetoDeEstudo.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;


// não terá tabela propria, seus atributos serão incorporados na tabela da entidade que a utiliza
@Embeddable
public class OrderItemPK implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public OrderItemPK setOrder(Order order) {
        this.order = order;
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public OrderItemPK setProduct(Product product) {
        this.product = product;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItemPK that = (OrderItemPK) o;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }
}
