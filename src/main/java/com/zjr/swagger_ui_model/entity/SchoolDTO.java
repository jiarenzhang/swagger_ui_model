package com.zjr.swagger_ui_model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @Author: Tony
 * @Description: 前端（或者APP端）传给后端的实体类，与VO类类似，也是不直接与数据库打交道的实体
 * @Date: 2018/4/20 14:45
 * @Version 1.0
 */
@ApiModel(description = "学校DTO类")
public class SchoolDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学校名称", required = true)
    private String schoolName;
    @ApiModelProperty(value = "历史沿革", required = true)
    private String history;

    public SchoolDTO() {
        this.schoolName = "";
        this.history = "";
    }

    public SchoolDTO(String schoolName, String history) {
        this.schoolName = schoolName;
        this.history = history;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SchoolDTO{");
        sb.append("schoolName='").append(schoolName).append('\'');
        sb.append(", history='").append(history).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
