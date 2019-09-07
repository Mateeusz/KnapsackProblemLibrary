package plecak;

import java.util.List;

/**
 * Klasa abstrakcyjna Algoritm
 */
public abstract class Argorithm extends Instantion{


    /**
     * Metoda zwracająca wartość sumy wag przedmiotów
     * znajdujących się na liście typu Item wprowadzanej jako argument funkcji
     */
    public double computeListWeight(List<Item> list) {

        double listWeight = 0;
        if(list.size() == 0) {
            listWeight = 0;
        }
        else {
            for( Item items : list) {
                listWeight += items.getSize();
            }
        }

        return listWeight;
    }

    /**
     * Metoda zwracająca wartość sumy wartości przedmiotów
     * znajdujących się na liście typu Item wprowadzanej jako argument funkcji
     */
    public int computeListValue(List<Item> list) {

        int listValue = 0;
        if(list.size() == 0) {
            listValue = 0;
        }
        else {
            for( Item items : list) {
                listValue += items.getValue();
            }
        }

        return listValue;
    }

    /**
     * Metoda abstrakcyjna zwracająca wartość rozwiązanie
     * problemu plecakowego w zależności od algorytmu
     */
    public abstract List<Item> solution(Instantion instantion);
}
