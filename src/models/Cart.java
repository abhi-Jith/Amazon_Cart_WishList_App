package models;

import java.util.List;

public class Cart {

	private Long cartId;
	private Long cartName;
	private Long cartTotal;
	
	// Mapping entity @ 1-M
	private List<Product> products = null;

	/**
	 * @param cartId
	 * @param cartName
	 * @param cartTotal
	 * @param products
	 */
	public Cart(Long cartId, Long cartName, Long cartTotal, List<Product> products) {
		this.cartId = cartId;
		this.cartName = cartName;
		this.cartTotal = cartTotal;
		this.products = products;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Long getCartName() {
		return cartName;
	}

	public void setCartName(Long cartName) {
		this.cartName = cartName;
	}

	public Long getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Long cartTotal) {
		this.cartTotal = cartTotal;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	

}
