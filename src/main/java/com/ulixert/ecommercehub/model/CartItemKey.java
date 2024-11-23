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
public class CartItemKey implements Serializable {

    private Long cartId;
    private Long productId;

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartItemKey that = (CartItemKey) o;

        if (!cartId.equals(that.cartId)) return false;
        return productId.equals(that.productId);
    }

    @Override
    public int hashCode() {
        int result = cartId.hashCode();
        result = 31 * result + productId.hashCode();
        return result;
    }
}