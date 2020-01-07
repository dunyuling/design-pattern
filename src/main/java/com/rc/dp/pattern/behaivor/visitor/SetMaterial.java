package com.rc.dp.pattern.behaivor.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName SetMaterial
 * @Description 对象结构角色:材料集
 * @Author liux
 * @Date 20-1-3 下午12:02
 * @Version 1.0
 */
public class SetMaterial {
    private List<Material> list = new ArrayList<Material>();

    public String accept(Company visitor) {
        Iterator<Material> i = list.iterator();
        String tmp = "";
        while (i.hasNext()) {
            tmp += ((Material) i.next()).accept(visitor) + " ";
        }
        return tmp; //返回某公司的作品集
    }

    public void add(Material element) {
        list.add(element);
    }

    public void remove(Material element) {
        list.remove(element);
    }
}
