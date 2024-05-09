package com.aprendiendo.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int n1,@RequestParam("num2") int n2, Model model)
    {
        //int n1 = Integer.parseInt(req.getParameter("num1"));
        //int n2 = Integer.parseInt(req.getParameter("num2"));

        int result = n1 + n2;
        
        model.addAttribute("resultado", result);
        //session.setAttribute("resultado", result);

        return "result";
    }
}
