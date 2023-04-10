package skypro.java.course2.theory;

//- Задача на лайв-кодинг
//        Напишите метод, который возводит число в куб.

import java.util.List;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        cube(numbers);
    }

    public static<C extends Number> void cube(List<C> list){
        list.stream()
                .mapToDouble(Number::doubleValue)
                .map(number -> Math.pow(number, 3))
                .forEach(System.out::println);
    }
}