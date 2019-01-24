package ref_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws Exception {
        // 反射前的做法
        // Student s = new Student();
        // s.love();
        // Teacher t = new Teacher();
        // t.love();
        // Worker w = new Worker();
        // w.love();

        // 反射后的做法
        // 加载键值对数据
        Properties prop = new Properties();
        BufferedReader br = new BufferedReader(new FileReader("ref.properties"));
        prop.load(br);
        br.close();

        // 获取数据
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        // 反射
        Class c = Class.forName(className);

        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        // 调用方法
        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
