package ss20_furama.service;

import ss20_furama.model.Customer;
import ss20_furama.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    private final String CUSTOMER_FILE = "src/ss20_furama/data/customer.csv";

    @Override
    public boolean edit(int code, Customer customer) {
        List<Customer> customerList = getList();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i) != null && customerList.get(i).getCode() == code) {
                customerList.set(i, customer);
                updateFile(customerList);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Customer> getList() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(CUSTOMER_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            Customer customer = new Customer(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfoCustomerData());
        ReadAndWriteFile.writeFile(CUSTOMER_FILE, stringList, true);
    }


    private void updateFile(List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInfoCustomerData());
        }
        ReadAndWriteFile.writeFile(CUSTOMER_FILE, stringList, false); // Ghi đè file
    }
}
