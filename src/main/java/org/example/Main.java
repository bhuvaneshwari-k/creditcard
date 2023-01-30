package org.example;
import java.util.logging.*;
import java.util.*;
class Creditcard implements cloneable{
    String cardnumber1="1202340456067808";
    String cardholdername;
    String cardnumber;
    String expirydate;
    Creditcard(String number,String name,String date){
        cardholdername=number;
        cardnumber=name;
        expirydate=date;
    }
    String checknumber(){
        if(cardnumber.equals(cardnumber1)){
            return "true";
        }
        else{
            return "false";
        }
    }
    protected Object creditcard2() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner s=new Scanner(System.in);
        static Logger l=Logger.getLogger("com.api.jar");
        l.info("Enter card holder's name:");
        String name=s.nextLine();
        l.info("Enter card number:");
        String number=s.nextLine();
        l.info("Enter expiration date:");
        String date=s.nextLine();
        Creditcard cc=new Creditcard(name,number,date);
        l.info("The new credit card details are:-");
        l.log(Level.INFO, () -> "The card holder's name is:" +cc.cardholdername);
        l.log(Level.INFO, () -> "The card number is:" +cc.cardnumber);
        l.log(Level.INFO, () -> "The expiration date is:" +cc.expirydate);
        String result=cc.checknumber();
        if(result.equals("true")){
            l.info("your card number is correct.");
        }
        else{
            l.info("your card number is not correct.");

        }
         Creditcard cc1=(Creditcard)cc.creditcard2();
        l.info("The cloned credit card details are:-");
         l.log(Level.INFO, () -> "The card holder's name is:" +cc1.cardholdername);
         l.log(Level.INFO, () -> "The card number is:" +cc1.cardnumber);
         l.log(Level.INFO, () -> "The expiration date is:" +cc1.expirydate);
    }

}
