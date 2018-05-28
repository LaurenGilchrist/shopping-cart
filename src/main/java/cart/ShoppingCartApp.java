package cart;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Item>shoppingCart = new ArrayList<Item>();
		shoppingCart.addItem(converse);
		shoppingCart.addItem(sketchers);
		shoppingCart.addItem(shirt);
		shoppingCart.addItem(jeans);
		
		
		System.out.println("Welcome to Lauren's Online Shop");
		
		System.out.println("What would you like to order today? (yes/no)");
		String continueShopping = input.nextLine();
		do {
			System.out.println("What items would you like?");
			String itemName = input.nextLine();
			System.out.println("Enter the price of the item");
			int price = input.nextInt();
			System.out.println("How many would you like to buy?");
			int quantity= input.nextInt();
			
			Item item = new Item(itemName, price, quantity);
			cart.addItem(item);
			
			System.out.println("These are your items in the cart");
			cart.showCartItems();
			
			System.out.println("Would you like to continue shopping? (add/no/remove)");
			continueShopping = input.nextLine();
			
			if(continueShopping.equals("remove")) {
				System.out.println("What item would you like to remove");
				itemName = input.nextLine();
				cart.removeItem(itemName);
				System.out.println("Your updated cart total is " + cart.totalPrice());
				System.out.println("Would you like to make anymore changes? (add/no/remove)");
				continueShopping = input.nextLine();
				
			}
			
		}while(!continueShopping.equals("no"));
		
		System.out.println("Thank you for shoppping at Lauren's Online Shop");
		System.out.println("Your cart total for today is: " + cart.totalPrice());
		
		input.close();	
			
			
		
			
	}		
}
