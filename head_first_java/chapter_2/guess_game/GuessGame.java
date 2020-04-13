public class GuessGame {
    Player p1;
    Player p2;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();

            guessP1 = p1.number;
            System.out.println("Player one guessed " + guessP1);

            guessP2 = p2.number;
            System.out.println("Player two guessed " + guessP2);

            if (guessP1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessP2 == targetNumber) {
                p2IsRight = true;
            }

            if (p1IsRight || p2IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1IsRight);
                System.out.println("Player two got it right? " + p2IsRight);
                System.out.println("Game is over");
                break;
            } else {
                System.out.println("Players will have to try again");
            }
        }
    }
}

