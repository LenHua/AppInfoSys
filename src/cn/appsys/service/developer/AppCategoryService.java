package cn.appsys.service.developer;

import cn.appsys.pojo.AppCategory;

import java.util.List;

/**
 * @author: 田欣骅
 * @date: 2018/11/26
 * @package cn.appsys.service.developer
 * @description: TODO
 */
public interface AppCategoryService {
    /**
     * 根据父节点parentId获取相应的分类列表
     * @param parentId
     * @return
     * @throws Exception
     */
    public List<AppCategory> getAppCategoryListByParentId(Integer parentId)throws Exception;
}
