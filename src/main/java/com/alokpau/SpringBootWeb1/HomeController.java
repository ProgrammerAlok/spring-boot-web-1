package com.alokpau.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "student";
    }

    @RequestMapping("add")
    public ModelAndView add(
            @RequestParam("num1") int a,
            @RequestParam("num2") int b,
            ModelAndView mv
    ) {
        // int result = Integer.parseInt(req.getParameter("num1")) + Integer.parseInt(req.getParameter("num2"));
        mv.addObject("result", a+b);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("addStudent")
    public String addStudent(Student student) {
        return "studentDetails";
    }
}
