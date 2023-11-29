package TypeShells;

import java.util.ArrayList;

public class ArrListTest {

    private static ArrayList<String> getEmplNames(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Malic");
        names.add("Robert");
        names.add("Anna");
        names.add("Germiona");

        return names;
    }

    public static void main(String[] args) {
        ArrayList<String> emplNames = getEmplNames();
        ArrayList<Integer> emplAge = new ArrayList();
        ArrayList<Double> emplSalary = new ArrayList();

        for (int i =0;i<emplNames.size();i++){
            emplAge.add(20+i);
        }
        for (int i =0;i<emplNames.size();i++){
            double newI = Double.parseDouble(String.valueOf(i+1));
            emplSalary.add(1000.0*newI);
        }

        System.out.println(emplNames);
        System.out.println(emplAge);
        System.out.println(emplSalary);
    }

}
