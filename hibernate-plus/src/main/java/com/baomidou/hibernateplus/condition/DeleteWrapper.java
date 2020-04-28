package com.baomidou.hibernateplus.condition;

import com.baomidou.hibernateplus.condition.wrapper.Wrapper;
import com.baomidou.hibernateplus.utils.StringUtils;

/**
 * <p>
 * Delete条件构造器
 * </p>
 *
 * @author K.D.Lee
 * @Date 2019-08-22
 */
@SuppressWarnings({"rawtypes", "serial"})
public class DeleteWrapper extends Wrapper {

    /**
     * DEFAULT
     */
    public static final DeleteWrapper DEFAULT = DeleteWrapper.instance();

    /**
     * 获取实例
     */
    public static DeleteWrapper instance() {
        return new DeleteWrapper();
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
