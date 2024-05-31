package org.nudha;

public class Kangaroos {
    public static String jumps(int x1, int v1, int x2, int v2){
        double a = (double) (x1 + v1) /(x2+v2);
        if(a>=0.5 && a<=1){
            return "YES";
        }else{
            return "NO";
        }
    }
}
