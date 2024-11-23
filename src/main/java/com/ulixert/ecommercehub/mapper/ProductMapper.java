package com.ulixert.ecommercehub.mapper;

import com.ulixert.ecommercehub.dto.ProductDTO.ProductCreateDTO;
import com.ulixert.ecommercehub.dto.ProductDTO.ProductResponseDTO;
import com.ulixert.ecommercehub.dto.ProductDTO.ProductUpdateDTO;
import com.ulixert.ecommercehub.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponseDTO toProductResponseDTO(Product product);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Product toProduct(ProductCreateDTO productCreateDTO);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    void updateProductFromDTO(ProductUpdateDTO productUpdateDTO, @MappingTarget Product product);
}