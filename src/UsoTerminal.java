import java.util.Locale;
import java.util.Scanner;

public class UsoTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual seu nome?");
        String nome = scanner.next();
        
        System.out.println("seu nome é :"+ nome);

    }
}
