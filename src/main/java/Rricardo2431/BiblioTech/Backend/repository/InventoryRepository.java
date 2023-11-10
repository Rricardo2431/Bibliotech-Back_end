package Rricardo2431.BiblioTech.Backend.repository;

import Rricardo2431.BiblioTech.Backend.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
