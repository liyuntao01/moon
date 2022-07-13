package com.sun.moon.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sun.moon.beans.DiscussPostBean;
import com.sun.moon.model.vo.DiscussPostVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liyuntao
 * @since 2022-06-29
 */
@Repository
public interface DiscussPostMapper extends BaseMapper<DiscussPostBean> {
    /**
     * 帖子分页查询
     * @param objectPage 分页参数
     * @param queryWrapper 查询条件
     * @return
     */
    IPage<DiscussPostVO> pageDiscuss(Page<DiscussPostBean> objectPage,@Param(Constants.WRAPPER)  QueryWrapper<DiscussPostBean> queryWrapper);
}
