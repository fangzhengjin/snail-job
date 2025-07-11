package com.aizuda.snailjob.template.datasource.persistence.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 重试日志异常信息记录表
 *
 * @author opensnail
 * @since 2023-06-16
 */
@Data
@TableName("sj_retry_task_log_message")
@EqualsAndHashCode(callSuper=true)
public class RetryTaskLogMessage extends CreateDt {

    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 命名空间
     */
    private String namespaceId;

    /**
     * 组名称
     */
    private String groupName;

    /**
     * 重试任务id
     */
    private Long retryTaskId;

    /**
     * 重试信息Id
     */
    private Long retryId;

    /**
     * 异常信息
     */
    private String message;

    /**
     * 日志数量
     */
    private Integer logNum;

    /**
     * 真实上报时间
     */
    private Long realTime;

}
