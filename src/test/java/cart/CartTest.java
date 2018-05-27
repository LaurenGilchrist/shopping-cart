package cart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CartTest {

	@Test
	public void ShouldAddAnItemToTheCartForTotalPriceOF25() {
		Cart underTest = new Cart();
		Item shoes = new Item("shoes", 25, 1);
		underTest.addItem(shoes);
		int check = underTest.totalPrice();
		assertEquals(25, check);
		
	}
	@Test
	public void ShouldAddAnItemWithQuantityOf2ToTheCartForTotalPriceOf50() {
		Cart underTest = new Cart();
		Item shoes = new Item("shoes", 25, 2);
		underTest.addItem(shoes);
		int check = underTest.totalPrice();
		assertEquals(50, check);
			
	}
	@Test
	public void ShouldAddTwoItemsToTheCartForTotalPriceOf35() {
		Cart underTest = new Cart();
		Item shoes = new Item("shoes", 25, 1);
		underTest.addItem(shoes);
		Item shirt = new Item("shirt", 10, 1);
		underTest.addItem(shirt);
		int check = underTest.totalPrice();
		assertEquals(35, check);
		
	}
	@Test
	public void ShouldHaveATotalPriceOf50AfterRemovingAnItemByName() {
		Cart underTest = new Cart();
	   underTest.addItem(new Item("converse", 50,1));
	   underTest.addItem(new Item("sketchers", 50,1));
	   underTest.removeItem("sketchers");
	   int check = underTest.totalPrice();
	   assertEquals(50, check);
		
	}
		
}
