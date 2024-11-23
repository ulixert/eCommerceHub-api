package com.ulixert.ecommercehub.mapper;

import com.ulixert.ecommercehub.dto.OrderDTO.OrderDTO;
import com.ulixert.ecommercehub.model.Order;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {OrderItemMapper.class})
public interface OrderMapper {

    @Mapping(source = "orderItems", target = "orderItems")
    OrderDTO toOrderDTO(Order order);

    @InheritInverseConfiguration
    Order toOrder(OrderDTO orderDTO);
}