package com.ulixert.ecommercehub.mapper;

import com.ulixert.ecommercehub.dto.CouponDTO.CouponDTO;
import com.ulixert.ecommercehub.model.Coupon;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CouponMapper {

    CouponDTO toCouponDTO(Coupon coupon);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Coupon toCoupon(CouponDTO couponDTO);
}