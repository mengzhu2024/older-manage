package com.entity.vo;

import com.entity.YishengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 医生
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yisheng")
public class YishengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 医生工号
     */

    @TableField(value = "yisheng_uuid_number")
    private String yishengUuidNumber;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 医生名称
     */

    @TableField(value = "yisheng_name")
    private String yishengName;


    /**
     * 科室
     */

    @TableField(value = "yisheng_types")
    private Integer yishengTypes;


    /**
     * 职位
     */

    @TableField(value = "zhiwei_types")
    private Integer zhiweiTypes;


    /**
     * 职称
     */

    @TableField(value = "yisheng_zhichneg")
    private String yishengZhichneg;


    /**
     * 医生头像
     */

    @TableField(value = "yisheng_photo")
    private String yishengPhoto;


    /**
     * 联系方式
     */

    @TableField(value = "yisheng_phone")
    private String yishengPhone;


    /**
     * 预约须知
     */

    @TableField(value = "yisheng_guahao")
    private String yishengGuahao;


    /**
     * 邮箱
     */

    @TableField(value = "yisheng_email")
    private String yishengEmail;


    /**
     * 履历介绍
     */

    @TableField(value = "yisheng_content")
    private String yishengContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：医生工号
	 */
    public String getYishengUuidNumber() {
        return yishengUuidNumber;
    }


    /**
	 * 获取：医生工号
	 */

    public void setYishengUuidNumber(String yishengUuidNumber) {
        this.yishengUuidNumber = yishengUuidNumber;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：医生名称
	 */
    public String getYishengName() {
        return yishengName;
    }


    /**
	 * 获取：医生名称
	 */

    public void setYishengName(String yishengName) {
        this.yishengName = yishengName;
    }
    /**
	 * 设置：科室
	 */
    public Integer getYishengTypes() {
        return yishengTypes;
    }


    /**
	 * 获取：科室
	 */

    public void setYishengTypes(Integer yishengTypes) {
        this.yishengTypes = yishengTypes;
    }
    /**
	 * 设置：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 获取：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：职称
	 */
    public String getYishengZhichneg() {
        return yishengZhichneg;
    }


    /**
	 * 获取：职称
	 */

    public void setYishengZhichneg(String yishengZhichneg) {
        this.yishengZhichneg = yishengZhichneg;
    }
    /**
	 * 设置：医生头像
	 */
    public String getYishengPhoto() {
        return yishengPhoto;
    }


    /**
	 * 获取：医生头像
	 */

    public void setYishengPhoto(String yishengPhoto) {
        this.yishengPhoto = yishengPhoto;
    }
    /**
	 * 设置：联系方式
	 */
    public String getYishengPhone() {
        return yishengPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setYishengPhone(String yishengPhone) {
        this.yishengPhone = yishengPhone;
    }
    /**
	 * 设置：预约须知
	 */
    public String getYishengGuahao() {
        return yishengGuahao;
    }


    /**
	 * 获取：预约须知
	 */

    public void setYishengGuahao(String yishengGuahao) {
        this.yishengGuahao = yishengGuahao;
    }
    /**
	 * 设置：邮箱
	 */
    public String getYishengEmail() {
        return yishengEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setYishengEmail(String yishengEmail) {
        this.yishengEmail = yishengEmail;
    }
    /**
	 * 设置：履历介绍
	 */
    public String getYishengContent() {
        return yishengContent;
    }


    /**
	 * 获取：履历介绍
	 */

    public void setYishengContent(String yishengContent) {
        this.yishengContent = yishengContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
