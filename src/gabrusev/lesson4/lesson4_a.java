package gabrusev.lesson4;

public class lesson4_a {
    public static void main(String[] args) {
        String c = "Я изучаю программирование";
        String d = "Меня интересует высокая зарплата";
        int i;
        for (i = 0; i < 10; i++) {
            if (i != 2 && i != 8) {
                System.out.println(c);
            }
            else {
                System.out.println(d);
            }
        }
    }
}

