package ref_08;

import ref_01.Person;

public class ToolDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Tool t = new Tool();
        t.setProperty(p, "name", "林青霞");
        t.setProperty(p, "age", 27);
        System.out.println(p);
        System.out.println("-----------");
    }
}
