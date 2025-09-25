import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] words = new String[] {"bridge", "bow", "cupcake", "chest", "horse", "math" };

        int wordNum = random.nextInt(words.length);
        char[][] letters = new char[words[wordNum].length()][2];

        int hp = 3;
        int round = words[wordNum].length();


        System.out.println("Guess this word: ");

        for(int i = 0; i < words[wordNum].length(); i++){
            letters[i][0] = words[wordNum].charAt(i);
            letters[i][1] = '_';
            System.out.print(letters[i][1]);
        }

        System.out.println(" ");

        while(hp>0 && round>0) {

            int count = round;

            System.out.println("Enter the letter:");
            char letter = input.nextLine().charAt(0);

            for(int i = 0; i < words[wordNum].length(); i++){
                if(letter == letters[i][0]){
                    letters[i][1] = letters[i][0];
                    --round;
                }
                System.out.print(letters[i][1]);
            }

            System.out.println(" ");
            System.out.println(round);

            if (round == count) {
                --hp;
                System.out.println("You entered the wrong letter. Attempts: " + hp);
            }

        }

        if(hp > 0 && round == 0){
            System.out.println("You won!");
        }


    }
}
