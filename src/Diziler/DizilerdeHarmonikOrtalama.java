package Diziler;

public class DizilerdeHarmonikOrtalama {
    public static void main(String[] args) {
        int[] list = {10, 23, 14, 25, 64, 46};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += 1.0 / list[i];
        }
        double avarage = list.length / sum;
        System.out.println(avarage);
    }
}
