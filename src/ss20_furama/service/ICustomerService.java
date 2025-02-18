package ss20_furama.service;

import ss20_furama.model.Customer;
import ss20_furama.model.Employee;

public interface ICustomerService extends IService<Customer> {
    public boolean edit(int code, Customer customer);
}
