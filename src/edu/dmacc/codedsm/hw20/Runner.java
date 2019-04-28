package edu.dmacc.codedsm.hw20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");

        List<Integer> stringLengths = animals.stream().map(str -> str.length()).collect(Collectors.toList());
        System.out.println("String Lengths: " + stringLengths);

        List flattenedList = animals.stream().map(c -> c.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);

        List<String> dNames = animals.stream().filter(str -> str.charAt(0) == 'D').collect(Collectors.toList());
        System.out.println("Animals starting with the letter D: " + dNames);

        Integer sumOfLengths = animals.stream().map(str -> str.length()).reduce((element, accumulator) -> element + accumulator).orElse(0);
        System.out.println(sumOfLengths);
    }
}