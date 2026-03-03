package com.uncledavecode.inventory_service.repositories;

import com.uncledavecode.inventory_service.model.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
