package com.aizuda.snailjob.template.datasource.persistence.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@TableName("sj_notify_config")
@EqualsAndHashCode(callSuper=true)
public class NotifyConfig extends CreateUpdateDt {

    @TableId(value = "id")
    private Long id;

    private String namespaceId;

    private String groupName;

    /**
     * 任务类型 1、重试任务 2、回调任务、 3、JOB任务 4、WORKFLOW任务
     */
    private Integer systemTaskType;

    private Integer notifyStatus;

    private String recipientIds;

    private Integer notifyThreshold;

    /**
     * 通知告警场景名
     */
    private String notifyName;

    private Integer notifyScene;

    private Integer rateLimiterStatus;

    private Integer rateLimiterThreshold;

    private String description;

    private LocalDateTime createDt;

    private LocalDateTime updateDt;

}
