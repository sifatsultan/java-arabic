#!/bin/java
import java.util.Scanner;

public class Plural{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Plural Exercise");
     System.out.println("--------------- \n");
     System.out.println("The word falls under which category? \na: Plural with Ending \nb: Plural without Ending");        
     String option = sc.next();
        switch(option){
            case "a":
                System.out.println("Its either Musculine Plural, or Feminine Plural");
                break;
            case "b":
                System.out.println("Human or Objects? \na or b");
                String option1 = sc.next();
                switch(option1){
                    case "a":
                        System.out.println("We call it Human Broken Plural, they can be treated as she or whatever they are");
                        break;
                    case "b":
                        System.out.println("Non Human Broken Plural which are always treated as she");
                        break;
                    default:
                        System.out.println("Select a or b");
                        break;
                }
                break;
            default:
                System.out.println("Select ending or no-ending");
                break;
        }
    }
}
