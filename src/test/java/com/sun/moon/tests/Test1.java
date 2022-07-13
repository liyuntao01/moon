package com.sun.moon.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: liyuntao
 * @CreateDate: 2022/7/13
 * @Version: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    public void test1() {
        SimpleMailMessage message = new SimpleMailMessage();
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
