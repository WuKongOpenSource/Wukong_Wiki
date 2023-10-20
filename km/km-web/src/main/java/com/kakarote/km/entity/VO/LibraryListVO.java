package com.kakarote.km.entity.VO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author wyq
 */
@Data
@ApiModel("知识库列表信息")
public class LibraryListVO {
    @ApiModelProperty(value = "知识库id")
    private Long libraryId;

    @ApiModelProperty(value = "知识库名称")
    private String name;

    @ApiModelProperty(value = "简介")
    private String description;

    @ApiModelProperty(value = "是否公开 1 公开 0 私有")
    private Integer isOpen;

    @ApiModelProperty(value = "-1 删除 1 正常 2 模板")
    private Integer status;

    @ApiModelProperty(value = "0 否 1 是")
    private Integer isSystemCover;

    @ApiModelProperty(value = "知识库封面")
    private String coverUrl;

    @ApiModelProperty(value = "创建人")
    private Long createUserId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除人id")
    private Long deleteUserId;

    @ApiModelProperty(value = "删除时间")
    private LocalDateTime deleteTime;

    @ApiModelProperty(value = "收藏数量")
    private Integer collectStatus;

    private int documentNumber;

    private int fileNumber;

    @ApiModelProperty(value = "是否开启AI服务，1 关 2 开 默认1")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer aiServiceSwitch;
}
