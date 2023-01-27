package AssociativeArrays.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyUsers = new TreeMap<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] data = command.split(" -> ");
            String company = data[0];
            String employeeID = data[1];

            if (!companyUsers.containsKey(company)) {
                companyUsers.put(company, new ArrayList<>());
            }

            if (companyUsers.containsKey(company) && !companyUsers.get(company).contains(employeeID)) {
                companyUsers.get(company).add(employeeID);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyUsers.entrySet()) {
            System.out.println(entry.getKey());
            for (String id : entry.getValue()){
                System.out.println("-- " + id);
            }
        }


    }
}
