package com.jj.recursivesearch.binarysearch.repositorys;

import java.util.ArrayList;
import java.util.List;

public class BinaryRepo {

    private static List<Integer> numbers = new ArrayList<>();

    public static void addNumbers(int c) {
        numbers.add(c);
    }

    public static List<Integer> getNumbers() {
        return numbers;
    }
}

