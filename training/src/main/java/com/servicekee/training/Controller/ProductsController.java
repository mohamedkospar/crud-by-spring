package com.servicekee.training.Controller;

import com.servicekee.training.DTO.RegisterForm;
import com.servicekee.training.Entity.Products;
import com.servicekee.training.Service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;


    @GetMapping("/get-all")
    public List<Products> getAll() {
        return productsService.getAll();
    }

    @PostMapping("/save")
    public Products saveProducts(@RequestBody Products products) {
        return productsService.sava(products);
    }


    @DeleteMapping("delete-product")

    public String deleteProduct(@RequestParam int id) {
        return productsService.deleteProduct(id);
    }

    @GetMapping("/get-id/{id}")

    public Products getProductById(@PathVariable int id) {
        return productsService.getProductById(id);
    }

    @PutMapping("/update-product")
    public Products updateProducts(@RequestBody Products products) {
        return productsService.updateProduct(products);
    }

    @PostMapping("/register")

    public String post(@RequestBody RegisterForm form) {
        return form.toString();
    }

}
