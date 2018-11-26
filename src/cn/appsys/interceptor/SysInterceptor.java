package cn.appsys.interceptor;

import cn.appsys.pojo.BackendUser;
import cn.appsys.pojo.DevUser;
import cn.appsys.tools.Constants;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: 田欣骅
 * @date: 2018/11/24
 * @package cn.appsys.interceptor
 * @description: TODO
 */
public class SysInterceptor {
    private Logger logger = Logger.getLogger(SysInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        logger.debug("SysInterceptor preHandle ==========================");
        HttpSession session = request.getSession();

        BackendUser backendUser = (BackendUser)session.getAttribute(Constants.USER_SESSION);
        DevUser devUser = (DevUser)session.getAttribute(Constants.DEV_USER_SESSION);

        if(null != devUser){ //dev SUCCESS
            return true;
        }else if(null != backendUser){ //backend SUCCESS
            return true;
        }else{
            response.sendRedirect(request.getContextPath()+"/403.jsp");
            return false;
        }

    }
}
