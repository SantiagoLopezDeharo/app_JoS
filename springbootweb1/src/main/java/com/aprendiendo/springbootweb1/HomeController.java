package com.aprendiendo.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int n1,@RequestParam("num2") int n2, ModelAndView model)
    {
        //int n1 = Integer.parseInt(req.getParameter("num1"));
        //int n2 = Integer.parseInt(req.getParameter("num2"));

        int result = n1 + n2;
        
        model.addObject("resultado", result);
        model.setViewName("result");
        //session.setAttribute("resultado", result);

        return model;
    }
}
