import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        boolean continueOn;
        boolean done = true;
        double sum = 0;
        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", .50, 9.99);
            continueOn = SafeInput.getYNConfirm(in, "Do you have another item?");
            if (continueOn) {
                itemPrice = in.nextDouble();
                sum += itemPrice;
            } else {
                done = false;
            }

        }while (done);
        System.out.println(sum);
    }
}
