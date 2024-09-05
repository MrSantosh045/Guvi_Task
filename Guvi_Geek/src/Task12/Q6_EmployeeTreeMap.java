package Task12;
import java.util.Map;
import java.util.TreeMap;

public class Q6_EmployeeTreeMap {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add some employee IDs and names
        employeeMap.put(101, "John Doe");
        employeeMap.put(102, "Alice Smith");
        employeeMap.put(103, "David Brown");
        employeeMap.put(104, "Catherine White");

        // Print the employee names in alphabetical order
        System.out.println("Employee names in alphabetical order:");
        
        // Extract values from the TreeMap (which are already sorted by ID)
        employeeMap.values().stream()
                .sorted()  // Sort by names in alphabetical order
                .forEach(System.out::println);
    }
}
