package ru.itpark;

public class Main {

    public static void main(String[] args) {
        //Scanner number = scanner(System.in);

        int a[] = {1, 8, 9, 0, 4};
        int n = 5;

        int i;
        for (i = 0; i < n/2; i++) {
            temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
        //int anew[]= {n};
        for(i = 0; i<n; i++)
         System.out.print(a[i] + " ");
    }
}
