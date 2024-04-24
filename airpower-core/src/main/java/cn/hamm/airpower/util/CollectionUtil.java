package cn.hamm.airpower.util;

import java.util.*;

/**
 * <h1>内置的集合工具类</h1>
 *
 * @author Hamm.cn
 */
public class CollectionUtil {
    /**
     * <h2>获取集合中的非null元素</h2>
     *
     * @param list       原始集合
     * @param fieldClass 数据类型
     * @param <T>        数据类型
     * @return 处理后的集合
     */
    public static <T> Collection<T> getCollectWithoutNull(Collection<T> list, Class<?> fieldClass) {
        if (Set.class.equals(fieldClass)) {
            return Objects.isNull(list) ? new HashSet<>() : list;
        }
        return Objects.isNull(list) ? new ArrayList<>() : list;
    }
}