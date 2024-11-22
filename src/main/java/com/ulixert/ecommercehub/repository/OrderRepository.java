package com.ulixert.ecommercehub.repository;

import com.ulixert.ecommercehub.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
