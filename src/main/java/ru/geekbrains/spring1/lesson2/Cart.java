package ru.geekbrains.spring1.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component("prototype")
public class Cart {

    private ProductService productService;
    private List<Product> cart;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @PostConstruct
    private void init() {
        cart = new ArrayList<>();
    }

    public void addProductById(Long id) {
        cart.add(productService.findProductById(id));
    }

    public void deleteProductById(Long id) {
        cart.remove(productService.findProductById(id));
    }

    public List<Product> showCart() {
        return Collections.unmodifiableList(cart);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Product p : cart) {
            sb.append(p);
        }
        sb.append("]");
        return sb.toString();
    }
}
