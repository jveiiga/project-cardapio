package com.example.cardapio.food;

import javax.persistence.*;

@Table(name = "foods")
@Entity(name = "foods")
public class Food {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String image;

    private Integer price;

    public Food() {
        
    }

    public Food(FoodRequestDTO FoodRequestDTO) {
        this.title = FoodRequestDTO.getTitle();
        this.image = FoodRequestDTO.getImage();
        this.price = FoodRequestDTO.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
