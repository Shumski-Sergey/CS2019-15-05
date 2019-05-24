package gabrusev.lesson4;

public class lesson4_a_1 {
    public static void main(String[] args) {
        String a = "Я изучаю программирование";
        String b = "Меня интересует высокая зарплата";
        int i;
        for (i = 0; i < 10; i++) {
            if (i != 2 && i != 8) {
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
        }
    }
}

