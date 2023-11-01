
package org.jt.urldatapass;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * DatapassController
 */
@Controller
public class DatapassController {
    @GetMapping({ "/", "/hi" })
    public String home(Model m) {
        m.addAttribute("id", 01);
        m.addAttribute("name", "Rahul");
        return "home";
    }

    @GetMapping("/hello")
    public void hello(@RequestParam(required = false, defaultValue = "0") int id,
            @RequestParam(required = false, defaultValue = "hello") String name, PrintWriter pw) {
        pw.println(id);
        pw.println(name);
        // return "redirect:/hi";
    }
}