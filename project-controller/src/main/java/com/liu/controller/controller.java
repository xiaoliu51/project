package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author lya
 * @date 2021/7/15 14:27
 */
@Controller
public class controller {

    @ResponseBody
    @RequestMapping("index")
    public Object index(){
        return "首页";
    }
    @RequestMapping("in")
    public String in(HttpSession session, Model model){
        session.setAttribute("userName","小明");
        model.addAttribute("user","张三");
        return "index";
    }
}
