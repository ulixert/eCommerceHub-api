package com.ulixert.ecommercehub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "coupons")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Coupon code is required")
    @Column(nullable = false, unique = true)
    private String code;

    @NotNull(message = "Discount percentage is required")
    @Min(value = 0, message = "Discount percentage must be greater than or equal to 0")
    @Max(value = 100, message = "Discount percentage must be less than or equal to 100")
    @Column(nullable = false)
    private Integer discountPercentage;

    @NotNull(message = "Expiration time is required")
    @FutureOrPresent(message = "Expiration time must be in the present or future")
    @Column(nullable = false)
    private LocalDateTime expirationDate;

    @Column(nullable = false)
    private Boolean isActive = true;

    @CreationTimestamp
    private LocalDateTime createdAt;
}