package models;

import java.util.List;

public class User {
	private Long userId;
	private String userName;
	private String password;
	private String emailId;
	// Mapping entity @ 1-1
	private Cart cart;
	// Mapping entity @ 1-M
	private List<WishList> wishLists = null;

	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param emailId
	 * @param cart
	 * @param wishLists
	 */
	public User(Long userId, String userName, String password, String emailId, Cart cart, List<WishList> wishLists) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.cart = cart;
		this.wishLists = wishLists;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<WishList> getWishLists() {
		return wishLists;
	}

	public void setWishLists(List<WishList> wishLists) {
		this.wishLists = wishLists;
	}

}
