package models;

public class Product {
	private Long productId;
	private String productName;
	private String productInfo;
	private Long productPrice;

	private Long productPriceUnit;

	/**
	 * @param productId
	 * @param productName
	 * @param productInfo
	 * @param productPrice
	 * @param productPriceUnit
	 */
	public Product(Long productId, String productName, String productInfo, Long productPrice, Long productPriceUnit) {
		this.productId = productId;
		this.productName = productName;
		this.productInfo = productInfo;
		this.productPrice = productPrice;
		this.productPriceUnit = productPriceUnit;
	}

	/**
	 * 
	 */
	public Product() {
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public Long getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}

	public Long getProductPriceUnit() {
		return productPriceUnit;
	}

	public void setProductPriceUnit(Long productPriceUnit) {
		this.productPriceUnit = productPriceUnit;
	}

}
