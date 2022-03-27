package com.company;
import java.util.*;

public class Lesson04task1 {


        public static void main(String[] args){
            List<String> words = Arrays.asList(
                    "Mercedes", "BMW", "Audi", "Toyota", "Volkswagen",
                    "Opel", "Subaru", "Range Rover", "Toyota", "Volkswagen",
                    "BMW", "Audi", "Toyota", "Subaru", "Subaru",
                    "Audi", "Toyota", "Subaru", "Subaru", "Toyota"
            );

            Set<String> unique = new HashSet<String>(words);

            System.out.println("Первоначальный массив");
            System.out.println(words.toString());
            System.out.println("Уникальные слова");
            System.out.println(unique.toString());
            System.out.println("Частота встречаемости слов");
            for (String key : unique) {
                System.out.println(key + ": " + Collections.frequency(words, key));
            }
        }
    }

