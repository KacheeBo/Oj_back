package cn.jsu.oj.controller;

import cn.jsu.oj.pojo.web.vo.ShowUnitTeacherVO;
import cn.jsu.oj.pojo.web.dto.UnitAuthorize;
import cn.jsu.oj.pojo.web.dto.UnitInfo;
import cn.jsu.oj.pojo.web.vo.CommonResult;
import cn.jsu.oj.service.UnitService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wws
 * @Date: 2020/12/29 21:09
 * describe:
*/
@CrossOrigin
@RestController
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    UnitService unitService;


    @PostMapping("/showUnit")
    @ApiOperation("显示单位信息")
    public CommonResult showUnit() {
        List<UnitInfo> list = unitService.showUnit();
        return new CommonResult(200, "显示单位信息成功!",list);
    }

    @PostMapping("/showUnitEmpower")
    @ApiOperation("显示单位授权信息")
    public CommonResult showUnitEmpower(@RequestBody Integer unitId) {
        List<UnitAuthorize> list = unitService.showUnitEmpower(unitId);
        return new CommonResult(200, "显示单位信息成功!",list);
    }

    @PostMapping("/showUnitUser")
    @ApiOperation("显示单位用户列表")
    public CommonResult showUnitUser(@RequestBody Integer unitId) {
        List<ShowUnitTeacherVO> list = unitService.showUnitUser(unitId);
        return new CommonResult(200, "显示单位信息成功!",list);
    }

    @PostMapping("/addUnit")
    @ApiOperation("增加单位")
    public CommonResult addUnit(@RequestBody UnitInfo unitInfo) {
        Integer i = unitService.addUnit(unitInfo);
        switch (i){
            case 1:
                return new CommonResult(444, "单位已经存在!");
            case 2:
                return new CommonResult(200, "增加单位成功!");
            default:
                return new CommonResult(444, "增加单位失败!");
        }
    }

    @PostMapping("/updateUnitEmpower")
    @ApiOperation("修改单位授权")
    public CommonResult updateUnitEmpower(@RequestBody Integer unitId) {
        return null;
    }

    @PostMapping("/queryUnit")
    @ApiOperation("查询单位")
    public CommonResult queryUnit(@RequestBody String unitSchool) {
        List<UnitInfo> list = unitService.queryUnit(unitSchool);
        return new CommonResult(200, "查询单位成功!",list);
    }
}
