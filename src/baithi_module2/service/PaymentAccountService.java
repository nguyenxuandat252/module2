package baithi_module2.service;

import baithi_module2.model.PaymentAccount;
import baithi_module2.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PaymentAccountService implements IPaymentAccountService {
    private final String BANKACCOUNT_FILE = "src/baithi_module2/data/bankcount.csv";

    @Override
    public List<PaymentAccount> getAll() {
        List<PaymentAccount> paymentAccountList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(BANKACCOUNT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array.length == 6) {
                PaymentAccount paymentAccount = new PaymentAccount(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], Integer.parseInt(array[5]));
                paymentAccountList.add(paymentAccount);
            }
        }
        return paymentAccountList;
    }

    @Override
    public void add(PaymentAccount paymentAccount) {
        List<String> stringList = new ArrayList<>();
        stringList.add(paymentAccount.getInfoData());
        ReadAndWriteFile.writeFile(BANKACCOUNT_FILE, stringList, true);
    }

    @Override
    public boolean delete(String code) {
        List<PaymentAccount> paymentAccountList = getAll();
        for (int i = 0; i < paymentAccountList.size(); i++) {
            if (code.equals(paymentAccountList.get(i).getCode())) {
                paymentAccountList.remove(i);
                updateFile(paymentAccountList);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<PaymentAccount> searchByName(String name) {
        List<PaymentAccount> paymentAccountList = getAll();
        List<PaymentAccount> resultList = new ArrayList<>();
        for (PaymentAccount paymentAccount : paymentAccountList) {
            if (paymentAccount.getName().toLowerCase().contains(name.toLowerCase())) {
                resultList.add(paymentAccount);
            }
        }
        return resultList;
    }

    public void updateFile(List<PaymentAccount> paymentAccountList) {
        List<String> stringList = new ArrayList<>();
        for (PaymentAccount paymentAccount : paymentAccountList) {
            stringList.add(paymentAccount.getInfoData());
        }
        ReadAndWriteFile.writeFile(BANKACCOUNT_FILE, stringList, false); // Ghi đè file
    }

    public boolean check(String code) {
        List<PaymentAccount> paymentAccountList = getAll();
        for (int i = 0; i < paymentAccountList.size(); i++) {
            if (code.equals(paymentAccountList.get(i).getCode())) {
                return true;
            }
        }
        return false;
    }
}
