/*
 Q1) 1.  Define Product class with name, price,  and sort it price wise (use comparable interface) .

 */
package LabCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Product implements Comparable<Product>
{
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    // Implementation of compareTo method for sorting
    @Override
    public int compareTo(Product otherProduct) 
    {
        return Double.compare(this.price, otherProduct.price);
    }

    // toString method to display product information
    @Override
    public String toString() 
    {
        return "Product{name='" + name + "', price=" + price + '}';
    }
}
public class Productsortprice 
{
	 public static void main(String[] args)
	 {
	        Scanner scanner = new Scanner(System.in);

	        // Create a list of products
	        List<Product> products = new ArrayList<>();

	        // Get user input for products
	        System.out.println("Enter details for products:");

	        while (true) 
	        {
	            System.out.print("Enter product name (or 'stop' to finish): ");//using stop we can finish the adding products into the product list.
	            String name = scanner.nextLine();

	            if (name.equalsIgnoreCase("stop"))
	            {
	                break;
	            }

	            System.out.print("Enter product price: ");
	            double price = scanner.nextDouble();
	            scanner.nextLine(); // Consume the newline character

	            // Create Product object and add to the list
	            products.add(new Product(name, price));
	        }
	        // Print unsorted list
	        System.out.println("\nUnsorted Products:");
	        for (Product product : products) 
	        {
	            System.out.println(product);
	        }

	        // Sort the list using Collections.sort() method
	        Collections.sort(products);

	        // Print sorted list
	        System.out.println("\nSorted Products (by price):");
	        for (Product product : products) 
	        {
	            System.out.println(product);
	        }

	        // Close the scanner
	        scanner.close();
	    }
}


