package Rricardo2431.BiblioTech.Backend.usercase;


import Rricardo2431.BiblioTech.Backend.models.Inventory;
import Rricardo2431.BiblioTech.Backend.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository repository;


    public List<Inventory> getAll() {
        return repository.findAll();
    }


    public Inventory getById(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("Inventory not found"+id));
    }


    public Inventory create(Inventory inventory) {
      return repository.save(inventory);
    }

    public Inventory update(Long id, Inventory inventory) {

       Inventory inventoryFound = getById(id);
       inventoryFound.setDate(inventory.getDate());

       return repository.save(inventoryFound);

            }
}
