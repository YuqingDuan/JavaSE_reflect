package ref_07;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 */
public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        // 创建集合对象
        ArrayList<Integer> array = new ArrayList<>();

        // 集合ArrayList的class文件对象
        Class c = array.getClass();

        // 通过class文件对象拿到add()方法
        Method m = c.getMethod("add", Object.class);

        m.invoke(array, "hello");
        m.invoke(array, "world");
        m.invoke(array, "java");

        System.out.println(array);
    }
}
