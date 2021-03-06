package cn.appsys.controller.backend;

import cn.appsys.pojo.BackendUser;
import cn.appsys.service.backend.BackendUserService;
import cn.appsys.tools.Constants;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: 田欣骅
 * @date: 2018/11/24
 * @package appsys.controller.backend
 * @description: TODO
 */
@Controller
@RequestMapping(value = "user")
public class UserLoginController {
    @Resource
    private BackendUserService backendUserService;

    private Logger logger = Logger.getLogger(UserLoginController.class);

    @RequestMapping(value = "/login.html")
    public String login(){
        return "backendlogin";
    }

    @RequestMapping(value="/dologin.html",method= RequestMethod.POST)
    public String doLogin(@RequestParam String userCode, @RequestParam String userPassword, HttpServletRequest request, HttpSession session){
        logger.debug("doLogin====================================");
        //调用service方法，进行用户匹配
        BackendUser user = null;
        try {
            user = backendUserService.login(userCode,userPassword);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(null != user){//登录成功
            //放入session
            session.setAttribute(Constants.USER_SESSION, user);
            //页面跳转（main.jsp）
            return "redirect:/user/backend.html";
        }else{
            //页面跳转（login.jsp）带出提示信息--转发
            request.setAttribute("error", "用户名或密码不正确");
            return "backendlogin";
        }
    }

    @RequestMapping(value="/backend.html")
    public String main(HttpSession session){
        if(session.getAttribute(Constants.USER_SESSION) == null){
            return "redirect:/user/login";
        }
        return "backend/main";
    }

    @RequestMapping(value="/logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute(Constants.USER_SESSION);
        return "backendlogin";
    }
}
