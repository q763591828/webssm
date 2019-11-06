package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jsp")
public class JspController {

    @RequestMapping("/index")
    public String index(ModelMap ModelMap){
        ModelMap.addAttribute("message","Hello World");
        return "index";
    }
}
