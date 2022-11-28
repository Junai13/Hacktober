import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Day30Thirty {
    public static void main(String[] args) {
        Day30Thirty thirty = new Day30Thirty();
        thirty.process();
    }
    private void process(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        sc.close();
        Set<Character> symbols = new LinkedHashSet<>();
        Set<Integer> places = new LinkedHashSet<>();
        char[] memoryGame = new char[size * size];
        Random random = new Random();
        int place;char symbol;
        while (symbols.size() < (size * size) / 2 + (size % 2)) {
            symbol = (char) (random.nextInt(93) + 33);
            symbols.add(symbol);
        }
        while (places.size() < (size * size)) {
            place = random.nextInt(size * size);
            places.add(place);
        }
        Object[] placesAr = places.toArray();
        Object[] symbolsAr = symbols.toArray();
        for (int i = 0; i < placesAr.length; i++) {
            if (i < symbolsAr.length)
                memoryGame[(int) placesAr[i]] = (char) symbolsAr[i];
            else
                memoryGame[(int) placesAr[i]] = (char) symbolsAr[i - symbolsAr.length];
        }
        for (int i = 0; i < memoryGame.length; i++) {
            System.out.print(memoryGame[i]+" ");
            if((i+1)%size==0)
                System.out.println();
        }
    }
}
