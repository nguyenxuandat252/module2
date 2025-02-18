package qlsp.service;


import qlsp.model.Clothes;

import java.util.ArrayList;
import java.util.List;

public class ClothesService implements IClothesService {

    List<Clothes> clothesList=new ArrayList<>();
    @Override
    public List<Clothes> getClothesAll() {
        for (int i=0;i<clothesList.size();i++){
            if(clothesList.get(i)!=null){
                System.out.println(clothesList.get(i));
            }
        }
        return clothesList;
    }

    @Override
    public void addClothes(Clothes clothes) {
        clothesList.add(clothes);
    }

    @Override
    public boolean editClothes(int code, Clothes clothes) {
        for (int i = 0; i < clothesList.size(); i++) {
            if(code==clothesList.get(i).getCode()){
                clothesList.set(i,clothes);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteClothes(int code) {
        for (int i = 0; i < clothesList.size(); i++) {
            if(code==clothesList.get(i).getCode()){
                clothesList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Clothes> searchClothes(int code) {
        List<Clothes> clothesListNew= new ArrayList<>();
        for (int i = 0; i < clothesList.size(); i++) {
            if(code==clothesList.get(i).getCode()){
                clothesListNew.add(clothesList.get(i));
            }
        }
        return clothesListNew;
    }
}
