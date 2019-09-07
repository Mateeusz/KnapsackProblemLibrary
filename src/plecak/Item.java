package plecak;

/**
 * Klasa Item 
 */
public class Item {

    /**
     * Deklaracja pól przedmiotu
     */
    private double value;
    private int size;

    /**
     * Konstruktor klasy Item
     */
    public Item(double value, int size) {
        this.value = value;
        this.size = size;
    }

    /**
     * Metoda zwracająca value
     */
    public double getValue() {
        return value;
    }

    /**
     * Metoda zwracająca size
     */
    public int getSize() {
        return size;
    }

    /**
     * Metoda ustawiająca value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Metoda ustawiająca size
     */
    public void setSize(int size) {
        this.size = size;
    }
}
