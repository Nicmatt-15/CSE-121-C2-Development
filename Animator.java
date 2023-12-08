import java.util.*;

public class Animator {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random(12345);
        for (int i = 4; i <= 8; i++) {
            clearScreen();
            System.out.println(ASCIIDrawing.drawBall(i));
            Thread.sleep(300);
        }

        clearScreen();
        System.out.println(ASCIIDrawing.printExplosion(rand, 8 * 2, 8 * 3));
        Thread.sleep(700);
        clearScreen();
        System.out.println(ASCIIDrawing.printEnding());
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}