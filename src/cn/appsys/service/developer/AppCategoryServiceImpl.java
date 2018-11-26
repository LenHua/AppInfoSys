package cn.appsys.service.developer;

import cn.appsys.dao.appCategory.AppCategoryMapper;
import cn.appsys.pojo.AppCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 田欣骅
 * @date: 2018/11/26
 * @package cn.appsys.service.developer
 * @description: TODO
 */
@Service
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryMapper mapper;

    @Override
    public List<AppCategory> getAppCategoryListByParentId(Integer parentId)
            throws Exception {
        // TODO Auto-generated method stub
        return mapper.getAppCategoryListByParentId(parentId);
    }
}
