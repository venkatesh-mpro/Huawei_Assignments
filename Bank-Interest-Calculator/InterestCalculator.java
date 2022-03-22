import java.util.*;
public class InterestCalculator {
    public static void main(String[] args)  {
        String b1="HDFC";
        String b2 ="DBS";
        System.out.println("Hey User which bank you want to Select: ");
        Scanner sc =  new Scanner(System.in);
        String bank= sc.next();
        if(bank.equalsIgnoreCase(b1)){
            HDFC sb = new HDFC();
            sb.show();
        }
        else if(bank.equalsIgnoreCase(b2)){
            DBS ab = new DBS();
            ab.show();
        }
        else {
            System.out.println("The Bank is not available");
        }
    }

}
