package qlsp.controller;

import qlsp.model.Clothes;
import qlsp.service.ClothesService;
import qlsp.view.View;

public class ClothesController {
    public static void displayClothes(){
        ClothesService clothesService = new ClothesService();
        View view=new View();
        boolean flag=true;
        while (flag){
            System.out.println("------Menu Clothes-----"+
                    "\n 1.Display"+
                    "\n 2.Add"+
                    "\n 3.Edit"+
                    "\n 4.Delete"+
                    "\n 5.Search"+
                    "\n 6.Main Menu");
            System.out.println("Select: ");
            int choose = View.inputSelection();
            switch (choose){
                case 1:
                    clothesService.getClothesAll();
                    break;
                case 2:
                    view.addClother();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }
}
