
import java.util.Random;
import java.util.ArrayList;


public class Main {
    //Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int generateRandomNumber(int n) {
        return new Random().nextInt(n + 1);
    }

//   Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

    public static int highBitLine(int n) {
        int res = 0;
        while (n != 1) {
            n >>= 1;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 2000;
        int i = generateRandomNumber(x);
        int n = highBitLine(i);

        System.out.println(i);
        System.out.println(n);
        while (i < Short.MAX_VALUE) {
            i++;
            if (i % n == 0) {
                int[] arr1 = {i};
                ArrayList<Integer> m1 = new ArrayList<Integer>();
                for (int b : arr1) {
                    m1.add(b);

                }
                System.out.println(m1);
            }

        }
        while (Short.MIN_VALUE < i) {
            i--;
            if (i % n == 0) {
                int[] arr2 = {i};
                ArrayList<Integer> m2 = new ArrayList<Integer>();
                for (int a : arr2) {
                    m2.add(a);

                }
                System.out.println(m2);

            }


        }


    }
}