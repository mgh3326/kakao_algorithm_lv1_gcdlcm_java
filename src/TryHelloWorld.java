import java.util.Arrays;

class TryHelloWorld {//재귀함수 사용
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p%q);
    }
//class TryHelloWorld { //유클리드 호제법
//    public int[] gcdlcm(int a, int b) {
//        int[] answer = new int[2];
//        int z;
//        int x = a;
//        int y = b;
//        while (true) {
//
//            z = x % y;
//            if (0 == z)
//                break;
//
//            x = y;
//            y = z;
//
//        }
//        answer[0]=y;
//        answer[1]=(a*b/y);
//        return answer;
//    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
