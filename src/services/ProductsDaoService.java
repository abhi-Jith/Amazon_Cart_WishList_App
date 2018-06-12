package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBUtil;
import models.Product;

public class ProductsDaoService {
	// public Long productId;
	// public String productName;
	// public String productInfo;
	// public Long productPrice;
	// public Long productPriceUnit;

	Connection connection = DBUtil.conn;
	List<Product> productList = null;
	int count = 0;

	public List<Product> getProducts() {
		System.out.println("in productsdao");

		if (connection != null) {
			try {
				PreparedStatement preparedStatement = connection.prepareStatement("select * from products");
				ResultSet resultset = preparedStatement.executeQuery();

				productList = new ArrayList<Product>();
				if (resultset != null) {

					while (resultset.next()) {
						Product product = new Product();
						product.setProductId((resultset.getLong("productId")));
						product.setProductName((resultset.getString("productName")));
						product.setProductInfo((resultset.getString("productInfo")));
						product.setProductPrice((resultset.getLong("productPrice")));
						product.setProductPriceUnit((resultset.getString("productPriceUnit")));

						productList.add(product);
						count++;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (connection == null) {
			connection = DBUtil.getConnection();
			getProducts();
		}
		System.out.println("the count is: " + count);
		return productList;
	}

}
