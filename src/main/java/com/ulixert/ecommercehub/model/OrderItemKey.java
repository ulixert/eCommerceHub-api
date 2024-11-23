package com.ulixert.ecommercehub.model;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemKey implements Serializable {

    private Long orderId;
    private Long productId;

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemKey that = (OrderItemKey) o;

        if (!orderId.equals(that.orderId)) return false;
        return productId.equals(that.productId);
    }

    @Override
    public int hashCode() {
        int result = orderId.hashCode();
        result = 31 * result + productId.hashCode();
        return result;
    }
}