package hr.dream.factory.learning.equals;

public class Person implements Comparable<Person> {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return age == p.age;
       // return getAge().equals()
    }

    @Override
    public int hashCode() {
        return age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return PersonStaticTesting.isTheSame(this, o);
    }

    public String getName() {
        return name;
    }
}
