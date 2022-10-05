import java.text.DecimalFormat;
import java.util.Scanner;
public class UL1Project  {
    public static void main(String[] args){
        DecimalFormat dRound = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);
        double noTaxBill;
        double tipPercentage;
        double tipAmount;
        double totalTipAmount;
        int partyAmount;
        double totalBill;
        double personTip;
        double  eachPersonAmount;
        System.out.println("");
        System.out.println("Hello User! Please input the bill amount");
        noTaxBill = s.nextDouble();
        System.out.println("Please input the tip percentage as a whole number");
        tipPercentage = s.nextDouble();
        System.out.println("input the number of people");
        partyAmount = s.nextInt();
        tipAmount = tipPercentage/100.0;
        totalTipAmount = (noTaxBill*tipAmount);
        totalBill = totalTipAmount + noTaxBill;
        totalBill = Math.round(totalBill*100)/100.0;
        personTip = totalTipAmount/partyAmount;
        personTip = Math.round(personTip*100)/100.00;
        totalTipAmount = (double) Math.round(totalTipAmount*100)/100.0;
        eachPersonAmount = totalBill/partyAmount;
        eachPersonAmount = Math.round(eachPersonAmount*100)/100.00;
        System.out.println("Your total bill with tip is:  $"+ dRound.format(totalBill));
        System.out.println("Each person must pay:  $" + dRound.format(personTip)+ " each for tip");
        System.out.println("The total per person is:  $"+ dRound.format(eachPersonAmount));

    }
}
