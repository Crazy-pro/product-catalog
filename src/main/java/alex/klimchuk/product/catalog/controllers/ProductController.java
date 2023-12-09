package alex.klimchuk.product.catalog.controllers;

import alex.klimchuk.product.catalog.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private ProductService productService;

    //@RequestMapping("/product")
    public String getProduct() {
        return "redirect:/index";
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model) {
        model.addAttribute("product", productService.getProduct(id));
        return "product";
    }
}