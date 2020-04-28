package com.baomidou.hibernateplus.converter.type;

/**
 * 枚举接口
 *
 * @author K.D.Lee
 * @Date 2019-08-22
 * Time: 下午4:13
 */
public interface IEnum {

    /**
     * 获取枚举编码
     *
     * @return
     */
    String getCode();

    /**
     * 获取枚举描述
     *
     * @return
     */
    String getDesc();
}
