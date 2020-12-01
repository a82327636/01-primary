package com.abc.service;

import com.abc.component.CacheUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc.service
 * @ClassName: CacheService
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/15 18:28
 * @Version: 1.0
 */
@Service
public class CacheService {

    @Autowired
    private CacheUtil cacheUtil;

    public void setKey(String key,String value){
        cacheUtil.set(key,value);
    }

    public String getKey(String key){
        return (String)cacheUtil.get(key);
    }
}
