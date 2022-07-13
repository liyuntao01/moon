package com.sun.moon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.moon.beans.LoginTicketBean;
import com.sun.moon.mapper.LoginTicketMapper;
import com.sun.moon.service.ILoginTicketService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liyuntao
 * @since 2022-06-29
 */
@Service
public class LoginTicketServiceImpl extends ServiceImpl<LoginTicketMapper, LoginTicketBean> implements ILoginTicketService {

}
