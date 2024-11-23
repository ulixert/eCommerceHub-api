package com.ulixert.ecommercehub.dto.CartDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    private Long productId;
    private String productName;
    private String image;
    private Integer quantity;
    private Long price;
}