package org.example.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int[] massive=new int[10];
        int i=3;
        massive[3]=98;
        System.out.println("#"+i+" "+massive[i]);
        double[] numbers2 = new double[] {1.0, 1.5, 3.6};
        char[] symbols = {'a', 'b', 'c', 'd'};
        String[] words = {"hello", "my", "friend"};
        boolean[] values = {true, false, false, true};
        int[][] matrix=new int[][]{
                {5,6,4},
                {3,2,1},
                {7,8,9,5,7,9,12}

        };
        System.out.println("matrix");
        System.out.println(matrix[0][0]);
        System.out.println(matrix[2][4]);
        System.out.println("matrix.length  "+matrix[2].length);
        System.out.println(matrix[matrix.length-1][matrix[matrix.length-1].length-1]);
        int t=matrix[matrix.length-1].length-2;
        int m=matrix.length-1;
        System.out.println("t= "+t+" m= "+m+": "+matrix[m][t]);
    }
}
