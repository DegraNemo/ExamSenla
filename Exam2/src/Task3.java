import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String special = "^$?!@#%&";
        String digit = "1234567890";
        String letter = "qwertyuiopasdfghjklzxcvbnm";
        String Letter = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String[] symboll = new String[]{"^$?!@#%&", "1234567890", "qwertyuiopasdfghjklzxcvbnm", "QWERTYUIOPASDFGHJKLZXCVBNM"};
        System.out.println("Введите длину пароля: ");
        int passLength = input.nextInt();

        String pass = "";
        int x = 0;
        int y = 0;
        int z = 0;
        int t = 0;

        do {
            for(int i = 0; i < passLength; ++i) {
                int randomNum = random.nextInt(4);
                switch (symboll[randomNum]) {
                    case "^$?!@#%&" -> ++x;
                    case "1234567890" -> ++y;
                    case "qwertyuiopasdfghjklzxcvbnm" -> ++z;
                    case "QWERTYUIOPASDFGHJKLZXCVBNM" -> ++t;
                }

                pass = pass + symboll[randomNum].charAt(random.nextInt(symboll[randomNum].length()) + 0);
            }
        } while(x == 0 || y == 0 || z == 0 || t == 0);

        System.out.println("Ваш пароль: " + pass);
    }
}