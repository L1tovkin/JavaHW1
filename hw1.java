import java.math.BigInteger;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        /*
        System.out.println("Задача 1. Сумма");
        ex_1_1();
        System.out.println();
        
        System.out.println("Задача 2. Факториал");
        ex_1_2();
        System.out.println();
        
        System.out.println("Задача 3. Простые числа от 1 до 1000");
        ex_2();
        System.out.println();
        
        System.out.println("Задача 4. Простой калькулятор");
        ex_3();
        System.out.println();
        */

    }

    //  функция подсчёта суммы n натуральных чисел циклом
    static int ex_1_iter(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //  функция подсчёта суммы n натуральных в одно арифметическое выражение
    static int ex_1_quick(int n){
        // сумма арифметической прогрессии от 1 до n с шагом 1
        return (1 + n) * n / 2;
    }

    //  функция вывода в консоль результата решения задачи 1 (сумма)
    static void ex_1(){
        System.out.print("  Введите натуральное число ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.close();
        System.out.println("  Результат вычислений циклом: " + ex_1_iter(value));
        System.out.println("  Результат вычислений формулой: " + ex_1_quick(value));
        
    }

    //  функция вычисления n!
    static BigInteger factorial(int n){
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    //  функция вывода в консоль результата решения задачи 2 (факториал)
    static void ex_2(){
        System.out.print("  Введите натуральное число ");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        scan.close();
        System.out.println("  " + value + "! = " + factorial(value));        
    }

    //  функция проверки числа на простоту
    static boolean isPrime(int n){
        if (n == 1)
            return false;
        if (n == 2)
            return true;    
        for (int del = 2; del*del <= n; del++)
            if (n % del == 0)
                return false;
        return true; 
    }

    //  функция вывода в консоль результата решения задачи 3
    static void ex_3(){
        for (int i = 1; i <= 1000; i++) 
            if(isPrime(i))
                System.out.print(i + "  ");
        System.out.println();                
    }

    // функция для построения выражения калькулятора
    static String calc(){
        String res = "";
        System.out.print("  Введите первый операнд ");
        Scanner scan = new Scanner(System.in);
        int value1 = scan.nextInt();

        System.out.print("  Введите знак арифметической операции ");
        char operation = scan.next().charAt(0);
        System.out.print("  Введите второй операнд ");
        int value2 = scan.nextInt();
        scan.close();

        switch (operation){
            case '+': res = Integer.toString(value1) + " + " + Integer.toString(value2) + " = " + Integer.toString(value1+value2); break;
            case '-': res = Integer.toString(value1) + " - " + Integer.toString(value2) + " = " + Integer.toString(value1-value2); break;
            case '*': res = Integer.toString(value1) + " + " + Integer.toString(value2) + " = " + Integer.toString(value1*value2); break;
            case '/': if (value2 == 0) res = "Ошибка! На 0 делить нельзя!";
                      else res = Integer.toString(value1) + " / " + Integer.toString(value2) + " = " + Double.toString((double)(value1) / value2); break;
            default: res = "Ошибка! Неверная арифметическая операция!" ;         
        }
        return res;
    }

    //  функция вывода в консоль результата решения задачи 4
    static void ex_4() {
        System.out.println("  " + calc());
    }
}