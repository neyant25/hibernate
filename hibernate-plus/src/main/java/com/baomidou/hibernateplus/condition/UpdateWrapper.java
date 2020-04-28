package com.baomidou.hibernateplus.condition;

import java.util.HashMap;
import java.util.Map;

import com.baomidou.hibernateplus.condition.wrapper.Wrapper;
import com.baomidou.hibernateplus.utils.StringUtils;

/**
 * <p>
 * Update条件构造器
 * </p>
 *
 * @author K.D.Lee
 * @Date 2019-08-22
 */
@SuppressWarnings({"rawtypes", "serial"})
public class UpdateWrapper extends Wrapper {

    /**
     * DEFAULT
     */
    public static final UpdateWrapper DEFAULT = UpdateWrapper.instance();
    /**
     * SQL SET内容，例如：set id = 1
     */
    protected final Map<String, String> setMap = new HashMap<String, String>();

    /**
     * 获取实例
     */
    public static UpdateWrapper instance() {
        return new UpdateWrapper();
    }

    /**
     * 执行一次set操作
     *
     * @param key
     * @param value
     * @return
     */
    public UpdateWrapper set(String key, String value) {
        setMap.put(key, value);
        return this;
    }

    /**
     * 执行多次set操作
     *
     * @param setMap
     * @return
     */
    public UpdateWrapper sets(Map<String, String> setMap) {
        this.setMap.putAll(setMap);
        return this;
    }

    /**
     * 获取setMap
     *
     * @return
     */
    @Override
    public Map<String, String> getSetMap() {
        return setMap;
    }

    /**
     * SQL 片段
     */
    @Override
    public String getSqlSegment() {
        /*
		 * 无条件
		 */
        String sqlWhere = sql.toString();
        if (StringUtils.isBlank(sqlWhere)) {
            return StringUtils.EMPTY;
        }

        return sqlWhere;
    }

}
