package lesson_SHK.code.part2_object_oriented.day13.test10_JUnit;

import org.junit.Test;

public class JUnitTest {

    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";

        System.out.println(s1.equals(s2));
    }
}
