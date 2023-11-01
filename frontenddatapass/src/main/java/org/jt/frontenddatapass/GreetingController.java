package org.jt.frontenddatapass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * GreetingController
 */
@Controller
public class GreetingController {
    @PostMapping
    public String home() {
        return "home";
    }

    @PostMapping
    public String greet(@ModelAttribute Student student, Model model) {
        model.addAttribute("student", student);
        return "about";
    }
}