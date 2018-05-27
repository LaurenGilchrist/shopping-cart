package cart;

public class Item {

	private String name;
	private int quantity;
	private int price;

	public Item(String name, int price, int quantity) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getQuantity() {
		
         return quantity;
	}

	public int getPrice() {
		
		return price;
	}

	public Object getName() {
		
		return name;
	}

}
