package baithi_module2.service;

import baithi_module2.model.PaymentAccount;
import baithi_module2.model.SavingsAccount;
import baithi_module2.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccountService implements ISavingsAccountService {
    private final String BANKACCOUNT_FILE = "src/baithi_module2/data/bankcount.csv";

    @Override
    public List<SavingsAccount> getAll() {
        List<SavingsAccount> savingsAccountList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFile(BANKACCOUNT_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array.length == 8) {
                SavingsAccount savingsAccount = new SavingsAccount(Integer.parseInt(array[0]), array[1], array[2], array[3], Integer.parseInt(array[4]), array[5], Integer.parseInt(array[6]), Integer.parseInt(array[7]));
                savingsAccountList.add(savingsAccount);
            }
        }
        return savingsAccountList;
    }

    @Override
    public void add(SavingsAccount savingsAccount) {
        List<String> stringList = new ArrayList<>();
        stringList.add(savingsAccount.getInfoData());
        ReadAndWriteFile.writeFile(BANKACCOUNT_FILE, stringList, true);
    }

    @Override
    public boolean delete(String code) {
        List<SavingsAccount> savingsAccountList = getAll();
        for (int i = 0; i < savingsAccountList.size(); i++) {
            if (code.equals(savingsAccountList.get(i).getCode())) {
                savingsAccountList.remove(i);
                updateFile(savingsAccountList);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<SavingsAccount> searchByName(String name) {
        List<SavingsAccount> savingsAccountList = getAll();
        List<SavingsAccount> resultList = new ArrayList<>();
        for (SavingsAccount savingsAccount : savingsAccountList) {
            if (savingsAccount.getName().toLowerCase().contains(name.toLowerCase())) {
                resultList.add(savingsAccount);
            }
        }
        return resultList;
    }

    public void updateFile(List<SavingsAccount> savingsAccountList) {
        List<String> stringList = new ArrayList<>();
        for (SavingsAccount savingsAccount : savingsAccountList) {
            stringList.add(savingsAccount.getInfoData());
        }
        ReadAndWriteFile.writeFile(BANKACCOUNT_FILE, stringList, false); // Ghi đè file
    }

    public boolean check(String code) {
        List<SavingsAccount> savingsAccountList = getAll();
        for (int i = 0; i < savingsAccountList.size(); i++) {
            if (code.equals(savingsAccountList.get(i).getCode())) {
                return true;
            }
        }
        return false;
    }

}
