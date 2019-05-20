package abondaronok;

public class Lesson2TaskC3 {
    public static void main(String[] args) {
        System.out.println(getWeight(100));
}

    public static double getWeight(int weightEarth) {
        double weightMars = weightEarth * 3.86 / 9.81 ;
            weightMars = Math.round(weightMars * 100.0)/100.0;
                return weightMars;
    }
}