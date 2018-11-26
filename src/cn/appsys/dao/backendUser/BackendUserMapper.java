package cn.appsys.dao.backendUser;

import cn.appsys.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author: 田欣骅
 * @date: 2018/11/24
 * @package cn.appsys.dao.backendUser
 * @description: TODO
 */
public interface BackendUserMapper {
    /**
     * 通过userCode获取User
     * @param userCode
     * @return
     * @throws Exception
     */
    public BackendUser getLoginUser(@Param("userCode") String userCode)throws Exception;
}
