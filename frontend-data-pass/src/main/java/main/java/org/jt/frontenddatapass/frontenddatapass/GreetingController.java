package main.java.org.jt.frontenddatapass.frontenddatapass;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

//import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class GreetingController {
    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/submit")
    // public void greet(@RequestParam("name1") String name, @RequestParam int roll,
    // PrintWriter pw) {// HttpServletRequest
    // request replace
    // with
    // @RequestParam String name
    // String name=request.getParameter("name");
    //
    // public void greet(@ModelAttribute Student student, PrintWriter pw) {
    public String greet(@ModelAttribute Student student, Model model) {
        model.addAttribute("student ", student);
        return "about";
    }

}
