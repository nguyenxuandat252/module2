package qlsp.service;

import qlsp.model.Clothes;

import java.util.List;

public interface IClothesService {
    List<Clothes> getClothesAll();
    void addClothes(Clothes clothes);
    boolean editClothes(int code, Clothes clothes);
    boolean deleteClothes(int code);
    List<Clothes> searchClothes(int code);
}
