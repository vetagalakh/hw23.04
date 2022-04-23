package com.company;

import java.util.Scanner;

public class Main {
    // 1) В массиве найти количество положительных элементов.
    //   public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        int count = 0;
//        int[] nums = new int[len];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                count++;
//            }
//        }
//        System.out.println("Количество положительных элементов в массиве = " + count);


    // 2)Дан массив. Найти среднее арифметическое его элементов.
    // Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
    // среднее арифметическое - сумма всех чисел деленная на их количество
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        double sum = 0;
//        double average = 0;
//        int[] nums = new int[len];
//        if (nums.length > 0) {
//            for (int j = 0; j < nums.length; j++) {
//                sum += nums[j];
//            }
//            average = sum / nums.length;
//        }
//    }
//}


//3)Из массива удалить все повторяющиеся элементы (дубликаты) так,
// чтобы каждое значение встречалось в массиве только один раз.
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2, 3, 3,};

        int n = nums.length;

        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (nums[j] != nums[i]) {
                    if (m != j) nums[m] = nums[j];
                    m++;
                }
            }
        }

        if (n != nums.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = nums[i];

            nums = b;
        }

        for (int x : nums) System.out.print(x + " ");
        System.out.println();
    }
}


















