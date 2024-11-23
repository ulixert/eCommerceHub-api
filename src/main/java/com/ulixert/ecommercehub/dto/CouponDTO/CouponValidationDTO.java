package com.ulixert.ecommercehub.dto.CouponDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponValidationDTO {

    @NotBlank(message = "Coupon code is required")
    private String code;
}