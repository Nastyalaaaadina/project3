import java.util.Scanner;

import static java.lang.System.in;

public class Lab3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(in);
        System.out.println("Введите пароль, который содержит не менее 8-ми символов, среди которых есть заглавные английские буквы, цифры и _");
        String str = console.nextLine();
        boolean IsNotRange;
        String pat = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9_])^(!@#%&).{8,100000}";

        if (str.matches(pat)) {
            System.out.println("Пароль надежный");
        }
        else {
            System.out.println("Пароль не надежный, проверьте символы");
        }

    }


}
