package ss20_furama.view;

import ss20_furama.model.Facility;
import ss20_furama.model.House;
import ss20_furama.model.Room;
import ss20_furama.model.Villa;

import java.util.Scanner;

public class ViewFacility {
    private static Scanner scanner = new Scanner(System.in);
    public static Facility inputFacility(){

        boolean flag=true;
        while (flag){
            System.out.println("1. Thêm Room"+
                    "\n 2. Thêm Villa"+
                    "\n 3. Thêm House"+
                    "\n Chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("input facilityFree: ");
                    String facilityFree = scanner.nextLine();
                    String[] array= inputFacility1();
                    Facility room = new Room(array[0],array[1],Float.parseFloat(array[2]),Float.parseFloat(array[3]),Integer.parseInt(array[4]),array[5],facilityFree);
                    return room;
                case 2:
                    System.out.println("input standard: ");
                    String standard = scanner.nextLine();
                    System.out.println("input poolArea: ");
                    String poolArea = scanner.nextLine();
                    String[] array1= inputFacility1();
                    Facility villa = new Villa(array1[0],array1[1],Float.parseFloat(array1[2]),Float.parseFloat(array1[3]),Integer.parseInt(array1[4]),array1[5],standard,Float.parseFloat(poolArea));
                    return villa;
                case 3:
                    System.out.println("input standard: ");
                    String standard1 = scanner.nextLine();
                    System.out.println("input floors: ");
                    String floors = scanner.nextLine();
                    String[] array2= inputFacility1();
                    Facility house = new House(array2[0],array2[1],Float.parseFloat(array2[2]),Float.parseFloat(array2[3]),Integer.parseInt(array2[4]),array2[5],standard1,Integer.parseInt(floors));
                    return house;
                default:
                    System.out.println("Chọn sai !");
            }

        }
        return null;
    }
    public static String[] inputFacility1(){
        String[] array= new String[6];
        System.out.println("Input code: ");
        array[0] = scanner.nextLine();
        System.out.println("Input name: ");
        array[1] = scanner.nextLine();
        System.out.println("Input area: ");
        array[2] = scanner.nextLine();
        System.out.println("Input expense: ");
        array[3] = scanner.nextLine();
        System.out.println("Input maxPeople: ");
        array[4] = scanner.nextLine();
        System.out.println("Input rentalType: ");
        array[5] = scanner.nextLine();
        return array;
    }
}
