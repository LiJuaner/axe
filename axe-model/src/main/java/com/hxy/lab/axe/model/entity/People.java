package com.hxy.lab.axe.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiJuan.Li
 * @since 2024-04-08
 */
@TableName("people")
@Schema(name = "People", description = "用户信息")
public class People implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "姓名")
    @TableField("name")
    private String name;

    @Schema(description = "性别")
    @TableField("sex")
    private String sex;

    @Schema(description = "年龄")
    @TableField("birthday")
    private LocalDate birthday;

    @TableField("province")
    private String province;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "People{" +
            "id = " + id +
            ", name = " + name +
            ", sex = " + sex +
            ", birthday = " + birthday +
            ", province = " + province +
        "}";
    }
}
