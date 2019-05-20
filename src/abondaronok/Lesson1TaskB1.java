package abondaronok;

public class Lesson1TaskB1 {
    public static void main(String[] args) {
        int i_1 = 34;{
        int i_2 = 27;{
            String to_binary_1 = Integer.toBinaryString(i_1 + i_2); // ссумируем переменные и переводим в бинарный
            to_binary_1 = String.format("%8s", to_binary_1).replace(" ", "0"); // заменяем пробелы, чтобы бинарное было с нулями впереди
        int binary_to_dec_1 = Integer.parseInt(to_binary_1,2); // переводим из бинарного в десятичный
                System.out.printf("%s %s %s %s %s %s %s %s %s","The sum of decimals " , i_1 , " and " , i_2 , " is ",
                binary_to_dec_1 , ", which is ", to_binary_1 , " in binary."); // выводим в консоль фразу с результатом

            }
        }
    }
}