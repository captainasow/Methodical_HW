import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear;
        int birthMonth;
        int birthDay = 0;
        int birthHour;
        int birthMinute;
        birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2010);
        birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        switch (birthMonth)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day",1, 31);
                break;
            case 4, 6, 9, 11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day",1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day",1, 29);
                break;
        }
        birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);
        System.out.println("\nYou birthday is on: " + birthMonth + "/" + birthDay + "/" + birthYear + ". You were born at this time, in military format: " + birthHour + ":" + birthMinute);
    }
}
