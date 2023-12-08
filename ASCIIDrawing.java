import java.util.*;

public class ASCIIDrawing {
    public static void main(String[] args) {
        System.out.println(drawBall(4));
    }

    public static String drawBall(int radius) {
        String result = "";
        int maxSpaceInBall = 0;

        for (int i = 2; i <= radius - 1; i++) {
            maxSpaceInBall += i;
        }

        maxSpaceInBall *= 2;

        // Draw upper part of the ball
        result += drawUpperBall(radius, maxSpaceInBall);
        // Draw middle part of the ball
        result += drawMidBall(radius, maxSpaceInBall);
        // Draw lwoer part of the ball
        result += drawLowerBall(radius, maxSpaceInBall);


        return result;
    }

    public static String drawUpperBall(int radius, int maxSpaceInBall) {
        String result = "";
        int curSideThickness = 1;
        int curSpaceInBall = maxSpaceInBall;
        int curSpaceBeforeBall = 0;


        // Draw top half of the ball
        for (int i = 1; i <= radius - 1; i++) {
            String curLine = "";
            for (int j = 1; j <= curSpaceBeforeBall; j++) {
                curLine += " ";
            }

            for (int j = 1; j <= curSideThickness; j++) {
                curLine += "o";
            }

            for (int j = 1; j <= curSpaceInBall; j++) {
                curLine += " ";
            }

            for (int j = 1; j <= curSideThickness; j++) {
                curLine += "o";
            }

            curLine += "\n";
            result = curLine + result;

            curSpaceBeforeBall += curSideThickness;
            curSideThickness += 1;
            curSpaceInBall -= (curSideThickness * 2);
        }
        return result;
    }

    public static String drawMidBall(int radius, int maxSpaceInBall) {
        String result = "";

        // Draw middle of the ball
        for (int i = 1; i <= radius - 4; i++) {
            result += "o";
            for (int j = 1; j <= maxSpaceInBall; j++) {
                result += " ";
            }

            result += "o\n";
        }

        return result;
    }

    public static String drawLowerBall(int radius, int maxSpaceInBall) {
        String result = "";
        int curSideThickness = 1;
        int curSpaceInBall = maxSpaceInBall;
        int curSpaceBeforeBall = 0;

        for (int i = 1; i <= radius - 1; i++) {
            for (int j = 1; j <= curSpaceBeforeBall; j++) {
                result += " ";
            }

            for (int j = 1; j <= curSideThickness; j++) {
                result += "o";
            }

            for (int j = 1; j <= curSpaceInBall; j++) {
                result += " ";
            }

            for (int j = 1; j <= curSideThickness; j++) {
                result += "o";
            }

            result += "\n";
            
            curSpaceBeforeBall += curSideThickness;
            curSideThickness += 1;
            curSpaceInBall -= (curSideThickness * 2);
        }
        return result;
    }

    public static String printExplosion(Random rand, int lines, int wide) {
        String result = "";
        for (int i = 1; i <= lines; i++) {
            int curLineStars = rand.nextInt(wide) + 1;

            for (int j = 1; j <= curLineStars; j++) {
                for (int k = 1; k <= rand.nextInt(51); k++) {
                    result += " ";
                }
                result += "*";
            }

            result += "\n";
        }
        
        return result;
    }

    public static String printEnding() {
        return "                              ___ \n" +
        "W    W    OOO   AAAAA  H   H  | |\n" +
        "W    W   O   O  A   A  H   H  | |\n" +
        "W WW W  O     O AAAAA  HHHHH  |_|\n" +
        " WW WW   O   O  A   A  H   H  \n" +
        "  W W     OOO   A   A  H   H  OOO";
    }
}