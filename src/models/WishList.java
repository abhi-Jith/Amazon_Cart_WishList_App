package models;

import java.util.List;

public class WishList {
	private Long wishListId;
	private int quantity;
	private Long wishListTotal;
	private int expirationPeriod;
	// Mapping entity @ 1-M
	private List<Product> products = null;

	/**
	 * @param wishListId
	 * @param quantity
	 * @param wishListTotal
	 * @param expirationPeriod
	 * @param products
	 */
	public WishList(Long wishListId, int quantity, Long wishListTotal, int expirationPeriod, List<Product> products) {
		this.wishListId = wishListId;
		this.quantity = quantity;
		this.wishListTotal = wishListTotal;
		this.expirationPeriod = expirationPeriod;
		this.products = products;
	}

	// Getters and setters
	public Long getWishListId() {
		return wishListId;
	}

	public void setWishListId(Long wishListId) {
		this.wishListId = wishListId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getWishListTotal() {
		return wishListTotal;
	}

	public void setWishListTotal(Long wishListTotal) {
		this.wishListTotal = wishListTotal;
	}

	public int getExpirationPeriod() {
		return expirationPeriod;
	}

	public void setExpirationPeriod(int expirationPeriod) {
		this.expirationPeriod = expirationPeriod;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
