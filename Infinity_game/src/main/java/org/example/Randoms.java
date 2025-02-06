package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;
    private final Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true; // Итератор бесконечный, всегда возвращает true
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min + 1) + min; // Генерация случайного числа в диапазоне [min, max]
            }
        };
    }
}