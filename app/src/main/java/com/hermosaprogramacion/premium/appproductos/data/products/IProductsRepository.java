package com.hermosaprogramacion.premium.appproductos.data.products;

import com.hermosaprogramacion.premium.appproductos.products.domain.model.Product;
import com.hermosaprogramacion.premium.appproductos.products.domain.criteria.ProductCriteria;

import java.util.List;

/**
 * Repositorio de productos
 */
public interface IProductsRepository {
    interface GetProductsCallback {

        void onProductsLoaded(List<Product> products);

        void onDataNotAvailable(String error);
    }

    void getProducts(GetProductsCallback callback, ProductCriteria criteria);

    void refreshProducts();
}
