package ss20_furama.service;

import ss20_furama.model.Employee;

import java.util.List;

public interface IEmployeeService extends  IService<Employee>{
    public boolean edit(int code, Employee employee);
}
