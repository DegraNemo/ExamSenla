import java.util.Scanner;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер валюты из которой переводить 1)Usd, 2)Jpy, 3)Rub, 4)Gbp, 5)Eu: ");
        int current = input.nextInt() - 1;
        System.out.print("Введите сумму: ");
        float value = input.nextFloat();

        float[][] kofMatrix = new float[][] {{1.0F,148.0F,83.56F,0.74F,0.85F},{0.0068F,1.0F,0.556F,0.005F,0.0057F},{0.012F,1.8F,1.0F,0.009F,0.0102F},{1.35F,200.0F,112.5F,1.0F,1.15F},{1.18F,175.0F,98.0F,0.87F,1.0F}};
        String[] currency = new  String[] {"usd: ","jpy: ","rub: ","gpb: ","eu: "};
        for(int i = 0; i<5; i++){
            System.out.println(currency[i]+value*kofMatrix[current][i]);
            System.out.println("x"+kofMatrix[current][i]);
            System.out.println(" ");
        }

    }
}
