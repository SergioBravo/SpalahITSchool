package lesson2_hw_2;

import java.util.Scanner;

/**
 *
 * @author Sergio Pozhydaiev
 */
public class Lesson2_HW_2 {
    
    public static void interval(int nStart, int nStop){
        int nResult = nStart + 1;
        
        if (nResult < nStop) {
            System.out.print(nResult + " ");
            interval(nResult, nStop);
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа считывает из консоли пользовательский ввод\n"
                + "в виде двух целых чисел и выводит в консоль целые числа между\n"
                + "минимальным и максимальным числом.\n");       
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите первое целое число: ");
        int nStart = in.nextInt();
        
        System.out.print("Введите второе целое число: ");
        int nStop = in.nextInt();
        
        int nResult = 0;
        
        if (nStart > nStop) {
            int temp = 0;
            temp = nStart;
            nStart = nStop;
            nStop = temp;
        } else if (nStart == nStop) {
            System.out.println("\nЧисла равны.\nРезультат: " + nResult); 
        }
            
        if (nStop - nStart == 1) {
            System.out.println("\nНевозможно выделить промежуток между числами.\n"
                + "Результат: " + nResult);
        } else {
            System.out.print("\nИнтервал между " + nStart + " и " + nStop + ": ");
            interval(nStart, nStop);
        }       
    }  
}
