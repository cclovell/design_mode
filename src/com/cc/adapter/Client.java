package com.cc.adapter;

import com.cc.adapter.classadapter.ClassAdapter;
import com.cc.adapter.classadapter.Source;
import com.cc.adapter.objectadapter.ObjectAdapter;

/**
 * 适配器模式
 *
 * @author chenchao
 * @date 2018/10/18 下午2:35
 */
public class Client {
    public static void main(String args[]) {
        ClassAdapter adapter = new ClassAdapter();
        adapter.simpleOperation2();
        adapter.simpleOperation1();

        ObjectAdapter objectAdapter = new ObjectAdapter(new Source());
        objectAdapter.simpleOperation1();
        objectAdapter.simpleOperation2();
    }
}
