package com.servicekee.training.Service;

import com.servicekee.training.Entity.Products;
import com.servicekee.training.Repo.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductsService {
    @Autowired
    private ProductsRepo productsRepo ;

    public List<Products> getAll(){
        return productsRepo.findAll();
    }

    public Products sava(Products products){
        return productsRepo.save(products);
    }

    public String deleteProduct (int id) {
         productsRepo.deleteById(id);
         return "product is deleted" + id ;
    }

    public Products getProductById (int id)
    {
            return productsRepo.findById(id).get();

    }

    public Products updateProduct(Products product)
    {
        return productsRepo.save(product);
    }
}



