package com.sazzler.ecommerce.sazzler_api_def.product_service;

import com.sazzler.ecommerce.sazzler_api_def.product_service.DTO.ProductRequest;
import com.sazzler.ecommerce.sazzler_api_def.product_service.DTO.ProductResponse;

import java.util.List;

/**
 * Shared contract for the Product Service API.
 *
 * This is a plain Java interface with no framework dependencies.
 * Consuming services (e.g. Order Service) implement this as a Feign client
 * by adding @FeignClient on their own adapter class — the HTTP plumbing
 * lives there, not here.
 */
public interface ProductAPIService {

    String createProduct(ProductRequest request);

    List<ProductResponse> getProducts();

    ProductResponse getProductById(String id);

    String updateProduct(String id, ProductRequest request);

    void deleteProduct(String id);
}