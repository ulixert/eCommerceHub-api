package com.ulixert.ecommercehub.dto.CouponDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponDTO {

    private Long id;
    private String code;
    private Integer discountPercentage;
    private LocalDateTime expirationTime;
    private Boolean isActive;
}