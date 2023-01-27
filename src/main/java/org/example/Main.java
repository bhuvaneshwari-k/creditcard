package org.example;

import java.util.*;
class creditcard implements Cloneable{
    String cardnumber1="1202340456067808";
    String cardholdername;
    String cardnumber;
    String expirydate;
    creditcard(String number,String name,String date){
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter card holder's name:");
        String name=s.nextLine();
        System.out.println("Enter card number:");
        String number=s.nextLine();
        System.out.println("Enter expiration date:");
        String date=s.nextLine();
        creditcard cc=new creditcard(name,number,date);
        System.out.println("The new credit card details are:-");
        System.out.println("The card holder's name is:"+cc.cardholdername);
        System.out.println("The card number is:"+cc.cardnumber);
        System.out.println("The expiration date is:"+cc.expirydate);

        String result=cc.checknumber();
        if(result.equals("true")){
            System.out.println("your card number is correct.");
        }
        else{
            System.out.println("your card number is not correct.");

        }
        creditcard cc1=(creditcard)cc.clone();
        System.out.println("The cloned credit card details are:-");
        System.out.println("The card holder's name is:"+cc1.cardholdername);
        System.out.println("The card number is:"+cc1.cardnumber);
        System.out.println("The expiration date is:"+cc1.expirydate);

    }

}