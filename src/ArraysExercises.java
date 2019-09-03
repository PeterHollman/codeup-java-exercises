import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {


    private static Person[] addPerson(Person[] group, Person newMember){
        Person[] newGroup = Arrays.copyOf(group, group.length + 1);
        newGroup[newGroup.length-1] = newMember;
        return newGroup;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = {new Person("Peter"), new Person("Paul"), new Person("Mary")};

        for (Person singer : people) {
            System.out.println(singer.getName());
        }
        Person[] newGroup = addPerson(people, new Person("Sally"));
//        Arrays.toString(newGroup);
        for (Person singer : newGroup) {
            System.out.println(singer.getName());
        }
    }

}
