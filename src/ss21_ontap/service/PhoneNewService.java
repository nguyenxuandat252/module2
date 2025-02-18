package ss21_ontap.service;

import ss21_ontap.model.PhoneNew;
import ss21_ontap.model.PhoneUnBox;
import ss21_ontap.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class PhoneNewService implements IPhone<PhoneNew> {
    public String PHONE_FILE = "src/ss21_ontap/data/phone.csv";
    public List<PhoneNew> phoneNewList = new ArrayList<>();
    private int count=1;

    @Override
    public List<PhoneNew> getAll() {
        List<String> stringList = ReadAndWriteFile.readFile(PHONE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array.length == 7) {
                PhoneNew phoneNew = new PhoneNew(array[0], Integer.parseInt(array[1]), array[2], array[3], Double.parseDouble(array[4]), array[5], array[6]);
                phoneNewList.add(phoneNew);
            }
        }
        return phoneNewList;
    }

    @Override
    public void add(PhoneNew phoneNew) {
        List<String> stringList = new ArrayList<>();
        stringList.add("STT:"+count++ +"- " +phoneNew.getInfoData());
        ReadAndWriteFile.writeFile(PHONE_FILE, stringList, true);
    }

    @Override
    public void edit(int id, PhoneNew phoneNew) {
        for (int i = 0; i < phoneNewList.size(); i++) {
            if(id==phoneNewList.get(i).getId()){
                phoneNewList.set(i,phoneNew);
                updateFile(phoneNewList);
            }
        }
    }

    public boolean checkIdNew(int id){
        for (int i = 0; i < phoneNewList.size(); i++) {
            if(id==phoneNewList.get(i).getId()){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < phoneNewList.size(); i++) {
            if(id==phoneNewList.get(i).getId()){
                phoneNewList.remove(i);
                updateFile(phoneNewList);
            }
        }
        return false;
    }

    @Override
    public boolean searchById(int id) {
        for (int i = 0; i < phoneNewList.size(); i++) {
            if(id==phoneNewList.get(i).getId()){
                System.out.println(phoneNewList.get(i));
            }
        }
        return false;
    }

    @Override
    public List<PhoneNew> searchByName(String name) {
        return List.of();
    }
    private void updateFile(List<PhoneNew> phoneNewList) {
        List<String> stringList = new ArrayList<>();
        for (PhoneNew phoneNew : phoneNewList) {
            stringList.add(phoneNew.getInfoData());
        }
        ReadAndWriteFile.writeFile(PHONE_FILE, stringList, false); // Ghi đè file
    }

}