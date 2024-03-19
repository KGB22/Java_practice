public class Arr5 {
    public static void main(String[] args) {
        int[][] arr = { {95, 86},  {83, 92, 96}, {78, 83, 93, 87, 88} }; 
        int sum = 0;
        int count = 0;
        //int[행][열]
        for(int i = 0; i < arr.length; i++) {//행
            for(int j = 0; j < arr[i].length; j++) {//열
                sum += arr[i][j];
                count++;
            }
        }
        double avg = sum /(double)count;
       
        System.out.println(sum);
        System.out.println(avg);
    }

}
