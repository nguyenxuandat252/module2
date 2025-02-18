package qlsp.controller;

import qlsp.view.View;

public class ProductController {
    public static void displayMenu(){
        boolean flag=true;
        while (flag){
            System.out.println("------Menu chính-----"+
                    "\n 1.Clothes"+
                    "\n 2.Confectionery"+
                    "\n 3.Exit");
            System.out.println("Select: ");
            int choose = View.inputSelection();
            switch (choose){
                case 1:
                    ClothesController.displayClothes();
                    break;
                case 2:
                    break;
                case 3:
                    System.exit(0);
            }
        }

    }


}
