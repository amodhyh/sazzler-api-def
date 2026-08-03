package com.sazzler.ecommerce.sazzler_api_def.product_service.DTO;
import java.math.BigDecimal;

public record ProductRequest(String name,String id,BigDecimal price,int quantity) {
}
