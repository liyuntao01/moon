package com.sun.moon.service.impl;

import com.sun.moon.beans.MessageBean;
import com.sun.moon.mapper.MessageMapper;
import com.sun.moon.service.IMessageService;
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
public class MessageServiceImpl extends ServiceImpl<MessageMapper, MessageBean> implements IMessageService {

}
