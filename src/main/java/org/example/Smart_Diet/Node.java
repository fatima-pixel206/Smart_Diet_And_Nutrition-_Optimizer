package org.example.Smart_Diet;

public class Node {
    String foodName;
    String category;

    int price;
    double fats;
    double calories;
    double crabs;
    double proteins;

    Node next;

    public Node(String foodName,String category,double crabs, int price, double fats, double calories, double proteins) {
        this.foodName = foodName;
        this.category=category;
        this.price = price;
        this.fats = fats;
        this.calories = calories;
        this.crabs=crabs;
        this.proteins = proteins;

    }
}
