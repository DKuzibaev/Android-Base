package TypeShells;

import java.util.ArrayList;
import java.util.HashSet;

public class BuiltInTypes {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0;i<5;i++){
            numbers.add(i);
        }

        ArrayList<String> names = getEmployees();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0;i<numbers.size();i++){
            result.add(" " + numbers.get(i) + " - " + names.get(i));
        }

        for (String nameAndNumb : result) {
            System.out.println(nameAndNumb);
        }

        // Элементы внутри HashSet хранятся беспорядочно а ArrayList в порядке добавления
        // В этой коллекции отсуствует методо get() который хранит элм. по индексу
        // Если мы хотим вывести данный из hash то мы не сможем воспользоваться обычным циклом for только циклом foreach
        // Важная особенность! HashSet - неможет хранить в себе одинаковые данные
        // Если мы добавим еще одно имя "Own" то в hashset будет сохранено только одно, hashset не хранит дубликатов

        HashSet<String> empl = getEmpl();

        for (String em: empl) {
            System.out.println(em);
        }
    }

    private static ArrayList<String> getEmployees(){
        // в угловых скобках указывает тип данных который будет храниться в коллекции
        ArrayList<String> employees = new ArrayList();
        employees.add("John");
        employees.add("Sara");
        employees.add("Own");
        employees.add("Indy");
        employees.add("Adam");
        //дженерики - это обобщенные типы данных


        return employees;
    }

    private static HashSet<String> getEmpl(){
        HashSet<String> empl = new HashSet<>();
        empl.add("John");
        empl.add("Sara");
        empl.add("Own");
        empl.add("Indy");
        empl.add("Adam");

        return empl;
    }
}

