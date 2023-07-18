package com.yojulab.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @GetMapping({"/", "/home", "/main"})
    public ModelAndView main(ModelAndView modelAndView){
        modelAndView.addObject("name", "Yojulab!");
        modelAndView.setViewName("/WEB-INF/views/main.jsp");
        return modelAndView;
    }
    @GetMapping({"/admin"})     // 관리자 접속하는 곳
    public ModelAndView admin(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/admin.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
    @GetMapping({"/manager/read"})     // 관리자 접속하는 곳
    public ModelAndView manager(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/manager/read.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
