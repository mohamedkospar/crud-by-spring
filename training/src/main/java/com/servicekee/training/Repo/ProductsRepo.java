package com.servicekee.training.Repo;

import com.servicekee.training.Entity.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepo extends MongoRepository<Products ,Integer> {
}
