package Collections;



public class Collections {
    public static void main(String[] args) {
        // get first collection
        String[] employees = getEmployees();

        // create new collection +1 person
        String[] newEmployees = new String[employees.length + 1];

        // passing the value from the first collection to the second
        for (int i = 0;i<employees.length;i++) {
            newEmployees[i] = employees[i];
        }

        //adds a new value to a new collection
        newEmployees[newEmployees.length - 1] = "Alex";
        employees = newEmployees;

        //method of deleting a single element
        employees[0] = null;
        String[] newestEmployees = new String[employees.length - 1];

        for (int i = 0, j = 0 ; i < employees.length;i++){
            String employee = employees[i];
            if (employee != null){
                newestEmployees[j] = employees[i];
                j++;
            }
        }
        //assignment
        employees = newestEmployees;

        //data output to the console
        for (String emp : employees) {
            System.out.println(emp);
        }

    }

    private static String[] getEmployees() {
        String[] employees = new String[5];
        employees[0] = "John";
        employees[1] = "Olivia";
        employees[2] = "Emma";
        employees[3] = "Max";
        employees[4] = "Nick";
        return employees;
    }
}




