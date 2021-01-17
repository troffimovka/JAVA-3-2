public class Main {
    public static void main(String[] args) {
        int initialAmount = 300;
        int transh = 1200;
        int bonusRate = transh / 100;
        int limit = 1000;
        int bonus;
        if (transh <= limit) {
            bonus = 0;
        } else {
            bonus = bonusRate;}
        int total = initialAmount + transh + bonus;
        System.out.println(total);
    }
}
