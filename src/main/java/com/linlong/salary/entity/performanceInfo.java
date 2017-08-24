package com.linlong.salary.entity;

import java.math.BigDecimal;
import java.util.Date;

public class performanceInfo {
    /**
     * 主键
     * id
     */
    private Integer id;

    /**
     * 部门编码
     * organize_code
     */
    private String organizeCode;

    /**
     * 员工编号
     * staff_number
     */
    private Integer staffNumber;

    /**
     * 绩效奖金
     * performance
     */
    private BigDecimal performance;

    /**
     * 项目奖金
     * project_funds
     */
    private BigDecimal projectFunds;

    /**
     * 其他1
     * other_one
     */
    private BigDecimal otherOne;

    /**
     * 其他2
     * other_two
     */
    private BigDecimal otherTwo;

    /**
     * 其他3
     * other_three
     */
    private BigDecimal otherThree;

    /**
     * 创建时间
     * create_time
     */
    private Date createTime;

    /**
     *
     * @mbg.generated
     */
    public performanceInfo(Integer id, String organizeCode, Integer staffNumber, BigDecimal performance, BigDecimal projectFunds, BigDecimal otherOne, BigDecimal otherTwo, BigDecimal otherThree, Date createTime) {
        this.id = id;
        this.organizeCode = organizeCode;
        this.staffNumber = staffNumber;
        this.performance = performance;
        this.projectFunds = projectFunds;
        this.otherOne = otherOne;
        this.otherTwo = otherTwo;
        this.otherThree = otherThree;
        this.createTime = createTime;
    }

    /**
     *
     * @mbg.generated
     */
    public performanceInfo() {
        super();
    }

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 部门编码
     * @return organize_code 部门编码
     */
    public String getOrganizeCode() {
        return organizeCode;
    }

    /**
     * 部门编码
     * @param organizeCode 部门编码
     */
    public void setOrganizeCode(String organizeCode) {
        this.organizeCode = organizeCode == null ? null : organizeCode.trim();
    }

    /**
     * 员工编号
     * @return staff_number 员工编号
     */
    public Integer getStaffNumber() {
        return staffNumber;
    }

    /**
     * 员工编号
     * @param staffNumber 员工编号
     */
    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    /**
     * 绩效奖金
     * @return performance 绩效奖金
     */
    public BigDecimal getPerformance() {
        return performance;
    }

    /**
     * 绩效奖金
     * @param performance 绩效奖金
     */
    public void setPerformance(BigDecimal performance) {
        this.performance = performance;
    }

    /**
     * 项目奖金
     * @return project_funds 项目奖金
     */
    public BigDecimal getProjectFunds() {
        return projectFunds;
    }

    /**
     * 项目奖金
     * @param projectFunds 项目奖金
     */
    public void setProjectFunds(BigDecimal projectFunds) {
        this.projectFunds = projectFunds;
    }

    /**
     * 其他1
     * @return other_one 其他1
     */
    public BigDecimal getOtherOne() {
        return otherOne;
    }

    /**
     * 其他1
     * @param otherOne 其他1
     */
    public void setOtherOne(BigDecimal otherOne) {
        this.otherOne = otherOne;
    }

    /**
     * 其他2
     * @return other_two 其他2
     */
    public BigDecimal getOtherTwo() {
        return otherTwo;
    }

    /**
     * 其他2
     * @param otherTwo 其他2
     */
    public void setOtherTwo(BigDecimal otherTwo) {
        this.otherTwo = otherTwo;
    }

    /**
     * 其他3
     * @return other_three 其他3
     */
    public BigDecimal getOtherThree() {
        return otherThree;
    }

    /**
     * 其他3
     * @param otherThree 其他3
     */
    public void setOtherThree(BigDecimal otherThree) {
        this.otherThree = otherThree;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}