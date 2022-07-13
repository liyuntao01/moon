package com.sun.moon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.moon.beans.CommentBean;
import com.sun.moon.mapper.CommentMapper;
import com.sun.moon.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, CommentBean> implements ICommentService {

}
