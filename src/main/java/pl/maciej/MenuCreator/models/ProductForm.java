package pl.maciej.MenuCreator.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class ProductForm {
    private String name;
   @Max(1000)
    private int protein;
    @Max(1000)
    private int fat;
    @Max(1000)
    private int carbo;
    @Max(1000)
    private int kcal;
    @Max(1000)
    private int count;



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbo() {
        return carbo;
    }

    public void setCarbo(int carbo) {
        this.carbo = carbo;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductForm that = (ProductForm) o;
        return protein == that.protein &&
                fat == that.fat &&
                carbo == that.carbo &&
                kcal == that.kcal &&
                count == that.count &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, protein, fat, carbo, kcal, count);
    }
}
