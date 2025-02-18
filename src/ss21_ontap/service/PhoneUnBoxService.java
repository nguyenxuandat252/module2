package ss21_ontap.service;


import ss21_ontap.model.PhoneUnBox;
import ss21_ontap.util.ReadAndWriteFile;
import ss21_ontap.view.PhoneView;

import java.util.ArrayList;
import java.util.List;

public class PhoneUnBoxService implements IPhone<PhoneUnBox> {
    PhoneView phoneView = new PhoneView();
    public static List<PhoneUnBox> phoneUnBoxList = new ArrayList<>();
    public String PHONE_FILE = "src/ss21_ontap/data/phone.csv";
    private int count=1;
    @Override
    public List<PhoneUnBox> getAll() {
        List<String> stringList = ReadAndWriteFile.readFile(PHONE_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array.length == 8) {
                PhoneUnBox phoneUnBox = new PhoneUnBox(array[0], Integer.parseInt(array[1]), array[2], array[3], Double.parseDouble(array[4]), array[5], array[6], array[7]);
                phoneUnBoxList.add(phoneUnBox);
            }
        }
        return phoneUnBoxList;
    }

    @Override
    public void add(PhoneUnBox phoneUnBox) {
        List<String> stringList = new ArrayList<>();
        stringList.add("STT:"+count++ +"- " +phoneUnBox.getInfoData());
        ReadAndWriteFile.writeFile(PHONE_FILE, stringList, true);
    }

    @Override
    public void edit(int id, PhoneUnBox phoneUnBox) {
        for (int i = 0; i < phoneUnBoxList.size(); i++) {
            if(id==phoneUnBoxList.get(i).getId()){
                phoneUnBoxList.set(i,phoneUnBox);
                updateFile(phoneUnBoxList);
            }
        }
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < phoneUnBoxList.size(); i++) {
            if(id==phoneUnBoxList.get(i).getId()){
                phoneUnBoxList.remove(i);
                updateFile(phoneUnBoxList);
            }
        }
        return false;
    }

    @Override
    public boolean searchById(int id) {
        for (int i = 0; i < phoneUnBoxList.size(); i++) {
            if(id==phoneUnBoxList.get(i).getId()){
                System.out.println(phoneUnBoxList.get(i));
            }
        }
        return false;
    }

    @Override
    public List<PhoneUnBox> searchByName(String name) {
        return List.of();
    }
    public boolean checkIdUnbox(int id){
        for (int i = 0; i < phoneUnBoxList.size(); i++) {
            if(id==phoneUnBoxList.get(i).getId()){
                return true;
            }
        }
        return false;
    }

    private void updateFile(List<PhoneUnBox> phoneUnBoxList) {
        List<String> stringList = new ArrayList<>();
        for (PhoneUnBox phoneUnBox : phoneUnBoxList) {
            stringList.add(phoneUnBox.getInfoData());
        }
        ReadAndWriteFile.writeFile(PHONE_FILE, stringList, false); // Ghi đè file
    }
}
