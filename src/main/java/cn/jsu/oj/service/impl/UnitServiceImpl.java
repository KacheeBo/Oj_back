package cn.jsu.oj.service.impl;

import cn.jsu.oj.dao.UnitDao;
import cn.jsu.oj.pojo.web.vo.ShowUnitTeacherVO;
import cn.jsu.oj.pojo.web.dto.UnitAuthorize;
import cn.jsu.oj.pojo.web.dto.UnitInfo;
import cn.jsu.oj.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/29 21:11
 * describe:
<<<<<<< HEAD
*/
@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    UnitDao unitDao;

    @Override
    public List<UnitInfo> showUnit() {
        return unitDao.showUnit();
    }

    @Override
    public List<UnitAuthorize> showUnitEmpower(Integer unitId) {
        return unitDao.showUnitEmpower(unitId);
    }

    @Override
    public List<ShowUnitTeacherVO> showUnitUser(Integer unitId) {
        return unitDao.showUnitUser(unitId);
    }

    @Override
    public Integer addUnit(UnitInfo unitInfo) {

        Integer i1 = unitDao.queryUnitIdByUnitSchool(unitInfo.getUnitSchool());
        if (i1>0){
            return 1;
        }
        Integer i2 = unitDao.addUnit(unitInfo);
        if (i2>0) {
            return 2;
        }else {
            return 0;
        }
    }

    @Override
    public Integer addUnitEmpower() {
        return null;
    }

    @Override
    public Integer updateUnitEmpower() {
        return unitDao.updateUnitEmpower();
    }

    @Override
    public List<UnitInfo> queryUnit(String unitSchool) {
        return unitDao.queryUnit(unitSchool);
    }
}
