package net.miracle.community;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private final static int max = 20;
    private final static int min = -20;
    private static int[] array = new int[100];

    public static void main(String[] args) {
        // задача 9
        int maxValue = 0;
        int minValue = 0;
        int positiveNumberCounter = 0;
        int negativeNumberCounter = 0;
        int zeroNumberCounter = 0;

        ArrayList<Integer> positiveNumberList = new ArrayList<>(); // для задачи 10
        /**
         * positiveNumberList.add(1);
         * positiveNumberList.add(2);
         * positiveNumberList.add(3);
         * positiveNumberList.add(4);
         * for (Integer item : positiveNumberList) System.out.println(item.toString());
         * */
        ArrayList<Integer> negativeNumberList = new ArrayList<>(); // для задачи 10
        ArrayList<Integer> evenNumberList = new ArrayList<>(); // для задачи 10
        ArrayList<Integer> oddNumberList = new ArrayList<>(); // для задачи 10

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd(min, max);
            System.out.print(array[i] + " | ");

            if (array[i] == 0) {
             zeroNumberCounter++;
             continue;
            }
            if (array[i] > 0) {
                positiveNumberCounter++;
                positiveNumberList.add(array[i]); // для задачи 10
            }
            else if (array[i] < 0) {
                negativeNumberCounter++;
                negativeNumberList.add(array[i]); // для задачи 10
            }
            if (array[i] > maxValue) maxValue = array[i];
            if (array[i] < minValue) minValue = array[i];

            if (array[i] %2 == 0) evenNumberList.add(array[i]); // для задачи 10
            else    oddNumberList.add(array[i]); // для задачи 10

        }
        System.out.println("\n\nmaxValue: " + maxValue);
        System.out.println("minValue: " + minValue);
        System.out.println("positiveNumberCounter: " + positiveNumberCounter);
        System.out.println("negativeNumberCounter: " + negativeNumberCounter);
        System.out.println("zeroNumberCounter: " + zeroNumberCounter);

        // задача 10
        Integer[] positiveNumberArray = new Integer[positiveNumberList.size()];
        positiveNumberList.toArray(positiveNumberArray);
        Integer[] negativeNumberArray = new Integer[negativeNumberList.size()];
        negativeNumberList.toArray(negativeNumberArray);
        Integer[] evenNumberArray = new Integer[evenNumberList.size()];
        evenNumberList.toArray(evenNumberArray);
        Integer[] oddNumberArray = new Integer[oddNumberList.size()];
        oddNumberList.toArray(oddNumberArray);

        System.out.println("\npositiveNumberArray: ");
        for (Integer item : positiveNumberArray) System.out.print(item + " | ");
        System.out.println("\nnegativeNumberArray: ");
        for (Integer item : negativeNumberArray) System.out.print(item + " | ");
        System.out.println("\nevenNumberArray: ");
        for (Integer item : evenNumberArray) System.out.print(item + " | ");
        System.out.println("\noddNumberArray: ");
        for (Integer item : oddNumberArray) System.out.print(item + " | ");
        System.out.println();
    }
    /**
     * Метод получения псевдослучайного целого числа от [min до max]
     */
    public static int rnd(int min, int max)
    {
        max -= min; // Отнимаем от максимального значения минимальное для получения множителя псевдослучайного вещественного числа.
        return (int) ((Math.random() * ++max)) + min;
    }
}
