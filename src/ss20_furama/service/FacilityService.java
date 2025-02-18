package ss20_furama.service;

import ss20_furama.model.*;
import ss20_furama.util.ReadAndWriteFile;

import java.util.*;

public class FacilityService implements IFacilityService {
    public static String FACILITY_FILE = "src/ss20_furama/data/facility.csv";

    public Map<Facility, Integer> getMap() {
        Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
        List<String> stringList = ReadAndWriteFile.readFile(FACILITY_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            if (array[0].contains("VL")) {
                facilityMap.put(new Villa(Arrays.copyOf(array, array.length - 1)), Integer.valueOf(array[array.length - 1]));
            }if (array[0].contains("RO")) {
                facilityMap.put(new Room(Arrays.copyOf(array, array.length - 1)), Integer.valueOf(array[array.length - 1]));
            }if(array[0].contains("HO")){
                facilityMap.put(new House(Arrays.copyOf(array, array.length - 1)), Integer.valueOf(array[array.length - 1]));
            }
        }
        return facilityMap;
    }

    @Override
    public List<Facility> facilityMaintenance() {
        return List.of();
    }

    @Override
    public List<Facility> getList() {
        return List.of();
    }

    @Override
    public void add(Facility facility) {
        Map<Facility,Integer> facilityMap = getMap();
        List<String> stringList1 = new ArrayList<>();
        boolean check = false;
        for (Facility key: facilityMap.keySet()){
            if (key.getCode().equals(facility.getCode())) {
                check = true;
                System.out.println("Tồn tại !");
                break;
            }
        }
        if(!check){
            stringList1.add(facility.getInfoFacilityData() + "," + 0);
            ReadAndWriteFile.writeFile(FACILITY_FILE, stringList1, true);
        }

    }
}
