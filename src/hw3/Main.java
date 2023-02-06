package hw3;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    // Это стандартное решение, нужно сделать норм
    public static void main(String[] args) {
        Callculator();
    }
    private static void Callculator(){
        Deque<Double> line = new LinkedList<>();
        boolean esc = false;
        while (!esc) {
            Double num1;

            if (line.size() >= 1){
                num1 = line.peekLast();
            }else{
                num1 = GetDigit();
            }

            char symbol = GetSymbol();
            Double num2 = GetDigit();
            Double result = 0.0;
            if (symbol == '+'){
                result = Summa(num1, num2);
            }else if (symbol == '-'){
                result = Differ(num1, num2);
            }else if (symbol == '*'){
                result = Multi(num1, num2);
            }else if (symbol == '/'){
                result = Division(num1, num2);
            }else{
                System.out.println("Ошибка, операция не определена: ");
            }

            if (line.size() == 3){
                line.pollFirst();
            }
            line.addLast(result);
            System.out.println(num1+" "+symbol+" "+num2+" = "+line.peekLast());
            System.out.println("Очередь: "+line);
            System.out.println("Введите '1' - для работы с результатом, '2' - для ввода нового числа, '3' - для выхода, '4' - для отмены последней операции");
            String out  = sc.next();

            if (out.equals("2")) {
                line.clear();
            }
            if (out.equals("3")) {
                esc = true;
            }
            if (out.equals("4")) {
                result = line.pollLast();
                System.out.println("Результат "+result+" отменен, работаем с : "+line);
            }
        }

    }
    public static double GetDigit(){
        System.out.print("Укажите число: ");
        double num;
        if (sc.hasNextInt()){
            num = sc.nextInt();
        } else if (sc.hasNextDouble()) {
            num = sc.nextDouble();
        } else {
            System.out.println("Ошибка, введите число: ");
            num = GetDigit();
        }
        return num;
    }
    public static char GetSymbol(){
        System.out.print("Введите операцию (-,+,*,/): ");
        char symbol;
        if (sc.hasNext()){
            symbol = sc.next().charAt(0);
            if (symbol != '-' && symbol != '+' && symbol != '*' && symbol != '/'){
                System.out.println("Ошибка, неизвестная операция");
                symbol = GetSymbol();
            }
        }else {
            System.out.println("Ошибка, неизвестная операция");
            symbol = GetSymbol();
        }
        return symbol;
    }
    private static double Summa (double a, double b){
        return a + b;
    }
    private static double Differ (double a, double b){
        return a - b;
    }
    private static double Multi (double a, double b){
        return a * b;
    }
    private static double Division (double a, double b){
        return a / b;
    }
}
