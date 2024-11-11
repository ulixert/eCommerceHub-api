package com.ulixert.ecommercehub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "carts")
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User customer;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<CartItem> cartItems = new HashSet<>();

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal totalOriginalPrice = BigDecimal.ZERO;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal totalCurrentPrice = BigDecimal.ZERO;

    private BigDecimal totalAmountAfterDiscount = BigDecimal.ZERO;

    @Column(nullable = false)
    private Integer totalQuantity = 0;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal totalDiscount = BigDecimal.ZERO;

    @Column
    private String appliedCouponCode;
}
