# api-definition — Remaining Work

**Overall Status: Auth, Product, and Order DTOs are complete. The api-definition shared contracts are now fully expanded.**

---

## 1. ~~OrderDTO — Too Minimal, Needs Full Redesign~~ (RESOLVED)

Current definition:
```java
public record OrderDTO(String name, int id) {}
```

This does not represent a real order. The `id` should be a `String` (UUID), and the DTO needs far more fields.

**Recommended full OrderDTO:**
```java
public record OrderDTO(
    String orderId,
    String userId,
    List<OrderItemDTO> items,
    BigDecimal totalPrice,
    OrderStatus status,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {}
```

---

## 2. ~~OrderItemDTO — Does Not Exist~~ (RESOLVED)

Orders contain line items. There is no DTO for individual items.

**What to create (`order_service/DTO/OrderItemDTO.java`):**
```java
public record OrderItemDTO(
    Integer productId,
    String productName,
    int quantity,
    BigDecimal unitPrice
) {}
```

---

## 3. ~~OrderRequest — Does Not Exist~~ (RESOLVED)

The Order Service needs a DTO for the incoming create-order request body.

**What to create (`order_service/DTO/OrderRequest.java`):**
```java
public record OrderRequest(
    List<OrderItemRequest> items
) {}

// And:
public record OrderItemRequest(
    Integer productId,
    int quantity
) {}
```

---

## 4. ~~OrderResponse — Does Not Exist~~ (RESOLVED)

A clean response DTO for order creation/retrieval that omits internal fields.

**What to create (`order_service/DTO/OrderResponse.java`):**
```java
public record OrderResponse(
    String orderId,
    OrderStatus status,
    BigDecimal totalPrice,
    LocalDateTime createdAt
) {}
```

---

## 5. ~~OrderStatus Enum — Does Not Exist~~ (RESOLVED)

**What to create (`order_service/DTO/OrderStatus.java`):**
```java
public enum OrderStatus {
    PENDING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
```

---

## 6. ~~Order-Related Exceptions — None Exist~~ (RESOLVED)

The auth and product packages both have custom exception classes. The order package has none.

**What to create:**

| Class | When thrown |
|---|---|
| `OrderNotFoundException` | Order ID does not exist |
| `OrderNotOwnedException` | User tries to access another user's order |
| `OrderCancellationException` | Trying to cancel a non-PENDING order |
| `InsufficientProductDataException` | Product not in local cache when creating an order |

---

## 7. ~~ProductEvent — Missing `eventType` Field~~ (RESOLVED)

`ProductEvent` has been updated to include `eventType`, and its `productId` was changed to `Integer`. The Order Service consumer is fully implemented to use this.

---

## 8. ProductAPIService Interface — Verify Completeness

`ProductAPIService.java` exists but appears to be empty or minimal. If this is meant to be a Feign client interface or a shared contract, it needs method signatures for all Product Service endpoints that other services will call.

**What to verify/add:**
```java
public interface ProductAPIService {
    ResponseEntity<String> createProduct(ProductRequest request);
    ResponseEntity<List<ProductResponse>> getProducts();
    ResponseEntity<ProductResponse> getProductById(String id);
}
```
