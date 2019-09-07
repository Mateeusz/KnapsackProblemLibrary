package plecak;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Klasa dziedzicząca po klasie abstrakycjnej Algorithm zawiera nadpisaną metodę abstrakcyjną rozwiązującą problem plecakowy
 * algorytmem losowym
 */
public class Randomized extends Argorithm {

    /**
     * Deklaracja pól klasy
     */
    private String about;
    private List<Item> temp = new ArrayList<>();
    private List<Item> bestList = new ArrayList<Item>();
    private List<Item> currentBestList = new ArrayList<Item>();

    /**
     * Metoda ustawiająca zawartość i zwracająca String z opisem algorytmu losowego dla problemu plecakowego
     */
    public String setAbout() {
        this.about = "Problem plecakowy rozwiązany losowo. Wybieramy losowo zawartość plecaka po 100 powtórzeniach " +
                "zwracamy najlepszą zawartość plecaka.";

        return about;
    }

    /**
     * Nadpisanie metody z klasy abstrakcyjnej Algorithm rozwiązującej
     * problem plecakowy przy użyciu algorytmu losowego
     */
    @Override
    public List<Item> solution(Instantion instantion) {


        Random random = new Random();
        int currentSize, currentValue, bestValue = 0;

        for(int i=0; i<=10; i++) {
            currentSize = 0;
            currentValue = 0;

            currentBestList.clear();
            temp.clear();
            for(int k = 0; k < instantion.getItems().size(); k++) {
                temp.add(new Item(instantion.getItems().get(k).getValue(), instantion.getItems().get(k).getSize()));
            }


            while (temp.size() > 0) {
                int randIndex = random.nextInt(temp.size());

                if(currentSize + temp.get(randIndex).getSize() <= instantion.getBagSize()) {
                    currentBestList.add(temp.get(randIndex));
                    currentSize += temp.get(randIndex).getSize();
                    currentValue += temp.get(randIndex).getValue();
                    temp.remove(randIndex);

                } else {
                    break;
                }
            }
            if(bestValue < currentValue) {
                bestValue = currentValue;
                bestList.clear();
                for(int k = 0; k < currentBestList.size(); k++) {
                    bestList.add(new Item(currentBestList.get(k).getValue(), currentBestList.get(k).getSize()));
                }
            }
        }

        return bestList;
    }
}
