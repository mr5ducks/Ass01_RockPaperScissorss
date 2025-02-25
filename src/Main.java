import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("time for some fun time with rock, paper, scissors");

        String x;

        String guy1 = "";
        String thing = "";

        do {
            System.out.println("Player 1! pick: Rock, Paper, or Scissors?");
            while (!(guy1.equals("rock") || guy1.equals("paper") || guy1.equals("scissors"))) {
                guy1 = scan.next();
                if (!(guy1.equals("rock") || guy1.equals("paper") || guy1.equals("scissors"))) {
                    System.out.println("uhh what? say rock, paper or scissors!");
                }
            }

            System.out.println("PLAYER 2!! NOW U GO Rock Paper or scissors??");
            while (!(thing.equals("rock") || thing.equals("paper") || thing.equals("scissors"))) {
                thing = scan.next();
                if (!(thing.equals("rock") || thing.equals("paper") || thing.equals("scissors"))) {
                    System.out.println("dude what? do it right!!");
                }
            }

            if (guy1.equals(thing)) {
                System.out.println("bruh it's a tie!");
            } else if ((guy1.equals("rock") && thing.equals("scissors")) ||
                    (guy1.equals("paper") && thing.equals("rock")) ||
                    (guy1.equals("scissors") && thing.equals("paper"))) {
                System.out.println("OMG PLAYER 1 WINS!!");
            } else {
                System.out.println("WOW PLAYER 2 ACTUALLY WON!!");
            }

            System.out.println("again? y/n");
            x = scan.next();
        } while (x.equals("y"));
        boolean n = x.equals("n");

        System.out.println("finished.");
        scan.close();
    }
}