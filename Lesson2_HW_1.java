package lesson2_hw_1;

import java.util.Scanner;

/**
 *
 * @author Sergio Pozhydaiev
 */
public class Lesson2_HW_1 {

    public static void main(String[] args) {
        System.out.println("Программа считывает из консоли пользовательский ввод\n"
                + "в виде двух целых чисел, делает проверку на четность,\n"
                + "и, в результате выполняет действия согласно заданию.\n");
        System.out.println("Если оба числа четные или оба нечетные - перемножить их.\n"
                + "Иначе - сложить.\n");        
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите первое целое число: ");
        int nFirstNum = in.nextInt();
        
        System.out.print("Введите второе целое число: ");
        int nSecondNum = in.nextInt();
        
        int nResult = -1;
        
        if ((nFirstNum % 2 == 0) && (nSecondNum % 2 == 0)) {
            System.out.println("\nОба числа четные!");
            System.out.print(nFirstNum + " * " + nSecondNum);
            nResult = nFirstNum * nSecondNum;
        } else if ((nFirstNum % 2 != 0) && (nSecondNum % 2 != 0)) {
            System.out.println("\nОба числа нечетные!");
            System.out.print(nFirstNum + " * " + nSecondNum);
            nResult = nFirstNum * nSecondNum;
        } else {
            System.out.println("\nЧетное и нечетное число!");
            System.out.print(nFirstNum + " + " + nSecondNum);
            nResult = nFirstNum + nSecondNum;
        }
        
        System.out.println(" = " + nResult);
    }
    
}
