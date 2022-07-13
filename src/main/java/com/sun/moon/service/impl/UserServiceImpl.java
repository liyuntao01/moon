package com.sun.moon.service.impl;

import com.sun.moon.beans.UserBean;
import com.sun.moon.mapper.UserMapper;
import com.sun.moon.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, UserBean> implements IUserService {

}
