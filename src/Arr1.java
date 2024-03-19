public class Arr1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        int k = 1;

        score[0] = 70;
        score[1] = 90;
        score[2] = 96;
        score[3] = 50;
        score[4] = 100;

        for(int i : score) {
            System.out.println(i); //향상된 for문
        }

    }

}
