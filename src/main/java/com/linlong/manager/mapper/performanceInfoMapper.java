package com.linlong.manager.mapper;

import com.linlong.salary.entity.performanceInfo;

public interface performanceInfoMapper {
    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(performanceInfo record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(performanceInfo record);

    /**
     *
     * @mbg.generated
     */
    performanceInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(performanceInfo record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(performanceInfo record);
}