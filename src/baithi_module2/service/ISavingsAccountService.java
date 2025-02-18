package baithi_module2.service;

import baithi_module2.model.SavingsAccount;

import java.util.List;

public interface ISavingsAccountService {
    List<SavingsAccount> getAll();

    void add(SavingsAccount savingsAccount);

    boolean delete(String code);

    List<SavingsAccount> searchByName(String name);
}
