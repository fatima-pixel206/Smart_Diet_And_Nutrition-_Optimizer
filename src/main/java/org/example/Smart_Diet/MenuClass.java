package org.example.Smart_Diet;

import java.util.Scanner;

public class MenuClass {
    public static void main(String[] args) {
        // objex
        Scanner sc = new Scanner(System.in);
        NodeAndLinkedL  menu = new NodeAndLinkedL();
      //  System.out.println("ALL ITEMS ... ..");
        // display all

        // fruits
        menu.addAtTail("Apple", "fruit", 13.8, 150, 0.2, 52.0, 0.3);
        menu.addAtTail("Banana", "fruit", 22.8, 20, 0.3, 89.0, 1.1);
        menu.addAtTail("Orange", "fruit", 11.8, 40, 0.1, 47.0, 0.9);
        menu.addAtTail("Guava", "fruit", 14.3, 30, 0.9, 68.0, 2.6);
        menu.addAtTail("Mango", "fruit", 15.0, 100, 0.4, 60.0, 0.8);
        menu.addAtTail("Grapes", "fruit", 18.1, 120, 0.2, 69.0, 0.7);
        menu.addAtTail("Papaya", "fruit", 10.8, 60, 0.3, 43.0, 0.5);
        menu.addAtTail("Greps", "fruit", 22.8, 200, 0.9, 68.0, 0.7);
        menu.addAtTail("Watermelon", "fruit", 7.6, 200, 0.2, 30.0, 0.6);
// vegetables
        menu.addAtTail("Potato", "veg", 17.5, 30, 0.1, 77.0, 2.0);
        menu.addAtTail("Onion", "veg", 9.3, 40, 0.1, 40.0, 1.1);
        menu.addAtTail("Spinach", "veg", 3.6, 20, 0.4, 23.0, 2.9);
        menu.addAtTail("Carrot", "veg", 9.6, 50, 0.2, 41.0, 0.9);
        menu.addAtTail("Beans", "veg",7.0,70,0.2,31.0,1.8 );
        menu.addAtTail("Tomato", "veg", 3.9, 40, 0.2, 18.0, 0.9);
        menu.addAtTail("Peas", "veg", 14.5, 80, 0.4, 81.0, 5.4);
        menu.addAtTail("Cauliflower", "veg", 5.0, 60, 0.3, 25.0, 1.9);
        menu.addAtTail("Cucumber", "veg", 3.6, 30, 0.1, 15.0, 0.7);
        menu.addAtTail("Corn", "veg",18.7, 50, 1.4, 86.0, 3.2);
        // animal
        menu.addAtTail("Chicken", "meats", 0.0, 600, 3.6, 165.0, 31.0);
        menu.addAtTail("Beef", "meats", 0.0, 900, 15.0, 250.0, 26.0);
        menu.addAtTail("Mutton", "meats", 0.0, 1400, 21.0, 294.0, 25.0);
        menu.addAtTail("Fish", "meats", 0.0, 500, 2.0, 97.0, 19.0);
        menu.addAtTail("Salmon", "meats", 0.0, 2500, 13.0, 208.0, 20.0);
        menu.addAtTail("Egg", "meats", 1.1, 50, 11.0, 155.0, 13.0);
        menu.addAtTail("Prawns", "meats", 0.0, 1200, 1.0, 99.0, 24.0);
        menu.addAtTail("Turkey", "meats", 0.0, 2000, 7.0, 189.0, 29.0);
        // dairy
        menu.addAtTail("Milk (1L)", "dairy", 4.8, 180, 3.3, 64.0, 3.4);
        menu.addAtTail("Yogurt", "dairy", 4.7, 50, 3.3, 61.0, 3.5);
        menu.addAtTail("Cheese", "dairy", 1.3, 400, 33.0, 402.0, 25.0);
        menu.addAtTail("Butter", "dairy", 0.1, 300, 81.0, 717.0, 0.9);
        menu.addAtTail("Cottage Cheese", "dairy", 3.4, 250, 4.3, 98.0, 11.0);
        menu.addAtTail("Cream", "dairy", 2.8, 200, 35.0, 345.0, 2.1);
        menu.addAtTail("Desi Ghee", "dairy", 0.0, 1800, 99.0, 900.0, 0.0);
        menu.addAtTail("Milk Powder", "dairy", 38.0, 500, 26.0, 496.0, 26.0);
        // dry
       ;menu.addAtTail("Almonds", "dry fruits", 21.7, 1500, 49.9, 579.0, 21.2);
        menu.addAtTail("Walnuts", "dry fruits", 13.7, 2000, 65.2, 654.0, 15.2);
        menu.addAtTail("Cashews", "dry fruits", 30.2, 1800, 43.8, 553.0, 18.2);
        menu.addAtTail("Pistachios", "dry fruits", 27.2, 2200, 45.4, 562.0, 20.2);
        menu.addAtTail("Peanuts", "dry fruits", 16.1, 400, 49.2, 567.0, 25.8);
        menu.addAtTail("Dates", "dry fruits", 75.0, 600, 0.4, 282.0, 2.4);
        menu.addAtTail("Raisins", "dry fruits", 79.0, 800, 0.5, 299.0, 3.1);
        menu.addAtTail("Dried Apricots", "dry fruits", 63.0, 1000, 0.5, 241.0, 3.4);
        // --- Data Adding End ---
            menu.searachByBudget(1000);
        int choice;

        do {
            System.out.println("\n========= SMART DIET MENU =========");
            System.out.println(" Enter 1. for View all food items");

            System.out.println(" Enter 2. Search by category (veg, fruit, meats,dairy,and dry fruits.)");
            System.out.println(" Enter 3. Check complete details of any food (name search)");
            System.out.println(" Enter  4. for your budget: ");
            System.out.println(" Enter 5. for get smart suggestions");
            System.out.println(" Enter 6. for Exit");
            System.out.print("   State your choice (1-6): ");

            choice = sc.nextInt();
            sc.nextLine(); // Buffer clear karne ke liye

            switch (choice) {
                case 1:
                    menu.displayAll();
                    break;
                case 2:
                    System.out.print("Enter the category name: ");
                    String cat = sc.nextLine();

                    menu.displayFilter(cat);
                    break;
                case 3:
                    System.out.print("Enter the name of the food: ");
                    String name = sc.nextLine();
                    menu.searchByName(name);
                    break;
                case 4:
                    System.out.print("Enter your budget: ");
                    int userBudget = sc.nextInt();
                    menu.searachByBudget(userBudget);
                    break;
                case 5:
                    menu.smartSuggest();
                    break;
                case 6:
                    System.out.println("The program is closing... Allah Hafiz!");
                    break;
                default:
                    System.out.println("Wrong choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    }

