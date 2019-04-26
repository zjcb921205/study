package study.provider.service.impl;

import com.alibaba.fastjson.JSON;
import com.study.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by chenbo on 2019/4/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {
    @Autowired
    private TestService testService;

    @Test
    public void test(){
        System.out.println(JSON.toJSONString(testService.get()));

    }
}
