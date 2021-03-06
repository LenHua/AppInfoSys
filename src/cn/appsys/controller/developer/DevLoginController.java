package cn.appsys.controller.developer;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;
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
 * @package cn.appsys.controller.developer
 * @description: TODO
 */
@Controller
@RequestMapping(value = "/dev")
public class DevLoginController {
    @Resource
    private DevUserService devUserService;

    private Logger logger = Logger.getLogger(DevLoginController.class);

    @RequestMapping(value = "/login.html")
    public String login(){
        return "devlogin";
    }

    @RequestMapping(value="/dologin.html",method= RequestMethod.POST)
    public String doLogin(@RequestParam String devCode, @RequestParam String devPassword, HttpServletRequest request, HttpSession session){
        logger.debug("doLogin====================================");
        //调用service方法，进行用户匹配
        DevUser user = null;
        try {
            user = devUserService.login(devCode,devPassword);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(null != user){//登录成功
            //放入session
            session.setAttribute(Constants.DEV_USER_SESSION, user);
            //页面跳转（main.jsp）
            return "redirect:/dev/flatform.html";
        }else{
            //页面跳转（login.jsp）带出提示信息--转发
            request.setAttribute("error", "用户名或密码不正确");
            return "devlogin";
        }
    }

    @RequestMapping(value="/flatform.html")
    public String main(HttpSession session){
        if(session.getAttribute(Constants.DEV_USER_SESSION) == null){
            return "redirect:/dev/login";
        }
        return "developer/main";
    }

    @RequestMapping(value="/logout")
    public String logout(HttpSession session){
        //清除session
        session.removeAttribute(Constants.DEV_USER_SESSION);
        return "devlogin";
    }
}
