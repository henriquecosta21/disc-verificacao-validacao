import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ShoppingCartTest {

	private Product p1;
	private Product p2;
	private Product p3;
	private Product p4;
	private ShoppingCart cart;
	
	@BeforeEach
	public void start() {
		p1 = new Product("Cadeira Gamer", 500.00);
		p2 = new Product("Notebook Avell Pro", 7000.00);
		p3 = new Product("Monitor full HD AOC", 800.00);
		p4 = new Product("Teclado Mecânico HyperX", 200.00);
		cart = new ShoppingCart();
		cart.addItem(p1);
		cart.addItem(p2);
		cart.addItem(p3);
	}
	
	@Test
	public void shouldCreateAnEmptyCart() {
		ShoppingCart newCart = new ShoppingCart();
		assertEquals(0, newCart.getItemCount());
	}
	
	@Test
	public void shouldHasAnEmptyCart() {
		cart.empty();
		assertEquals(0, cart.getItemCount());
	}
	
	@Test
	public void shouldAddAnItem() {
		cart.addItem(p4);
		assertEquals(4, cart.getItemCount());
	}
	
	@Test
	public void shouldGetBalance() {
		assertEquals(8300.00, cart.getBalance());
	}
	
	@Test
	public void shouldRemoveProductAndDecrementCount() throws ProductNotFoundException {
		cart.removeItem(p3);
		assertEquals(2, cart.getItemCount());
	}
	
	@Test
	public void ShouldLaunchAnException() {
		assertThrows(ProductNotFoundException.class, new Executable() {
			public void execute() throws Throwable {
				cart.removeItem(p4);
			}
		});
	}
}
