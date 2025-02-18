package ss20_furama.service;

import ss20_furama.model.Employee;
import ss20_furama.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final String EMPLOYEE_FILE = "src/ss20_furama/data/employee.csv";

    @Override
    public boolean edit(int code, Employee employee) {
        List<Employee> employeeList = getList();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) != null && employeeList.get(i).getCode() == code) {
                employeeList.set(i, employee);
                updateFile(employeeList);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getList() {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(EMPLOYEE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Employee employee = new Employee(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Double.parseDouble(array[9]));
            employeeList.add(employee);
        }
        return employeeList;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfoEmployeeData());
        ReadAndWriteFile.writeFile(EMPLOYEE_FILE, stringList, true);
    }


    private void updateFile(List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoEmployeeData());
        }
        ReadAndWriteFile.writeFile(EMPLOYEE_FILE, stringList, false); // Ghi đè file
    }
}
