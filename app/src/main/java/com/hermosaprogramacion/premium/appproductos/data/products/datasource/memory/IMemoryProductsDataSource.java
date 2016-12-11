package com.hermosaprogramacion.premium.appproductos.data.products.datasource.memory;

import com.hermosaprogramacion.premium.appproductos.products.domain.model.Product;
import com.hermosaprogramacion.premium.appproductos.products.domain.criteria.ProductCriteria;

import java.util.List;

/**
 * Interfaz para fuente de datos en memoria
 */
public interface IMemoryProductsDataSource {
    List<Product> find(ProductCriteria criteria);

    void save(Product product);

    void deleteAll();

    boolean mapIsNull();
}
