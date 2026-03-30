import java.util.Scanner;

// Topping class to store topping details
class Topping {
    String name;
    double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Pizza class to build a custom pizza
class Pizza {
    String size;
    double basePrice;
    Topping[] toppings;
    int toppingCount;

    public Pizza(String size, double basePrice) {
        this.size = size;
        this.basePrice = basePrice;
        this.toppings = new Topping[10]; // A pizza can have a maximum of 10 toppings
        this.toppingCount = 0;
    }

    // Method to add a topping to the pizza
    public void addTopping(Topping topping) {
        // Your code here:
       
        
        
        
    }

    // Method to calculate the total cost
    public double calculateTotalCost() {
        double totalCost = this.basePrice;
        // Your code here: 
        
        
        
        
        return totalCost;
    }

    // Method to display the final pizza order
    public void displayPizza() {
        System.out.println("--- Your Pizza Order ---");
        System.out.println("Size: " + this.size);
        System.out.println("Base Price: $" + this.basePrice);
        System.out.println("Toppings:");
        for (int i = 0; i < toppingCount; i++) {
            System.out.println("- " + toppings[i].name + ": $" + toppings[i].price);
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
        
}

class PizzaBuilder {
    public static void main(String[] args) {
        // Pre-defined list of available toppings
        Topping[] availableToppings = {
            new Topping("Cheese", 1.00),
            new Topping("Pepperoni", 1.50),
            new Topping("Mushrooms", 0.75),
            new Topping("Olives", 0.75),
            new Topping("Onions", 0.50)
        };

        Scanner scanner = new Scanner(System.in);

        // Read pizza details from user
        String size = scanner.nextLine();
        double basePrice = scanner.nextDouble();
        int numOfToppings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a Pizza object
        Pizza myPizza = new Pizza(size, basePrice);

        // Read topping names and add them to the pizza
        for (int i = 0; i < numOfToppings; i++) {
            String toppingName = scanner.nextLine();
            // Your code here:
            
            
            
            
            
        }

        // Display the final order
        myPizza.displayPizza();

        scanner.close();
    }
}