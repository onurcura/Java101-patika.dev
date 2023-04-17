package Diziler;


public class MatrisinTranspozunuBulma {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3, 1},
                {4, 5, 6, 2},
                {4, 6, 9, 3}
        };

        int[][] matris1 = new int[matris[0].length][matris.length];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                matris1[j][i] = matris[i][j];
            }
        }

        for (int i = 0; i < matris1.length; i++) {
            for (int j = 0; j < matris1[0].length; j++) {
                System.out.print(matris1[i][j] + " ");
            }
            System.out.println();
        }
    }
}