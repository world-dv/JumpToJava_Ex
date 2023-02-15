public class Main {
    public static void main(String[] args) {

        System.out.println("Q1. 조건문의 참과 거짓 : everywhere");
        System.out.println("Q2. 3의 배수의 합 : " + q2());
        System.out.println("Q3. 별 표시하기 : "); q3();
        System.out.println("Q4. 1부터 100까지 출력하기 : "); q4();
        System.out.println("Q5. 평균 점수 구하기 : " + q5());

    }
    public static void q1() {
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
    }
    public static int q2() {
        int n = 3, sum = 0;
        while(n <= 1000) {
            sum += n;
            n += 3;
        }
        return sum;
    }
    public static void q3(){
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void q4() {
        for(int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if(i % 10 == 0) {
                System.out.print("\n");
            }
        }
    }
    public static double q5() {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        double sum = 0;
        for(int score : marks) {
            sum += score;
        }
        return sum / marks.length;
    }
}
