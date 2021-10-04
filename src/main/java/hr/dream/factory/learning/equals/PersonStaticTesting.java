package hr.dream.factory.learning.equals;

public class PersonStaticTesting {

    public static int isTheSame(Person p1, Person p2) {
        int compareResult = p1.name.compareTo(p2.getName());

        if (! (compareResult == 0)) {
            return compareResult;
        }

        return Integer.compare(p1.age, p2.age);
    }

}
