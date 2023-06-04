package likelion.crudEx.controller;

import likelion.crudEx.domain.Product;
import likelion.crudEx.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping(value = "/products/new")
    public String createForm(Model model) {
        model.addAttribute("form", new ProductForm());
        return "products/createProductForm";
    }

    @PostMapping(value = "/products/new")
    public String create(ProductForm form) {
        Product product = new Product();
        product.setProductName(form.getName());
        product.setPrice(form.getPrice());
        productService.saveProduct(product);
        return "products/products";
    }
}
