package cn.com.hxw.study.controller;

/**
 * Created by huangxiaowei on 17/9/11.
 */
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import cn.com.hxw.study.entity.User;
import cn.com.hxw.study.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
