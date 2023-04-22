package ua.Hillel.hometask04;

public class Hometask0104 {
    public static void main(String[] args) {
        for (double x = 0; x <= 360; x += 10) {
            System.out.println("sin" + "(" + x +"º"+")"+" = " + Math.sin (x*Math.PI/180));
        }
    }
}
