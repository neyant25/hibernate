package com.baomidou.hibernateplus.utils;

import java.util.Map;

/**
 * MapUtils
 *
 * @author K.D.Lee
 * @Date 2019-08-22
 */
public class MapUtils {

    /**
     * 判断Map是否为空
     *
     * @param map
     * @return
     */
    public static boolean isEmpty(Map map) {
        return (map == null || map.isEmpty());
    }

    /**
     * 判断Map是否不为空
     *
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }

}
