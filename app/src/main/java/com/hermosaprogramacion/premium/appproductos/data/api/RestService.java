package com.hermosaprogramacion.premium.appproductos.data.api;

import com.hermosaprogramacion.premium.appproductos.products.domain.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Segmentos de URL donde actuaremos
 */
public interface RestService {
    @GET("products")
    Call<List<Product>> getProducts();
}
