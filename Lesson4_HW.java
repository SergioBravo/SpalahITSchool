import java.util.Scanner;
import java.util.ArrayList;

public class Homework4 {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Float> arr = new ArrayList<Float>();
        
        while(true) {
            System.out.print("Введите значение (для выхода - отрицательное): ");
            float fVal = in.nextFloat();
            if (fVal < 0) {
                System.out.println("Заполнение прекращено.");
                break;
            } else {
                if (arr.contains(fVal)) {
                    System.out.println("Такое значение уже есть. Оно будет удалено.");
                    arr.remove(fVal);
                } else {
                    arr.add(fVal);
                }
            }
        }
        
        System.out.println("Содержание коллекции:");
               
        Float[] arrElements = new Float[arr.size()];
        arr.toArray(arrElements);
        
        for (Float fItem : arrElements) {
            System.out.print(fItem + " ");
        }
        System.out.println();        
        
        boolean bFlag = false;
        int nDelta = 1;
        
        do{
            bFlag = false;
            for(int i=0; i<arrElements.length-nDelta;i++){
                if(arrElements[i]<arrElements[i+1]){
                    bFlag = true;
                    float nTmp = arrElements[i];
                    arrElements[i] = arrElements[i+1];
                    arrElements[i+1] = nTmp;
                }
            }   
            nDelta++;
        } while(bFlag);
        
        System.out.print("Oтсортированный массив: ");
        
        for (Float fItem : arrElements) {
            System.out.print(fItem + " ");
        }
        
        System.out.println();     
        
        float fSum = 0;
        
        for (int i = 0; i < arrElements.length - 1; i++) {
            fSum += arrElements[i];
        }
        
        float fMiddle = fSum / arrElements.length;
        
        System.out.println("Среднее арифметическое массива: " + fMiddle);
        
        System.out.println("Элементы массива, не меньше среднего арифметического, в порядке ввода: ");
        
        for (Float fItem : arr) {
            if (fItem >= fMiddle) {
                System.out.print(fItem + " ");
            }
        }
        
        System.out.println();
    }
}
