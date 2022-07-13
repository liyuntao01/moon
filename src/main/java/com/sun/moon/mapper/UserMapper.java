package com.sun.moon.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sun.moon.beans.UserBean;
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
public interface UserMapper extends BaseMapper<UserBean> {

}
