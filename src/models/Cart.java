package models;

import java.util.List;

public class Cart {

	private Long cartId;
	private Long quantity;
	private Long cartTotal;

	// Mapping entity @ 1-M
	private List<Product> products = null;

	/**
	 * @param cartId
	 * @param cartName
	 * @param cartTotal
	 * @param products
	 */
	public Cart(Long cartId, Long quantity, Long cartTotal, List<Product> products) {
		this.cartId = cartId;
		this.quantity = quantity;
		this.cartTotal = cartTotal;
		this.products = products;
	}

	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
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
