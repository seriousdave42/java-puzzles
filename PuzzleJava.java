import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> numberPuzzle() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(8);
        numbers.add(13);
        numbers.add(25);
        numbers.add(32);

        int sum = 0;
        ArrayList<Integer> greaterThanTen = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (numbers.get(i) > 10) {
                greaterThanTen.add(numbers.get(i));
            }
        }
        System.out.println("Array sum = " + sum);
        return greaterThanTen;
    }

    public ArrayList<String> namePuzzle() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        System.out.print(names);

        ArrayList<String> longerThanFive = new ArrayList<String>();
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 5) {
                longerThanFive.add(names.get(i));
            }
        }
        return longerThanFive;
    }

    public void alphabetShuffle() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 97; i <= 122; i++) {
            alphabet.add((char)i);
        }
        Collections.shuffle(alphabet);
        System.out.println("First letter post-shuffle: " + alphabet.get(0));
        if (alphabet.get(0) == 'a' || alphabet.get(0) == 'e' || alphabet.get(0) == 'i' || alphabet.get(0) == 'o' || alphabet.get(0) == 'u') {
            System.out.println("It's a vowel!");
        }
        System.out.println("Last letter post-shuffle: " + alphabet.get(25));
    }

    public void randomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 1; i <= 10; i++){
            numbers.add(r.nextInt(46)+55);
        }
        Collections.sort(numbers);
        System.out.println("Random array = " + numbers);
        System.out.println("Minimum value = " + Collections.min(numbers));
        System.out.println("Maximum value = " + Collections.max(numbers));
    }
    
    public String randomString() {
        String output = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            output += (char)(r.nextInt(26)+97); 
        }
        return output;
    }

    public ArrayList<String> tenRandomStrings() {
        ArrayList<String> randos = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            randos.add(randomString());
        }
        return randos;
    }
}