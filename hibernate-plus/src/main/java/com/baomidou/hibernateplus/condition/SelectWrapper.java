package com.baomidou.hibernateplus.condition;

import com.baomidou.hibernateplus.condition.wrapper.Wrapper;
import com.baomidou.hibernateplus.utils.StringUtils;

/**
 * <p>
 * Select条件构造器
 * </p>
 *
 * @author K.D.Lee
 * @Date 2019-08-22
 */
@SuppressWarnings({"rawtypes", "serial"})
public class SelectWrapper extends Wrapper {

    /**
     * DEFAULT
     */
    public static final SelectWrapper DEFAULT = SelectWrapper.instance();
    /**
     * SQL 查询字段内容，例如：id,name,age
     */
    protected String sqlSelect;

    /**
     * 获取实例
     */
    public static SelectWrapper instance() {
        return new SelectWrapper();
    }

    /**
     * 获取select
     *
     * @return
     */
    public String getSqlSelect() {
        if (StringUtils.isBlank(sqlSelect)) {
            return StringUtils.EMPTY;
        }
        return stripSqlInjection(sqlSelect);
    }

    /**
     * 设置select
     *
     * @param sqlSelect
     * @return
     */
    public SelectWrapper setSqlSelect(String sqlSelect) {
        if (StringUtils.isNotBlank(sqlSelect)) {
            this.sqlSelect = sqlSelect;
        }
        return this;
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
