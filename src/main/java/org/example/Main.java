package org.example;

public class Main {
    public static void main(String[] args) {
        String text = "Dinesh84@";
       text= text.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        String[] req = text.split("");
        String res = "";
        String key = "";

        for (int k = 0; k < req.length; k++) {

            if (alp.contains(req[k])) {

                int ans = alp.indexOf(req[k]) + 1;
                if (ans > 9 && ans < 15) {
                    key = "*";
                } else if (ans > 14 && ans < 20) {
                    key = "&";
                } else if (ans > 19) {
                    key = "$";
                } else {
                    key = "!";
                }
                if (ans > 9) {
                    res = res + ansAddtions(ans) + key;
                } else {
                    res = res + (ans) + key;
                }
            }
        }

        String[] result=res.split("");
        String fin="";
        for(int i=0;i<result.length;i++) {
            if(i==0 || i%2==0) {

                char c= (char) (Integer.parseInt(result[i])+39);

                result[i]= String.valueOf(c);
            }
        }
        String ress=arrayToString(result);

        System.out.println(ress);
        decrype("+!0!,*,!(&/!");
    }

    private static String arrayToString(String[] result) {
        String res="";
        for(int i=0;i< result.length;i++) {
            res=res+result[i];
        }
        return res;
    }

    private static String ansAddtions(int ans) {

        int res = 0;
        while (ans != 0) {
            int rem = ans % 10;
            ans = ans / 10;
            res = res + rem;
        }

        if (res > 9) {
            res = Integer.parseInt((String) ansAddtions(res));
        }

        return Integer.toString(res);
    }
    private static String decrype(String ans) {

        String[] results = ans.split("(?<=\\G.{" + 2 + "})");

        String result="";
        for(int i=0;i< results.length;i++) {
            if(results[i].contains("!")) {

                String alp="abcdefghi";
                String res=results[i];
               char ch= res.charAt(0);
                int a = ch;
                int num= a-39;
                result=result+alp.charAt(num-1);
            } else if (results[i].contains("*")) {
                String alp="jklmn";
                String res=results[i];
                char ch= res.charAt(0);
                int a = ch ;
                int num= a-39;
                result=result+alp.charAt(num-1);

            }else if(results[i].contains("&")) {
                String alp="opqrs";
                String res=results[i];
                char ch= res.charAt(0);
                int a = ch ;
                int num= a-39;
               if(num!=1)
                result=result+alp.charAt(num-6);
               else
                   result=result+"s";

            }else {
                String alp="tuvwxyz";
                String res=results[i];
                char ch= res.charAt(0);
                int a = ch ;
                int num= a-39;
                result=result+alp.charAt(num-2);
            }
        }
        System.out.println(result);
        return "";
    }
}