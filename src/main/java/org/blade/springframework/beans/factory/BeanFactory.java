package org.blade.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    /**
     * 注册bean
     *
     * @param name
     * @param bean
     */
    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    /**
     * 获取bean
     *
     * @param name
     * @return
     */
    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
