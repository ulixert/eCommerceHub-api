package com.ulixert.ecommercehub.repository;

import com.ulixert.ecommercehub.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
