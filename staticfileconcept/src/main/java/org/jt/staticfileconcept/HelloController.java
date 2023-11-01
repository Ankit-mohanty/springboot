package org.jt.staticfileconcept;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/home")
    public String home(Model model) {
        var student = new Student("Rahul", 20, 2500.00);
        model.addAttribute("student", student);
        model.addAttribute("name", "Java Techenocart");
        return "index";
    }
}
