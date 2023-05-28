package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("food")
public class FoodController {
    
    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("/{foodId}")
    public ResponseEntity<?> deleteFood(@PathVariable Long foodId) {
         // Verificar se o alimento com o ID fornecido existe no banco de dados
         Optional<Food> optionalFood = repository.findById(foodId);
         if(!optionalFood.isPresent()) {
            return ResponseEntity.notFound().build();
         }

         repository.deleteById((foodId));

         return ResponseEntity.noContent().build();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PatchMapping("/{foodId}")
    public ResponseEntity<Food> editFood(@PathVariable Long foodId, @RequestBody Map<String, Object> patchData) {
        // Verificar se o alimento com o ID fornecido existe no banco de dados
        if(!repository.existsById(foodId)) {
            return ResponseEntity.notFound().build();
        }

        Food food = repository.findById(foodId).orElse(null);
        if(food == null) {
            return ResponseEntity.notFound().build();
        }

        if(patchData.containsKey("title")) {
            food.setTitle((String) patchData.get("title"));
        }

        if(patchData.containsKey("image")) {
            food.setImage((String) patchData.get("image"));
        }

        if(patchData.containsKey("price")) {
            food.setPrice((Integer) patchData.get("price"));
        }

        Food editFood = repository.save(food);

        return ResponseEntity.ok(editFood);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public Food saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        Food saveFood = repository.save(foodData);

        return saveFood;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).collect(Collectors.toList());
        return foodList;
    }
}
