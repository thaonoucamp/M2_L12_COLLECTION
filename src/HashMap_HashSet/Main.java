package HashMap_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(20, "a", "HN");
        Student s2 = new Student(21, "b", "HN");
        Student s3 = new Student(22, "c", "HN");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, s1);
        studentMap.put(4, s2);
        studentMap.put(2, s3);
        studentMap.put(3, s1);

        for (Map.Entry<Integer, Student> stu : studentMap.entrySet()) {
            System.out.println(stu.toString());
        }

        System.out.println("-----Set-----");
        Set<Student> students = new HashSet<Student>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s1);

        for (Student std : students) {
            System.out.println(std.toString());
        }
    }
}
