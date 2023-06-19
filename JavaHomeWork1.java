import java.util.Random;
import java.util.Arrays;

public class JavaHomeWork1 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 2000);                   //Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        System.out.println("Случайное число: " + i);

//_________________________________________________________________________________________________________________________________________________
// Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.(Вариант 1) 
    
        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("Старшее значение бита числа n:  " + n);
    
       
//___________________________________________________________________________________________________________________________________________________ 
 //Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        
        Short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) if ( j % n == 0) count++;  
        int[] m1 = new int [count];
        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) if (j % n == 0)  m1[count++] = j; 
        //System.out.println(Arrays.toString(m1));
          


//____________________________________________________________________________________________________________________________________________________        
 //Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
     
        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) if ( j % n != 0) count++; 
        int[] m2 = new int [count];
        count = 0;       
        for (int j = Short.MIN_VALUE; j < i; j++) if (j % n != 0) m2[count++] = j;
       // System.out.print(Arrays.toString(m2));
        
    }
}