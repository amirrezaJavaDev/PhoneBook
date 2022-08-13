package PhoneBook.logic;

import javax.swing.*;
import java.lang.constant.Constable;
import java.util.HashMap;
import java.util.Set;

public abstract class Stack <N,P>{
    private int size;
    private int top;
    private N []arrName;
    private P []arrPhone;
    HashMap<N,P> Contacts = new HashMap<>();
    public Stack() {
        this.size++;
        this.top = -1;
        this.arrName = (N[])new Object[size];
        this.arrPhone = (P[]) new Object[size];
    }

    private void setArrName(N name){
        this.arrName[top] =  name;
    }
    private  void setArrPhone(P phone){
        arrPhone[top] = phone;
    }
    private N getArrName(){
        N name = arrName[top];
        return name;
    }
    private P getArrPhone(){
        P phone = arrPhone[top];
        return phone;
    }
    protected void push(N name,P phone){
        if (top == arrName.length-1){
            N[] tempname = (N[])new Object[arrName.length+1];
            P[] tempphone = (P[]) new Object[arrPhone.length+1];
            for (int i = 0; i < arrName.length; i++) {
                tempname[i] = arrName[i];
            }
            arrName = tempname;
            for (int i = 0; i < arrPhone.length; i++) {
                tempphone[i] = arrPhone[i];
            }
            arrPhone = tempphone;
            top++;
            size++;
            setArrName(name);
            setArrPhone(phone);
            Contacts.put(name,phone);

        }else{
            top++;
            size++;
            setArrName(name);
            setArrPhone(phone);
            Contacts.put(name,phone);
        }
    }
    protected void pop(){
        if(top<0){
            System.out.println("No Contact Added");
            JOptionPane.showMessageDialog(null,"No Contact");
        }else{
            System.out.println("---- Show Contacts Log ------");
            for (int i = 0; i < arrName.length; i++) {
                System.out.println("Name:\t"+getArrName()+"\t Phone:\t"+getArrPhone());
                top--;
            }
            System.out.println("----- End Of Log ------------");
        }
    }
    protected P findContact(N name){
        System.out.println(Contacts.get(name));
          return Contacts.get(name);
    }
}
