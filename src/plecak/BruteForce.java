package plecak;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa dziedzicząca po klasie abstrakycjnej Algorithm zawiera nadpisaną metodę abstrakcyjną rozwiązującą problem plecakowy
 * algorytmem BruteForce
 */
public class BruteForce extends Argorithm{

    /**
     * Deklaracja pól klasy
     */
    private String about;

    /**
     * Metoda ustawiająca zawartość i zwracająca String z opisem algorytmu Brute Force dla problemu plecakowego
     */
    public String setAbout() {
        this.about = "Problem plecakowy rozwiązany losowo. Wybieramy losowo zawartość plecaka po 100 powtórzeniach " +
                "zwracamy najlepszą zawartość plecaka.";

        return about;
    }

    /**
     * Nadpisanie metody z klasy abstrakcyjnej Algorithm rozwiązującej
     * problem plecakowy przy użyciu algorytmu dokładnego
     */
    @Override
    public List<Item> solution(Instantion instantion) {


        List<Item> best = new ArrayList<>();
        int bestValue = 0;

        int allMasks = (1 << instantion.getItems().size());
        for (int i = 1; i < allMasks; i++) {

            List<Item> currentBest = new ArrayList<>();
            int currentBestValue = 0, currentSize = 0;

            for (int j = 0; j < instantion.getItems().size(); j++) {

                if ((i & (1 << j)) > 0) {
                    //System.out.print((j) + " ");
                    currentBestValue += instantion.getItems().get(j).getValue();
                    currentSize += instantion.getItems().get(j).getSize();
                    currentBest.add(instantion.getItems().get(j));
                }
            }

            if(currentSize <= instantion.getBagSize()) {
                if(currentBestValue > bestValue) {
                    bestValue = currentBestValue;
                    best = currentBest;
                }
            }
        }
        return best;
    }
}
