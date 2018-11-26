package cn.appsys.dao.dataDictionary;

import cn.appsys.pojo.DataDictionary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 田欣骅
 * @date: 2018/11/26
 * @package cn.appsys.dao.dataDictionary
 * @description: TODO
 */
public interface DataDictionaryMapper {
    public List<DataDictionary> getDataDictionaryList(@Param("typeCode") String typeCode)throws Exception;
}
