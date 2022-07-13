package com.sun.moon.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.moon.model.dto.DiscussPageDTO;
import com.sun.moon.model.vo.DiscussPostVO;
import com.sun.moon.service.IDiscussPostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author liyuntao
 * @since 2022-06-29
 */
@RequestMapping(value = "/moon/discussPost")
@Controller
@Validated
@Slf4j
@Api(tags = "帖子相关接口")
public class DiscussPostController {
    @Autowired
    private IDiscussPostService discussPostService;

    @GetMapping("/{id}")
    @ApiOperation("根据帖子id获取帖子详情")
    public DiscussPostVO findDiscussById(@ApiParam(value = "帖子id", required = true)
                                         @PathVariable("id") Long id) {

        return discussPostService.findDiscussById(id);

    }


    @PostMapping(value = "/page")
    @ResponseBody
    @ApiOperation("帖子分页查询")
    public IPage<DiscussPostVO> findDiscussPage(Model model,@RequestBody DiscussPageDTO discussPageDTO) {
        IPage<DiscussPostVO> list = discussPostService.pageDiscuss(discussPageDTO.getUserId(),discussPageDTO.getSize(),discussPageDTO.getTotal());
        model.addAttribute("page", list);
        return list;
    }
}
