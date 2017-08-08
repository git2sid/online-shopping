package shoppingbackend.dao;

import java.util.List;

import shoppingbackend.dto.Product;

public interface ProductDAO {
Product get(int productID);
List<Product> list();
boolean add(Product product);
boolean update(Product product);
boolean delete(Product product);

//business logics

List<Product> listActiveProducts();
List<Product> listActiveProductsByCategory(int categoryId);
List<Product> getLatestActiveProducts(int count);

}
