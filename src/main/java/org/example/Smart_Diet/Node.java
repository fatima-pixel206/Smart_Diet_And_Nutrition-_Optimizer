package org.example.Smart_Diet;

public class Node {
    String foodName;
    int price;
    double fats;
    double calories;
    double proteins;

    Node next;

    public Node(String foodName, int price, double fats, double calories, double proteins) {
        this.foodName = foodName;
        this.price = price;
        this.fats = fats;
        this.calories = calories;
        this.proteins = proteins;

    }
}
