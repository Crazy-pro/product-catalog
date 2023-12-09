package alex.klimchuk.product.catalog.controllers;

import alex.klimchuk.product.catalog.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private ProductService productService;

    @RequestMapping({"/", "index"})
    public String getIndex(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "index";
    }

    @RequestMapping("secured")
    public String secured() {
        return "secured";
    }
}