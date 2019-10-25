package com.example.ssmspringboot.usermanage.service;

import com.example.ssmspringboot.usermanage.po.BaseDict;

import java.util.List;

/**
 * 数据字典Service接口
 */
public interface BaseDictService {
    //根据类别代码查询数据字典
    public List<BaseDict> findBaseDictByTypeCode(String typecode);

}
