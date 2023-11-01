package org.jt.helloweb;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // We can make unlimited controller class but it does not allow duplicate
            // url/same url name.
// @RequestMapping("/hello")
public class Hello {
    @RequestMapping({ "/home", "/" })
    public void home(PrintWriter pw) {
        pw.println("Welcome to my world");
        // System.out.println("Welcome to my Web World");
    }

    @RequestMapping("/about")
    public void home1(PrintWriter pw) {
        pw.println("Welcome to my Terrotry");
        // System.out.println("Welcome to my Web World");
    }

}
