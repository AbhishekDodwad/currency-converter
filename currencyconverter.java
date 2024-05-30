import java.util.Scanner;

class currencyconvertersub
 {
   public static void  Dollar_To_Other(Double Amount)
   {
    System.out.println("1 Dollar = 83.37 Rupee");
    System.out.println(Amount + "   Dollar= " + (Amount*83.37) + "   Rupee");
    System.out.println();
    System.out.println("1 Dollar = 0.92 Euro");
    System.out.println(Amount + "   Dollar = " + (Amount*0.92) + "  Euro   ");
    
   }
   
   public void  Euro_To_Other(Double Amount)
   {
    System.out.println("1 Euro = 90.75 Rupee");
    System.out.println(Amount + "   Euro= " + (Amount*90.75) + "   Rupee");
    System.out.println();
    System.out.println("1 Euro = 1.09 Dollar");
    System.out.println(Amount + "   Euro = " + (Amount*1.09) + "  Euro   ");
    
   }

   public void  Rupee_To_Other(Double Amount)
   {
    System.out.println("1 Rupee = 0.012 Dollar");
    System.out.println(Amount + "   Rupee= " + (Amount*0.012) + "   Dollar");
    System.out.println();
    System.out.println("1 Rupee =  0.011 Euro");
    System.out.println(Amount + "   Rupee = " + (Amount*0.011) + "  Euro   ");
    
   }


    
}

public class currencyconverter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount:");
        Double Amount=sc.nextDouble();
        System.out.println("1.Dollar\n2.Euro\n3.Rupee");
        System.out.println("Choose the currency Which you want to convert:");
        int ch=sc.nextInt();
        currencyconvertersub ob=new currencyconvertersub();

        switch (ch) {
            case 1:
           ob.Dollar_To_Other(Amount);
                
                break;
            case 2:
            ob.Euro_To_Other(Amount);
                break;
            case 3:
           ob.Rupee_To_Other(Amount);    
                break;
            default:System.out.println("Invalid Choice");
                break;
        }
    }


}

