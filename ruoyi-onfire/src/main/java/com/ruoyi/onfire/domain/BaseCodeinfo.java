package com.ruoyi.onfire.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName base_codeinfo
 */
@TableName(value ="base_codeinfo")
@Data
public class BaseCodeinfo implements Serializable {
    /**
     * 
     */
    @TableId
    private Long codeId;

    /**
     * 
     */
    @TableField(value = "码名称")
    private String codeName;

    /**
     * 
     */
    private Long tplCodeId;

    /**
     * 
     */
    @TableField(value = "标签集")
    private String tagList;

    /**
     * 
     */
    @TableField(value = "状态")
    private String state;

    /**
     * 
     */
    @TableField(value = "模板名称")
    private String tplName;

    /**
     * 
     */
    @TableField(value = "目录")
    private String directory;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    @TableField(value = "码类型")
    private String codeType;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}