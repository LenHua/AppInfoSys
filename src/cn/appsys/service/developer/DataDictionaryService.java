package cn.appsys.service.developer;

import cn.appsys.pojo.DataDictionary;

import java.util.List;

/**
 * @author: 田欣骅
 * @date: 2018/11/26
 * @package cn.appsys.service.developer
 * @description: TODO
 */
public interface DataDictionaryService {
    /**
     * 根据typeCode查询相应的数据字典列表
     * @param typeCode
     * @return
     * @throws Exception
     */
    public List<DataDictionary> getDataDictionaryList(String typeCode)throws Exception;
}
