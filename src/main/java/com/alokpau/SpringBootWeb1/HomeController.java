package com.alokpau.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(
            @RequestParam("num1") int a,
            @RequestParam("num2") int b,
            Model model
    ) {
        // int result = Integer.parseInt(req.getParameter("num1")) + Integer.parseInt(req.getParameter("num2"));
        model.addAttribute("result", a+b);
        return "result.jsp";
    }
}
