public class Main {

    public static void main(String[] args) {
        System.out.println(test(3));
        System.out.println(test(6));
        System.out.println(test(15));
        System.out.println(test(23));
    }
    public static boolean test(int Num) {
        if (Num < 2) return false;
        for (int i = 2; i*i <= Num; i++)
            if (Num % i == 0) return false;
        return true;
    }
}
