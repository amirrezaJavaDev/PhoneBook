package PhoneBook.logic;

import PhoneBook.Runner;

import javax.swing.*;

public class Phone extends Stack<String,String>{
        public void addContect(){
            String name = JOptionPane.showInputDialog(null, "Write you're Name Please", "Welcome", JOptionPane.DEFAULT_OPTION);
            //long phone = Long.parseLong(JOptionPane.showInputDialog(null, "Write you're Phonenumber Please", "Welcome", JOptionPane.DEFAULT_OPTION));
            String phone = JOptionPane.showInputDialog(null, "Write you're Phonenumber Please", "Welcome", JOptionPane.DEFAULT_OPTION);
            //condition
            String phn = String.valueOf(phone);
            if (phn.length() == 11 || phn.length() == 10){
                JOptionPane.showMessageDialog(null, "Name:" + name + "\t Phonenumber" +"0"+phone, "Answer", JOptionPane.INFORMATION_MESSAGE);
                push(name,phone);
            }else{JOptionPane.showMessageDialog(null,"Please Enter Correct Answer","Warning",JOptionPane.WARNING_MESSAGE);
                System.out.println("* Enter a corect number");
                Runner run  = new Runner();
            }
        }
        public void showContect(){
            pop();
        }
        public  void findContactByName(String name){
             String numberfind = findContact(name);
             //String Nullnumber = null;
            try {
                if (numberfind.equals(null)) {
                    JOptionPane.showMessageDialog(null, "Not Find");
                } else {
                    JOptionPane.showMessageDialog(null, "\t"+numberfind);
                }
            }catch (NullPointerException e){JOptionPane.showMessageDialog(null, "Not Find");}
        }
}
