package com.sun.moon.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description:
 * @Author: dev_tct
 * @CreateDate: 2022/7/12
 * @Version: 1.0
 */
@Data
@ApiModel("帖子分页参数")
public class DiscussPageDTO {
    @ApiModelProperty("页码数")
    private Integer total;
    @ApiModelProperty("每页条数")
    private Integer size;
    @ApiModelProperty("用户id")
    private Long userId;
}
