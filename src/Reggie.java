import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn;
        String ucmNumber;
        String menuChoice;
        ssn = SafeInput.getRegExString(in, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        ucmNumber = SafeInput.getRegExString(in, "Enter your UC M ID", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in, "Menu Choice", "[OoSsVvQq]");
        System.out.println(ssn);
        System.out.println(ucmNumber);
        System.out.println(menuChoice);
    }
}
