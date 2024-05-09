package cn.jsu.oj.service;

import cn.jsu.oj.pojo.web.dto.UnitAuthorize;
import cn.jsu.oj.pojo.web.dto.UnitInfo;
import cn.jsu.oj.pojo.web.vo.ShowUnitTeacherVO;

import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/29 21:11
 * describe:
 */
public interface UnitService {
    public List<UnitInfo> showUnit();

    public List<UnitAuthorize> showUnitEmpower(Integer unitId);

    public List<ShowUnitTeacherVO> showUnitUser(Integer unitId);

    public Integer addUnit(UnitInfo unitInfo);

    public Integer addUnitEmpower();

    public Integer updateUnitEmpower();

    public List<UnitInfo> queryUnit(String unitSchool);
}
