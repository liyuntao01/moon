package com.sun.moon.controller;


import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liyuntao
 * @since 2022-06-29
 */
@RequestMapping("/moon/loginTicket")
@RestController
@Validated
@Slf4j
@Api(tags = "登录相关接口")
public class LoginTicketController {

}
