package models;

import java.util.List;

public class WishList {
	private Long wishListId;
	private String wishName;
	private Long wishListTotal;
	private int expirationPeriod;
	// Mapping entity @ 1-M
	private List<Product> products = null;

}
