package cn.appsys.dao.appVersion;

import cn.appsys.pojo.AppVersion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 田欣骅
 * @date: 2018/11/26
 * @package cn.appsys.dao.appVersion
 * @description: TODO
 */
public interface AppVersionMapper {
    public List<AppVersion> getAppVersionList(@Param("appId") Integer appId) throws Exception;

    public int add(AppVersion appVersion)throws Exception;

    public int getVersionCountByAppId(@Param("appId") Integer appId)throws Exception;

    public int deleteVersionByAppId(@Param("appId") Integer appId)throws Exception;

    public AppVersion getAppVersionById(@Param("id") Integer id)throws Exception;

    public int modify(AppVersion appVersion)throws Exception;

    public int deleteApkFile(@Param("id") Integer id)throws Exception;
}
