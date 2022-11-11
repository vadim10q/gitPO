package com.luxygod.learn.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionClass {
    public static void main(String[] args) {
        //String collection and output
        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
        Collections.sort(solarSystem);
        System.out.println(solarSystem);
        //Max and min numbers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        //lottery
        ArrayList<Integer> lottery = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {

            lottery.add(i);//добавляем в барабан числа от 1 до 100
        }

        Collections.shuffle(lottery);//перемешиваем
        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
        for (int i = 0; i < 10; i++) {

            System.out.println(lottery.get(i));


        }
    }
}
