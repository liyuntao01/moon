package com.sun.moon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.moon.beans.DiscussPostBean;
import com.sun.moon.mapper.DiscussPostMapper;
import com.sun.moon.model.vo.DiscussPostVO;
import com.sun.moon.service.IDiscussPostService;
import com.sun.moon.service.convert.DiscussPostConvertMappers;
import com.sun.moon.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author liyuntao
 * @since 2022-06-29
 */
@Service
public class DiscussPostServiceImpl extends ServiceImpl<DiscussPostMapper, DiscussPostBean> implements IDiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Override
    public DiscussPostVO findDiscussById(Long id) {
        DiscussPostBean discussPostBean = this.getById(id);
        return DiscussPostConvertMappers.MAPPERS.convertVo(discussPostBean);
    }

    @Override
    public IPage<DiscussPostVO> pageDiscuss(Long userId, Integer pageSize, Integer pageTotal) {
        QueryWrapper<DiscussPostBean> queryWrapper = new QueryWrapper<>();
        if (CommonUtils.isObjectNotNull(userId)) {
            queryWrapper.inSql("d.user_id", "SELECT user.id FROM `user` WHERE user.id=" + userId);
        }
        if (CommonUtils.isObjectNull(pageSize)) {
            pageSize = 10;
        }
        if (CommonUtils.isObjectNull(pageTotal)) {
            pageTotal = 1;
        }
        Page<DiscussPostBean> discussPostBeanPage = new Page<>( pageTotal,pageSize);
        return discussPostMapper.pageDiscuss(discussPostBeanPage, queryWrapper);
    }
}
