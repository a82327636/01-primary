package com.abc;

import com.abc.service.CacheService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ProjectName: 01-primary
 * @Package: com.abc
 * @ClassName: CacheTest
 * @Author: zwj
 * @Description: 注释
 * @Date: 2020/10/15 18:31
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheTest {

    @Autowired
    private CacheService cacheService;

    @Test
    public void execute(){
        String key = "aabc_123";
        String value = "AAAC123";
        cacheService.setKey(key,value);
        System.out.println(cacheService.getKey(key));
    }

}
