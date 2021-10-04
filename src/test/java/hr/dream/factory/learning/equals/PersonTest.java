package hr.dream.factory.learning.equals;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void name() {
        Person p1 = createPerson("Frane");
        Person p2 = createPerson("Vice");

        Assert.assertEquals(p1, p2);
    }

    private Person createPerson(String vice) {
        Person p2 = new Person();
        p2.age = 7;
        p2.name = vice;
        return p2;
    }

    @Test
    public void dane() {
        Set<Person> aPersonSet = new HashSet<>();

        Person p1 = createPerson("Frane");
        Person p2 = createPerson("Vice");

        aPersonSet.add(p1);
        aPersonSet.add(p2);

        Assert.assertEquals(1 ,aPersonSet.size());
    }

    @Test
    public void comparing() {
        Person p1 = createPerson("Frane");
        Person p2 = createPerson("Vice");
        Person p3 = createPerson("Vice");
        p3.age = 2;
        int compared = "Frane".compareTo("Vice");
        assertTrue(0 > p1.compareTo(p3));
        assertTrue(0 < p2.compareTo(p3));
        System.out.println("it works!");
        assertTrue(0 > p1.compareTo(p2));
    }

    @Test
    public void comparingStatic() {
        Person p1 = createPerson("Frane");
        Person p2 = createPerson("Vice");

        int theSame = PersonStaticTesting.isTheSame(p1, p2);
        assertEquals(theSame,  p1.compareTo(p2));
        assertTrue(0 > theSame);
    }
}
