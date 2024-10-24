## Q.Create a class named Pizza that stores details about a pizza. It should contain the following:

Instance Variables:
String pizzaSize — to store the size of the pizza (small, medium, or large)
int cheese — the number of cheese toppings
int pepperoni — the number of pepperoni toppings
int mushroom — the number of mushroom toppings

Member Methods:
Constructor — to initialise all the instance variables
CalculateCost() — A public method that returns a double value, that is, the cost of the pizza.
Pizza cost is calculated as follows:

Small: Rs.500 + Rs.25 per topping
Medium: Rs.650 + Rs.25 per topping
Large: Rs.800 + Rs.25 per topping
PizzaDescription() — A public method that returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by CalculateCost().

## Answer :

public class Pizza
{
    String pizzaSize;
    int cheese; 
    int pepperoni;
    int mushroom;
    
    public Pizza(String size, 
                    int tc, 
                    int tp, 
                    int tm) {
        pizzaSize = size;
        cheese = tc;
        pepperoni = tp;
        mushroom = tm;
    }
    
    public double CalculateCost()   {
        double totalCost = 0;
        double topCost = 25 * (cheese + pepperoni + mushroom);
        
        if (pizzaSize == "small")
            totalCost = 500 + topCost;
        else if(pizzaSize == "medium")
            totalCost = 650 + topCost;
        else
            totalCost = 800 + topCost;
            
        return totalCost;
    }
    
    public String PizzaDescription()    {
        double cost = CalculateCost();
        String desc = "Size: " + pizzaSize 
        + " Cheese: " + cheese 
        + " Pepperoni: " + pepperoni 
        + " Mushroom: " + mushroom 
        + " Cost: Rs. " + cost;
        
        return desc;
    }
    
    public static void main(String args[])  {
        Pizza p = new Pizza("medium", 15, 5, 10);
        String desc = p.PizzaDescription();
        System.out.println(desc);
    }
    
    
}

# Output
![image](https://github.com/user-attachments/assets/e97f66d0-67d8-4f64-9a19-1764a5fabafd)

