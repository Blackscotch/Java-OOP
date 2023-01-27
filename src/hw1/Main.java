package hw1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом.
//        Идея: описать некоторое количество компонент, например:
//        1. модель человека,
//        2. компонента хранения связей и отношений между людьми: родитель, ребёнок - классика,
//        но можно подумать и про отношение, брат, свекровь, сестра и т. д.
//        3. компонент для проведения исследований.
//        4. Дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранение в файл, получение\построение отдельных моделей человека.
//        Под “проведением исследования” можно понимать получение всех детей выбранного человека.

        GetTask();
    }
    private static void GetTask(){
        Person p1 = new Person("Stiv", "Gamer", "M");
        Person p2 = new Person("Rika", "Garret", "F");
        Person p3 = new Person("Jon", "Gamer", "M");
        Person p4 = new Person("Rebekka", "Gamer", "F");
        Person p5 = new Person("Smith", "Gamer", "M");
        Person p6 = new Person("Monika", "Gamer", "F");
        Person p7 = new Person("Stiven", "Stivens", "M");
        Person p8 = new Person("Mira", "Stivens", "F");
        Person p9 = new Person("Gretta", "Stivens", "F");

        p1.setChild(p3);
        p2.setChild(p3);
        p1.setChild(p4);
        p2.setChild(p4);
        p3.setChild(p5);
        p4.setChild(p6);
        p7.setChild(p9);
        p8.setChild(p9);
//        System.out.println(p1.getInfo());

        while (true){
            System.out.println("Введите имя человека для просмотра его потомков.");
            System.out.println("0 - для выхода из программы");
            String name = sc.nextLine();
            if (name.equals("0")){
                System.out.println("Программа завершена");
                break;
            }else{
                for (var person : Person.personSet) {
                    if (person.getName().equals(name)){
                        if (person.getChild() != null){
                            System.out.println("У человека "+person.getName()+" "+person.getSurname()+ " есть дети :\n" +person.getChild().getInfo());
                        }else {
                            System.out.println("У человека "+person.getName()+" "+person.getSurname()+ " детей нет.");
                        }
                    }
                }
            }
        }
    }
}