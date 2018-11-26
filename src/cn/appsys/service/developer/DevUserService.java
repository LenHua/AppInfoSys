package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

/**
 * @author: 田欣骅
 * @date: 2018/11/24
 * @package cn.appsys.service.developer
 * @description: TODO
 */
public interface DevUserService {
    /**
     * 用户登录
     * @param devCode
     * @param devPassword
     * @return
     */
    public DevUser login(String devCode, String devPassword) throws Exception;
}
