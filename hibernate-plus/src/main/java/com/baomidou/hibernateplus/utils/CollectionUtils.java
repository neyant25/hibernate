package com.baomidou.hibernateplus.utils;

import java.util.Collection;

/**
 * <p>
 * Collection工具类
 * </p>
 *
 * @author K.D.Lee
 * @Date 2019-08-22
 */
public class CollectionUtils {

    /**
     * <p>
     * 校验集合是否为空
     * </p>
     *
     * @param coll
     * @return boolean
     */
    public static boolean isEmpty(Collection<?> coll) {
        return (coll == null || coll.isEmpty());
    }

    /**
     * <p>
     * 校验集合是否不为空
     * </p>
     *
     * @param coll
     * @return boolean
     */
    public static boolean isNotEmpty(Collection<?> coll) {
        return !isEmpty(coll);
    }

}
