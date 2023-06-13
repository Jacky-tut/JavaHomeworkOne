//Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
import java.util.Random;

public class Task {
    public static int generateRandomNumber(int n)
    {
        if (n < 0) {
            throw new IllegalArgumentException("n не должен быть отрицательным");
        }
        return new Random().nextInt(n + 1);
    }

    public static void main(String[] args)
    {
        int n = 2000;

        for (int i = 0; i < 5; i++) {
            System.out.println(generateRandomNumber(n));
        }
    }
}
