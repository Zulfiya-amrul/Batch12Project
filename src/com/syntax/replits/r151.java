package com.syntax.replits;

import static com.syntax.replits.Method.sum2D;

public class r151 {

    public static void main(String[] args) {

        int[][] a = {

                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}
        };




        int total = sum2D (a);
        System.out.println(total);
    }
}
             class Method {

               public static int sum2D(int[][] a) {
                 int total = 0;
                 for (int i = 0; i < a.length; i++) {
                     for (int k = 0; k < a.length; k++) {
                         total += a[i][k];
            }
        }
        return total;

    }
}
