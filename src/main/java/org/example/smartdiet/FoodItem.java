package org.example.smartdiet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.AllArgsConstructor;;
import lombok.Data;
import lombok.NoArgsConstructor;
        @Data
        @AllArgsConstructor

@SpringBootApplication
public class FoodItem {

    public static void main(String[] args) {
        SpringApplication.run(FoodItem.class, args);
    }

}
