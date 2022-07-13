package com.sun.moon.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: liyuntao
 * @CreateDate: 2022/7/13
 * @Version: 1.0
 */
@RequestMapping("/email")
@Controller
@Validated
@Slf4j
@Api(tags = "首页")
public class EmailController {
    @Autowired
    private JavaMailSender javaMailSender;

    public void setJavaMailSender() {
        SimpleMailMessage message=new SimpleMailMessage();
        //邮件内容
        message.setText("测试邮件发送");
        //邮件主题
        message.setSubject("主题");
        //发送给谁
        message.setTo("2635737635@qq.com");
        //谁发的
        message.setFrom("2624467078@qq.com");

        javaMailSender.send(message);
    }
}
