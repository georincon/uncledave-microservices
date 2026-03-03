package com.uncledavecode.inventory_service.services;

import com.uncledavecode.inventory_service.model.dtos.BaseResponse;
import com.uncledavecode.inventory_service.model.dtos.OrderItemRequest;
import com.uncledavecode.inventory_service.repositories.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(String sku) {

    }

    public BaseResponse areInStock(List<OrderItemRequest> orderItems) {
    }
}
