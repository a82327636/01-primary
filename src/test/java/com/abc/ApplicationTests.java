package com.abc;

import com.abc.service.SomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    // @Qualifier("devService")
    private SomeService oneService;

    @Autowired
    // @Qualifier("proService")
    private SomeService twoService;

//    @Test
//    public void oneServiceTest() {
//        System.out.println(oneService.send());
//    }

    @Test
    public void twoServiceTest() {
        System.out.println(twoService.send());
    }


}
