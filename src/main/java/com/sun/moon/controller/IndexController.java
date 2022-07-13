package com.sun.moon.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.moon.model.vo.DiscussPostVO;
import com.sun.moon.service.IDiscussPostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: liyt
 * @CreateDate: 2022/7/13
 * @Version: 1.0
 */
@RequestMapping("/index")
@Controller
@Validated
@Slf4j
@Api(tags = "首页")
public class IndexController {
    @Autowired
    private IDiscussPostService discussPostService;

    @GetMapping("")
    @ApiOperation("帖子分页查询")
    public String findDiscussIndex(Model model,
                                   @RequestParam(value = "total",required = false) Integer total,
                                   @RequestParam(value = "size",required = false) Integer size) {
        IPage<DiscussPostVO> list = discussPostService.pageDiscuss(null,size,total);
        model.addAttribute("page", list);
        return "/index";
    }
}
