package cn.ssm.controller;

import cn.ssm.pojo.User;
import cn.ssm.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User toIndex(User user,HttpServletRequest request){
        System.out.println("用户的Id："+user.getId());
        System.out.println("这是再一次重新部署...");
        String contextPath = request.getSession().getServletContext().getRealPath("/");
        System.out.println(contextPath);
        /*String contextPath_2 = request.getSession().getServletContext().getRealPath("/");
        System.out.println(contextPath_2);*/

        User newUser = null;
        try {
            newUser = userService.getUserById(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newUser;
    }

}
