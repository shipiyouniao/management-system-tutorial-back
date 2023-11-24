package com.example.manage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    /**
     * 用户ID
     */
    @TableId
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 邮箱
     */
    private String avatar;

    /**
     * 生日
     */
    private Long birthday;

    /**
     * 性别
     */
    private Long gmtCreated;

    /**
     * 创建时间
     */
    private Long gmtModified;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
