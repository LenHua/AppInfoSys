package cn.appsys.service.backend;

import cn.appsys.pojo.BackendUser;

/**
 * @author: 田欣骅
 * @date: 2018/11/24
 * @package cn.appsys.service.backend
 * @description: TODO
 */
public interface BackendUserService {
    /**
     * 用户登录
     * @param userCode
     * @param userPassword
     * @return
     */
    public BackendUser login(String userCode, String userPassword) throws Exception;
}
