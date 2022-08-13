package PhoneBook;

import PhoneBook.logic.Phone;
import exams.Box;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Runner {
    static Phone phn = new Phone();
    static Scanner scn;
    static boolean Condi = true;
    static  void menuPhone(){
        int chosse;
        do {
            try {
                 chosse = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Add Contact\n2)Edit Contact \n3)Delete Contact\n4)Show All Contacts\n5)Find Number(by name)\n0)Exit", "Welcome to PhoneBook :)", JOptionPane.DEFAULT_OPTION));
                //scn = new Scanner(System.in);
                //System.out.print("Chosse number>>");
                //int chosse = scn.nextInt();
                switch (chosse) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "GoodBye");
                        Condi = false;
                        break;
                    case 1:
                        phn.addContect();
                        break;
                    case 2:
                        System.out.println("edit contact");
                        JOptionPane.showMessageDialog(null, "Coming Soon...");
                        break;
                    case 3:
                        System.out.println("delete contact");
                        break;
                    case 4:
                        phn.showContect();
                        break;
                    case 5:
                        String name = JOptionPane.showInputDialog(null, "Please Enter a Name to find Number");
                        phn.findContactByName(name);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Please Enter Correct Number");
                        break;
                    default:
                        System.out.println("Plases Enter a number");
                }
            } catch (NumberFormatException e) {//
                // throw new RuntimeException(e);
                JOptionPane.showMessageDialog(null, "Please Enter Correct Number");
                //chosse = 5;
            }
        }while (Condi);
    }
    public static void main(String[] args) {
        System.out.println("\t Welcome to phone");
        menuPhone();
        System.out.println("GoodBye");
    }
}
