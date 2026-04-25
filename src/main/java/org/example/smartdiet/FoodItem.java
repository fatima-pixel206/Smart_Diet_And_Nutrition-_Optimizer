package org.example.smartdiet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {
      private String foodName;
      private double price;
      private double protein;
      private double fats;
      private double calories;

}
