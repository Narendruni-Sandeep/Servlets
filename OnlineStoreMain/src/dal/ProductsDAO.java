package dal;

import java.util.List;

import models.Product;

public interface ProductsDAO {

	public List<Product> getProducts();

	public List<Product> getProductsByPage(int page, int pageSize, int offset);
}
