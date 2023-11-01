package org.jt.devtoolconcept;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping({"/home", "/"})
    public void home(PrintWriter pw){
var html="""
        <!doctype html>
        <html>
        <head>
        <title>Hello Page<title>
        <body>
        <h1>my notes<h1>
        </body>
        </html>
        """;
    }
}
