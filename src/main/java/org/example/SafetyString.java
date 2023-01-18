package org.example;

public class SafetyString {

    public static void main(String[] args) {

        String pass="!@#$%^&*())(*&^%$";
        String res="";

        for(int i=0;i<pass.length();i++) {

            int num=pass.charAt(i);

            int fake=num+2;
            char rr= (char) fake;
            res=res+rr;

        }
        System.out.println(res);
        String decrpty="";
        for(int i=0;i<res.length();i++) {

            char ch=res.charAt(i);

            int num=ch;
            int org=num-2;
            char rr= (char) org;
            decrpty=decrpty+rr;
        }
        System.out.println(decrpty);
    }
}
