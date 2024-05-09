package com.aprendiendo.springbootweb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String home()
    {
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session)
    {
        int n1 = Integer.parseInt(req.getParameter("num1"));
        int n2 = Integer.parseInt(req.getParameter("num2"));

        int result = n1 + n2;
        
        session.setAttribute("resultado", result);

        return "result.jsp";
    }
}
