package plecak;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa Instantion deklarująca instancję problemu do rozwiązania
 */
public class Instantion {

    /**
     * Deklaracja pól instancji:
     * pojemności plecaka i Listy przedmiotów instancji typu Item
     */
    public int bagSize;
    private List<Item> items = new ArrayList<>();

    /**
     * Konstruktor klas Instantion
     */
    public Instantion() {
        this.bagSize = bagSize;
        this.items = items;
    }

    /**
     * Metoda pokazująca w konsoli aktualną zawarość listy items
     */
    public void showAvilibleItems() {
        for (Item avilibleItem : items) {
            System.out.println("Wartość: " + avilibleItem.getValue() + " Rozmiar: " + avilibleItem.getSize());
        }
    }

    /**
     * Metoda dodajaca item do listy items
     */
    public void addItem(double value, int size) {
        items.add(new Item(value, size));
    }

    /**
     * Metoda usatwiająca wartość pola bagSize
     */
    public void setBagSize(int bagSize) {
        this.bagSize = bagSize;
    }

    /**
     * Metoda zwracająca bagSize
     */
    public int getBagSize() {
        return bagSize;
    }

    /**
     * Metoda zwracająca listę items
     */
    public List<Item> getItems() {
        return items;
    }
}

