package study.provider.cover;

import com.study.dto.TestDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import study.provider.DO.TestDO;

import java.util.List;

/**
 * Created by chenbo on 2019/4/26
 */
@Mapper
public interface TestCover {

    TestCover INSTANCE = Mappers.getMapper( TestCover.class );
    TestDTO doCoverDTO(TestDO testDO);
    List<TestDTO> doCoverDTO(List<TestDO> list);

}
