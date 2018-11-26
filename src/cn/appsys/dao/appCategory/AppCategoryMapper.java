package cn.appsys.dao.appCategory;

import cn.appsys.pojo.AppCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 田欣骅
 * @date: 2018/11/26
 * @package cn.appsys.dao.adPromotion
 * @description: TODO
 */
public interface AppCategoryMapper {
    public List<AppCategory> getAppCategoryListByParentId(@Param("parentId") Integer parentId)throws Exception;
}
