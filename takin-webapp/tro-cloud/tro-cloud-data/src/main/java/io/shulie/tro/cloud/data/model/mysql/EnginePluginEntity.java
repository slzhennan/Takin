/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shulie.tro.cloud.data.model.mysql;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 引擎插件实体
 *
 * @author lipeng
 * @date 2021-01-06 3:18 下午
 */
@Data
@TableName(value = "t_engine_plugin_info")
public class EnginePluginEntity {

    /** 主键 */
    @TableId(type = IdType.AUTO)
    private Long id;

    /** 插件名称 */
    @TableField(value = "plugin_name")
    private String pluginName;

    /** 插件类型 */
    @TableField(value = "plugin_type")
    private String pluginType;

    /** 创建时间 */
    @TableField(value = "gmt_create")
    private LocalDateTime gmtCreate;

    /** 修改时间 */
    @TableField(value = "gmt_update")
    private LocalDateTime gmtUpdate;

    /** 状态  1 启用  0 禁用 */
    @TableField
    private Integer status;

}
