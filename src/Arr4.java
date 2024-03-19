public class Arr4 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 98, 99, 100, 50};

        System.out.println(score[0]);

        score[0] = 40;

        System.out.println(score[0]);

        for(int i = 0; i < score.length; i++) {
            sum += score[i]; // sum = sum + score[i] //반복문을 이용하여 배열에 저장되어 있는 값들을 모두 더함
        }
        average = sum / (float)score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);

    }

}
