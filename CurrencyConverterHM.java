import java.util.HashMap;
import java.util.Map;
import java.util.*;



     class CurrencyConverter {
    private static HashMap<String, Double> ConversionRates = new HashMap<>();
    static{
        ConversionRates.put("USD to INR",83.14);
        ConversionRates.put("USD to EUR",0.92);
        ConversionRates.put("USD to DH",3.68);
        ConversionRates.put("EUR to USD",1.09);
        ConversionRates.put("EUR to INR",90.75);
        ConversionRates.put("EUR to DH",3.99);
        ConversionRates.put("INR to USD",0.012);
        ConversionRates.put("INR to EUR",0.011);
        ConversionRates.put("INR to DH",0.44);
        ConversionRates.put("DH to USD",0.27);
        ConversionRates.put("DH to INR",22.72);
        ConversionRates.put("DH to EUR",0.25);
    }


    public void convertCurrency(String fromcurrency,String tocurrency,Double amount){
        String conversionkey= fromcurrency + " to " + tocurrency;
        if(ConversionRates.containsKey(conversionkey)){
        double convertedamount=amount * ConversionRates.get(conversionkey);
        System.out.println(String.format("%.2f %s =%.2f %s",amount , fromcurrency , convertedamount , tocurrency));
        }
        else{
            System.out.println("Invalid conversion type");
        }

         
    }

    
}
public class CurrencyConverterHM {
public static void main(String[] args) {
    String fromcurrency="";
    String tocurrency="";
     Scanner sc=new Scanner(System.in); 
    
     System.out.println("Enter the amount");
    double amount=sc.nextDouble();
    
    System.out.println("Enter the currency \n 1.INR\n 2.USD \n 3.EURO \n 4.DHARAM");
    int fromChoice=sc.nextInt();
    sc.nextLine();
    fromcurrency=CurrencyCode(fromChoice);
     
     System.out.println("Enter the currency you Want to Convert \n 1.INR\n 2.USD \n 3.EURO \n 4.DHARAM");
     int toChoice=sc.nextInt();
     sc.nextLine();
     tocurrency=CurrencyCode(toChoice);
    
         


CurrencyConverter converter=new CurrencyConverter();
converter.convertCurrency(fromcurrency, tocurrency, amount);
}


public static String CurrencyCode(int choice)
{

switch(choice)
     {
        case 1:
                return "INR";
        case 2:
             return "USD";
        case 3:
             return "EUR";
        case 4:
               return "DH"; 
        default: return null;    
            
                    
     }
    }
}

