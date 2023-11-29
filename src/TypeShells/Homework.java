package TypeShells;

import org.w3c.dom.ls.LSOutput;

public class Homework {

    public static void main(String[] args) {
        String greeating = "This is John. He is 27 years old!";

        //cut name
        String name = greeating.substring(8,12);

        // cut age and parse to Integer
        String age = greeating.substring(20,22);
        int ageToInt = Integer.parseInt(age);

        Persone ps1 = new Persone(name, ageToInt);

        System.out.println(ps1.getName() + " " + ps1.getAge());
    }

}
