package com.hermosaprogramacion.premium.appproductos.data.products.datasource.cloud;

import com.hermosaprogramacion.premium.appproductos.products.domain.model.Product;
import com.hermosaprogramacion.premium.appproductos.products.domain.criteria.ProductCriteria;

import java.util.List;

/**
 * Interfaz de comunicación con el repositorio para la fuente de datos remota
 */
public interface ICloudProductsDataSource {

    interface ProductServiceCallback {

        void onLoaded(List<Product> products);

        void onError(String error);

    }

    void getProducts(ProductServiceCallback callback, ProductCriteria criteria);

}
