package com.ulixert.ecommercehub.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code;

    @Column(nullable = false)
    private Integer discountPercentage;

    @Column(nullable = false)
    private LocalDate validityStartDate;

    @Column(nullable = false)
    private LocalDate validityEndDate;

    @Column(nullable = false)
    private BigDecimal minimumOrderPrice;

    @Column(nullable = false)
    @Builder.Default
    private boolean isActive = true;

    @ManyToMany(mappedBy = "usedCoupons", fetch = FetchType.LAZY)
    private Set<User> usedByUsers = new HashSet<>();
}
