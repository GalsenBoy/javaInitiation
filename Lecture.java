import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Lecture {

    public static void main(String[] args) throws Exception {
        Scanner wd = new Scanner(System.in);
        System.out.println("Quel est votre âge");
        int number = wd.nextInt();

        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Quel est votre nom");
        StringBuilder name = new StringBuilder(str.readLine());

    }
}
