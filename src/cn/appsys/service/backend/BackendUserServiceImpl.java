package cn.appsys.service.backend;

import cn.appsys.dao.backendUser.BackendUserMapper;
import cn.appsys.pojo.BackendUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: 田欣骅
 * @date: 2018/11/24
 * @package cn.appsys.service.backend
 * @description: TODO
 */
@Service
public class BackendUserServiceImpl implements BackendUserService {
    @Resource
    private BackendUserMapper mapper;

    @Override
    public BackendUser login(String userCode, String userPassword) throws Exception {
        // TODO Auto-generated method stub
        BackendUser user = null;
        user = mapper.getLoginUser(userCode);
        //匹配密码
        if(null != user){
            if(!user.getUserPassword().equals(userPassword)) {
                user = null;
            }
        }
        return user;
    }
}
