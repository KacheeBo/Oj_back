package cn.jsu.oj.dao;


import cn.jsu.oj.pojo.web.dto.UnitAuthorize;
import cn.jsu.oj.pojo.web.dto.UnitInfo;
import cn.jsu.oj.pojo.web.vo.ShowUnitTeacherVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/29 21:10
 * describe:
 */
@Mapper
@Repository
public interface UnitDao {

    public List<UnitInfo> showUnit();

    public List<UnitAuthorize> showUnitEmpower(Integer unitId);

    public List<ShowUnitTeacherVO> showUnitUser(Integer unitId);

    public Integer addUnit(UnitInfo unitInfo);

//    public Integer addUnitEmpower(UnitAuthorize unitAuthorize);

    public Integer updateUnitEmpower();

    public List<UnitInfo> queryUnit(String unitSchool);

    public Integer queryUnitIdByUnitSchool(String unitSchool);
}
