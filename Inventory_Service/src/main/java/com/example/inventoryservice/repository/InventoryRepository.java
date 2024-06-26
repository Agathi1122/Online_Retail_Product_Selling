package com.example.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventoryservice.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}
