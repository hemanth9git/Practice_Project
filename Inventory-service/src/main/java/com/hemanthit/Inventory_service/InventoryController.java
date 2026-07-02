package com.hemanthit.Inventory_service;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("inventory")
public class InventoryController {
    InventoryRepository repository;

    @PostMapping("saveInventory")
    public ResponseEntity<Inventory> saveInventory(@RequestBody Inventory inventory){

        return new ResponseEntity<>(repository.save(inventory), HttpStatus.CREATED);
    }

    @GetMapping("getItem/{itemName}")
    public Boolean checkAvailability(@PathVariable String itemName){

        Inventory inventory=repository.findByItemName(itemName);
        if(inventory==null){
            return false;
        }else{
            return true;
        }

    }

    @GetMapping("inventoryItems")
    public ResponseEntity<List<Inventory>> getInventory(){
        List<Inventory> list =repository.findAll();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
