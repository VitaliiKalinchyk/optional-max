package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {

        if (values != null && values.length > 0) {
            int max=values[0];
            for (int i:values ) {
                max = Math.max(max,i);
            }
            return OptionalInt.of(max);
        }

        return OptionalInt.empty();
    }
}
