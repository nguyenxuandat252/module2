package qlsp.view;

import qlsp.model.Clothes;
import qlsp.service.ClothesService;

import java.util.Scanner;

public class View {
    ClothesService clothesService=new ClothesService();
    public static Scanner sc=new Scanner(System.in);

    public void addClother(){
        System.out.println("input code: ");
        int code =Integer.parseInt(sc.nextLine());
        System.out.println("input type: ");
        String type =sc.nextLine();
        System.out.println("input price: ");
        int price =Integer.parseInt(sc.nextLine());
        System.out.println("input size: ");
        int size =Integer.parseInt(sc.nextLine());
        clothesService.addClothes(new Clothes(code,type,price,size));
    }

    public static int inputSelection(){
        System.out.println();
        int selection = Integer.parseInt(sc.nextLine());
        return selection;
    }


}
