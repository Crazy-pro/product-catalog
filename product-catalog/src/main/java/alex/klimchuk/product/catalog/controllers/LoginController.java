package alex.klimchuk.product.catalog.controllers;

import alex.klimchuk.product.catalog.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginDto", new LoginDto());
        return "loginform";
    }

    @RequestMapping("logout-success")
    public String yourLoggedOut() {
        return "logout-success";
    }

    //  @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(@Valid LoginDto loginDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "loginform";
        }
        return "redirect:index";
    }
}