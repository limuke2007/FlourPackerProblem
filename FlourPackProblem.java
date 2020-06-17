package java_masterclass;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int sum = 5 * bigCount + smallCount;

        if (sum < goal) {               // sum must be at least equal to value of goal
            return false;
        } else if (sum == goal) {
            return true;
        } else {                        // if sum > goal
            return (goal % 5 <= smallCount);
        }
    }

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));           // false
        System.out.println(canPack(1, 0, 5));           // true
        System.out.println(canPack(0, 5, 4));           // true
        System.out.println(canPack(2, 2, 11));          // true
        System.out.println(canPack(-3, 2, 12));         // false
        System.out.println(canPack(0, 0, 4));           // false
        System.out.println(canPack(2, 1, 12));          // false
        System.out.println(canPack(2, 1, 5));           // true
        System.out.println(canPack(2, 0, 9));           // false

        System.out.println(4 % 5);


    }
}
