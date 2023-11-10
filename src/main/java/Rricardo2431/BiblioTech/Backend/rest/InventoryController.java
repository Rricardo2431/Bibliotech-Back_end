package Rricardo2431.BiblioTech.Backend.rest;


import Rricardo2431.BiblioTech.Backend.models.Inventory;
import Rricardo2431.BiblioTech.Backend.usercase.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory")
public class InventoryController {

  private final InventoryService service;

   @GetMapping
    ResponseEntity <List<Inventory>> getAll(){
       return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
   }

@GetMapping("/{id}")
    ResponseEntity<Inventory> getById(@PathVariable Long id){
       return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
}

@PostMapping
    ResponseEntity<Inventory> create(@RequestBody Inventory inventory){
       return new ResponseEntity<>(service.create(inventory), HttpStatus.CREATED);
}

@PutMapping("/{id}")
    ResponseEntity<Inventory> findById(@PathVariable Long id, @RequestBody Inventory inventory){
       return new ResponseEntity<>(service.update(id, inventory), HttpStatus.OK);
}

}
