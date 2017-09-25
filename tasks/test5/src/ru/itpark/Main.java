package ru.itpark;

public class Main {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int arraySize = scanner.nextInt();
        int array[] = {2, 3, 6, 8, 4};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            int max = array[0];
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        {
            int temp = min;
            min = max;
            max = temp;
        }
        System.out.print(min);
        System.out.print(max);
        //int anew[]= {n};
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }
}
