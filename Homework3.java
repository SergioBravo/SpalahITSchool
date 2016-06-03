package homework3;

import java.util.Scanner;

/**
 *
 * @author Serhii Pozhydaiev
 */
public class Homework3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Введите длинну массива: ");
        int nLength = in.nextInt();
        System.out.println();
        
        float[] arr = new float[nLength];
        
        for (int i = 0; i < nLength; i++) {
            System.out.print("Введите " + i + " єлемент массива: ");
            arr[i] = in.nextFloat();
        }
        
        System.out.println("Длинна массива равна " + nLength);
        System.out.print("Массив имеет вид: ");
        for (float fItem : arr) {
            System.out.print(fItem + " ");
        }
        
        System.out.println();
        
        float fMult = 1;
        
        if (nLength % 2 == 0) {
            System.out.print("Массив симметричный.\n"
                    + "Произведение первой половины массива равно: ");
            
            for (int i = 0; i < nLength / 2; i++) {
                fMult *= arr[i];
            }
            System.out.println(fMult);
        } else {
            System.out.print("Массив не симметричный.\n"
                    + "Произведение первой половины массива равно: ");
            
            for (int i = 0; i < nLength / 2; i++) {
                fMult *= arr[i];
            }
            System.out.println(fMult);
            
            fMult = 1;
            System.out.print("С учетом центрального элемента: ");
            for (int i = 0; i < (nLength / 2) + 1; i++) {
                fMult *= arr[i];
            }
            System.out.println(fMult);
        }
    }
    
}
