package org.nudha;

import java.util.List;

public class Chocolate {
    public static int waysToShare(List<Integer> chocValues, int day, int month){
        int countedWays = 0;
        for(int i = 0; i <= chocValues.size() - month; i++){
            int a = 0;
            for(int j = month - 1; j>=0; j--){
                a += chocValues.get(j+i);
            }
            if(a==day){
                countedWays++;
            }
        }
        return countedWays;
    }
}
