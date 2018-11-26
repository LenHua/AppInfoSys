package cn.appsys.dao.devUser;

import cn.appsys.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 田欣骅
 * @date: 2018/11/24
 * @package cn.appsys.dao.devUser
 * @description: TODO
 */
public interface DevUserMapper {
    /**
     * 通过userCode获取User
     * @param userCode
     * @return
     * @throws Exception
     */
    public DevUser getLoginUser(@Param("devCode") String devCode)throws Exception;
}
