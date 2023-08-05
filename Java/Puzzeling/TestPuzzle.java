import java.text.Format;
import java.util.ArrayList;
public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava getAllMethods = new PuzzleJava();
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        randomList = getAllMethods.getTenRolls();
        System.out.println("Random list" + randomList);

        
        String randomLetter = getAllMethods.getRandomLetterWithArray(); 
        System.out.println("Random letter : " + randomLetter);

        String passwordString = getAllMethods.generatePassword(); 
        System.out.println("Your pass : "+ passwordString);

        ArrayList<String> newPassword = new ArrayList<String>(); 
        newPassword= getAllMethods.getNewPasswordSet(4);
        System.out.println(newPassword);
    }
}
