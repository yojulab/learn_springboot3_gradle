package com.yojulab.study_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {
    @GetMapping({"/"})      // 일반과 관리자가 접속 가능
    public ModelAndView main(ModelAndView modelAndView){

        String viewName = "/WEB-INF/views/main.jsp";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("viewName", "home Attr");
        return modelAndView;
    }
    
    @GetMapping({"/admin"})     // 관리자 접속하는 곳
    public ModelAndView admin(ModelAndView modelAndView){
        String viewName = "/WEB-INF/views/admin.jsp";
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
