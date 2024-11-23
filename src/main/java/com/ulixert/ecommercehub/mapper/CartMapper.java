package com.ulixert.ecommercehub.mapper;

import com.ulixert.ecommercehub.dto.CartDTO.CartDTO;
import com.ulixert.ecommercehub.model.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {CartItemMapper.class})
public interface CartMapper {

    @Mapping(source = "cartItems", target = "items")
    CartDTO toCartDTO(Cart cart);
}