public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            System.out.println(String.format("%d %s of beer on the wall", beerNum, word));
            System.out.println(String.format("%d %s of beer", beerNum, word));
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum -= 1;

            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle
            }

            if (beerNum > 0) {
                System.out.println(String.format("%d %s of beer on the wall", beerNum, word));
            }
        } // end while loop
        System.out.println("No more bottles of beer on the wall");
    } // end main method
} // end class
