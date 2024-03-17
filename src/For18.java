public class For18 {
    public static void main(String[] args) {
        // 1~10000사이에 8이 몇번 나오는가?
        int cnt = 0;
        for(int num = 1; num <= 10000; num++) {
            int tempNum = num;
            while(tempNum != 0) {
                if (tempNum % 10 == 8) {
                    cnt++;
                }
                tempNum /= 10;

            }
        }
        System.out.println(cnt);

    }
}


