package com.ruoyi.onfire.controller;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.onfire.domain.BaseCodeinfo;
import com.ruoyi.onfire.service.BaseCodeinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 二维码接口
 * @author fyzzz
 */
@Api(tags = "二维码接口")
@RequestMapping("fire")
@RestController
public class CodeInfoController extends BaseController {

    @Autowired
    private BaseCodeinfoService baseCodeinfoService;

    @GetMapping("/code/list")
    @ApiOperation(value = "分页查询所有二维码")
    public TableDataInfo list() {
        startPage();
        List<BaseCodeinfo> list = baseCodeinfoService.list();
        return getDataTable(list);
    }


}
