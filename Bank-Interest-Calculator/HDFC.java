import java.util.Scanner;
public class HDFC extends InterestCalculator {
    static float interest;
    static float r;
    static float cal(int pr,float t,int type_loan){
        if(type_loan==1){
            if(t<=30){
                r=7;
                interest =  ((pr* r * t) / 100);
            }
            else
            {
                System.out.println("The time period should be less than 30 years.");
            }
        }
        else if(type_loan==2){
            if(t<=7){
                r=9;
                interest =  ((pr* r * t) / 100);
            }
            else
            {
                System.out.println("The time period should be less than 7 years.");
            }
        }
        else if(type_loan==4){
            if(t<=5){
                r=11;
                interest =  ((pr* r * t) / 100);
            }
            else
            {
                System.out.println("The time period should be less than 5 years.");
            }
        }
        return interest;
    }
    static float cal(float pr, float t, int type_loan) {
        r=10;
        interest =  ((pr* r * t) / 100);
        return interest;
    }
    void show() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to HDFC Bank");
        System.out.println("What Type of loan You want:  \n press 1 for Home Loan \n press 2 for Education Loan \n press 3 for Gold Loan \n press 4 for Personal Loan");
        int type_loan = sc.nextInt();

        if(type_loan==3){
            System.out.print("Enter grams: ");
            float grams = sc.nextFloat();
            System.out.print("Enter the Time period : ");
            float t = sc.nextFloat();
            float amount = grams*3450;
            System.out.println("The principal Amount is: Rs."+amount+"\n"+"The Interest Amount is: Rs."+HDFC.cal(amount,t,type_loan)+
                    "\nAnd the Period Of Replacement is:" +
                    " "+t+" Years");
        }
        else if(type_loan==1 || type_loan==2 ||type_loan==4){
            System.out.print("Enter the Principal : ");
            float princi = sc.nextFloat();
            int pr = (int) princi;
            System.out.print("Enter the Time period : ");
            float t = sc.nextFloat();
            System.out.println("The Interest Amount is: "+HDFC.cal(pr,t,type_loan)+ "\n And the Period Of Replacement is: "+t+" Years");
        }

    }
}
