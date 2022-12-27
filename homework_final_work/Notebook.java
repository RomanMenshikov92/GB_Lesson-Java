package homework_final_work;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private int id, ram, sdd;
    private String brand, os, model, color;

    public Notebook(String color, String brand, String model, int ram, int sdd, String os, int id) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.sdd = sdd;
        this.os = os;
        this.color = color;

    }

    public String toString() {
        return "\nNotebook id: " + id + "\n" +
                "brand: " + brand +
                ", model: " + model + "\n" +
                "ram: " + ram +
                ", hd: " + sdd +
                ", os: " + os +
                ", color " + color;
    }

    public String getModel() {
        return model;
    }

    public static List<Notebook> getBooksByColor(List<Notebook> selectNotebook, String color) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : selectNotebook) {
            if (c.color.toLowerCase().equals(color.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByOs(List<Notebook> selectNotebook, String OS) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : selectNotebook) {
            if (c.os.toLowerCase().equals(OS.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByVendor(List<Notebook> selectNotebook, String brand) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : selectNotebook) {
            if (c.brand.toLowerCase().equals(brand.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByRam(List<Notebook> selectNotebook, int min, int max) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : selectNotebook) {
            if ((c.ram >= min) && (c.ram <= max)) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByHdd(List<Notebook> selectNotebook, int min, int max) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : selectNotebook) {
            if ((c.sdd >= min) && (c.sdd <= max)) {
                result.add(c);
            }
        }
        return result;
    }
}