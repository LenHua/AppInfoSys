package cn.appsys.service.developer;

import cn.appsys.dao.dataDictionary.DataDictionaryMapper;
import cn.appsys.pojo.DataDictionary;
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
public class DataDictionaryServiceImpl implements DataDictionaryService {
    @Resource
    private DataDictionaryMapper mapper;

    @Override
    public List<DataDictionary> getDataDictionaryList(String typeCode)
            throws Exception {
        // TODO Auto-generated method stub
        return mapper.getDataDictionaryList(typeCode);
    }
}
