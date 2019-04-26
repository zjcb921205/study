package study.consumer.controller;

import com.study.dto.TestDTO;
import com.study.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenbo on 2019/4/26
 */
@RestController
public class TestController {
    @Reference(version = "1.0.0",url = "dubbo://127.0.0.1:12345")
    private TestService testService;

    @RequestMapping("/test")
    public List<TestDTO> test(){

        return testService.get();
    }
}
