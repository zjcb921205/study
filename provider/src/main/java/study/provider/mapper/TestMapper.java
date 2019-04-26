package study.provider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import study.provider.DO.TestDO;

@Mapper
public interface TestMapper {
    int insert(@Param("testDO") TestDO testDO);

    int insertSelective(@Param("testDO") TestDO testDO);

    int insertList(@Param("testDOs") List<TestDO> testDOs);

    int updateByPrimaryKeySelective(@Param("testDO") TestDO testDO);

    List<TestDO> get();
}
