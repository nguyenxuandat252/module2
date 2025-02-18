package ss20_furama.service;

import ss20_furama.model.Employee;

import java.util.List;

public interface IService<S> {
    List<S> getList();
    public void add(S s);
}
