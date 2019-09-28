package Question_9; //Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
import java.util.Scanner;

public class question_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text (in English): ");
        String str = scanner.nextLine();
        int upperCase = 0;
        int lowerCase = 0;

        for (int k = 0; k < str.length(); k++) {
            if (Character.isUpperCase(str.charAt(k)))
                upperCase++;
            if (Character.isLowerCase(str.charAt(k)))
                lowerCase++;
        }
        System.out.printf("Total %d capital letters and %d uppercase", upperCase, lowerCase);
    }
}



//2 вариант
        /*String result = str.trim().replaceAll(" ", "");
        System.out.println(result.length());
        int alength = result.split("(?=[a-z])").length;
        int Alength = result.split("(?=[A-Z])").length;
        System.out.println(Alength);
        System.out.println(alength);*/