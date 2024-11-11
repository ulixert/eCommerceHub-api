package com.ulixert.ecommercehub.model;

import com.ulixert.ecommercehub.model.embedable.PaymentDetails;
import com.ulixert.ecommercehub.model.enums.OrderStatus;
import com.ulixert.ecommercehub.model.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private Long id;

    private String orderNumber;

    @ManyToOne
    private User user;

    private Long sellerId;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems = new ArrayList<>();

    @ManyToOne
    private Address shippingAddress;

    @Embedded
    private PaymentDetails paymentDetails = new PaymentDetails();

    private double totalMsrpPrice;

    private double totalSalePrice;

    private Integer discount;

    private OrderStatus orderStatus;

    private int totalItem;

    private int totalQuantity;

    private PaymentStatus paymentStatus = PaymentStatus.PENDING;

    private LocalDateTime orderTime = LocalDateTime.now();

    private LocalDateTime deliveryTime = orderTime.plusDays(7);
}
