package baithi_module2.service;

import baithi_module2.model.PaymentAccount;

import java.util.List;

public interface IPaymentAccountService {
    List<PaymentAccount> getAll();

    void add(PaymentAccount paymentAccount);

    boolean delete(String code);

    List<PaymentAccount> searchByName(String name);
}
