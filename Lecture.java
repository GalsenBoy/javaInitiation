import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.InputMismatchException;
// import java.util.Scanner;
import java.util.*;

public class Lecture {

    public static void main(String[] args) {
        try {
            Scanner wd = new Scanner(System.in);
            System.out.print("Quel est votre âge : ");
            int number = wd.nextInt();
            System.out.println(number);

            BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Quel est votre nom : ");
            StringBuilder name = new StringBuilder(str.readLine());
            System.out.println(name);
        } catch (InputMismatchException e) {
            System.out.println(" Veuillez saisir un âge valide ");
        } catch (IOException e) {
            System.out.println(" Veuillez saisir un âge ou nom valide ");
        }
    }
}
