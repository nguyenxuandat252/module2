package ss21_ontap.service;

import ss21_ontap.model.PhoneNew;

import java.util.List;

public interface IPhone<T> {
    List<T> getAll();

    void add(T t);

    void edit(int id, T t);

    boolean delete(int id);

    boolean searchById(int id);

    List<T> searchByName(String name);
}
