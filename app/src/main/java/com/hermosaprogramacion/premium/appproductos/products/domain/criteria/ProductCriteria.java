package com.hermosaprogramacion.premium.appproductos.products.domain.criteria;

import com.hermosaprogramacion.premium.appproductos.products.domain.model.Product;

import java.util.List;

/**
 * Patrón de especificación para los productos
 */
public interface ProductCriteria {
    List<Product> match(List<Product> products);
}
