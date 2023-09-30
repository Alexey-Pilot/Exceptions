
import java.util.Scanner;

public class HWExceptions {
    public static void main(String[] args) throws Exception {
        // ex1
        insertDouble();
        // ex2
        divisionBy0(new int[]{1, 2, 3, 4});
        // ex3
        throwExceptions();
        // ex4
        noEmptyString();

    }

    // Задание 1
    public static Double insertDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (можно использовать только цифры и запятую): ");
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Неверный ввод!");
            insertDouble();
        }
        return null;
    }

    // Задание 2
    public static void divisionBy0(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Catching exception:" + e);

        }
    }

    // Задание 3

    public static void throwExceptions(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    // Задание 4
    public static String noEmptyString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String insert = scanner.nextLine();
        do {
            System.out.println("Запрещенно вводить пустые строки!");
            System.out.print("Введите строку: ");
            insert = scanner.nextLine();
        }while (insert.isEmpty());
        return insert;
    }

}
