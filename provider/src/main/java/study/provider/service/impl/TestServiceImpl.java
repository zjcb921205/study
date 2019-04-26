package study.provider.service.impl;

import com.study.dto.TestDTO;
import com.study.service.TestService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import study.provider.cover.TestCover;
import study.provider.mapper.TestMapper;

import java.util.List;

/**
 * Created by chenbo on 2019/4/26
 */
@Component
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;



    @Override
    public List<TestDTO> get() {
        return TestCover.INSTANCE.doCoverDTO(testMapper.get());
    }
}

