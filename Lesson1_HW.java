package lesson1_hw;

import java.util.Scanner;

/**
 *
 * @author Sergio Pozhydaiev
 */
public class Lesson1_HW {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Данная программа демонстрирует применение"
                + "математических операций над численным типом данных согласно"
                + " варианту.\nМой вариант 3, следовательно операции будут"
                + " происходить над целочисленным типом Int.\n"
                + "Поумолчанию в операциях будет участвовать введенное"
                + " пользователем число и число моего варианта (3).");
        
        System.out.println();
        
        System.out.print("Введите целое число: ");
                
        int nNumber = in.nextInt(); //считывание числа из консоли
        int nDefNum = 3;
        
        System.out.println("\nРезультат:");
        
        System.out.print(nDefNum + " + " + nNumber + " = ");
        System.out.println(nDefNum + nNumber);
        
        System.out.print(nDefNum + " - " + nNumber + " = ");
        System.out.println(nDefNum - nNumber);
        
        System.out.print(nDefNum + " * " + nNumber + " = ");
        System.out.println(nDefNum * nNumber);
        
        System.out.print(nDefNum + " / " + nNumber + " = ");
        System.out.println(nDefNum / nNumber);
        
        System.out.print(nDefNum + " % " + nNumber + " = ");
        System.out.println(nDefNum % nNumber);
    }
    
}
