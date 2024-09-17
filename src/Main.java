import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final DecimalFormat df = new DecimalFormat("#.00");
        double bill;
        int tipPercent;
        double tip;
        int people;
        double total;
        double averageTip;
        double averageTotal;

        Scanner s = new Scanner(System.in);


        System.out.println("     _______________________________________________________\n" +
                "    /\\                                                      \\\n" +
                "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n" +
                "    \\/''''''''''''''''''''''''''''''''''''''''''''''''''''''/");
        System.out.println("        !! Please enter all numbers, without any symbols. !! \n");
        System.out.print("      | Enter your bill: ");
        bill = Double.parseDouble(s.nextLine());

        System.out.print("      | Tip Percent (Whole Number): ");
        tipPercent = Integer.parseInt(s.nextLine());

        System.out.print("      | Number of People: ");
        people = Integer.parseInt(s.nextLine());


        // calculations
        tip = bill * tipPercent/ 100;
        averageTip = tip / people;

        total = tip + bill;
        averageTotal = total / people;


        // Printing out final statements
        System.out.println("\n              ------------------------------------\n");
        System.out.println("      | Total Tip Amount: $" + df.format(tip));
        System.out.println("      | Total bill: $" + df.format(total));
        System.out.println("      | Tip per person: $" + df.format(averageTip));
        System.out.println("      | Total bill per person: $" + df.format(averageTotal) +"\n");
        System.out.println("    /\\''''''''''''''''''''''''''''''''''''''''''''''''''''''\\    \n" +
                "(O)===)><><><><><><><><><><><><><><><><><><><><><><><><><><><)==(O)\n" +
                "    \\/______________________________________________________/");

    }
}