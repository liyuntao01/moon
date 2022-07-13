package com.sun.moon.utils;

import java.util.Collection;
import java.util.Map;

/**
 * 公共方法
 * @author li
 */
public class CommonUtils {
    /**
     * 判断对象是否为null和空
     */

    public static boolean isObjectNull(Object object) {
        if (object == null) {
            return true;
        } else if (object instanceof Collection) {
            return ((Collection) object).isEmpty();
        } else if (object instanceof Map) {
            return ((Map) object).isEmpty();
        } else if (object instanceof String) {
            return ((String) object).trim().length() == 0;
        }
        return false;
    }

    /**
     * 判断对象是否为null和空 是
     */
    public static boolean isObjectNotNull(Object object) {
        return !CommonUtils.isObjectNull(object);
    }
}
