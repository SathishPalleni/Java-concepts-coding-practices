import java.util.List;
import java.util.stream.Collectors;

public class StackOverflowExample {

    public static void recursiveMethod()
    {
        recursiveMethod(); // calls itself forever
    }

    public static void main(String[] args) {

        recursiveMethod();
    }
}
/*
Given Employee(String name, int age, Department department)

- Get the list of employee names with Java Streams
- Get this list order by names
- Get the list of employees belonging to HR department given DepartmentType enum
with HR, ADMIN, RESEARCH values
- Group the employees by their department which is
result is Map<String, List<String>> where String key is department & List<String>
is employee names

 */
//t<Employee> employees = Arrays.asList();

