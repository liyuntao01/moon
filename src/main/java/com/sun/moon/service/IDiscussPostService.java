package com.sun.moon.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sun.moon.beans.DiscussPostBean;
import com.sun.moon.model.vo.DiscussPostVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liyuntao
 * @since 2022-06-29
 */
public interface IDiscussPostService extends IService<DiscussPostBean> {
    /**
     * 根据帖子id获取帖子详情
     * @param id 帖子id
     * @return
     */
    DiscussPostVO findDiscussById(Long id);

    /**
     * 帖子分页查询
     * @param userId 用户id
     * @param pageSize 页码数
     * @param pageTotal 每页条数
     * @return
     */
    IPage<DiscussPostVO> pageDiscuss(Long userId, Integer pageSize, Integer pageTotal);
}
