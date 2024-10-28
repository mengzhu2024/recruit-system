package com.recruit.model;

import com.recruit.model.BaseModel;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("follow")
public class FollowDO extends BaseModel {

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 公司id
     */
    private Integer companyId;
}
