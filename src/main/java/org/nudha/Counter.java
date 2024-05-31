package org.nudha;

import java.util.List;

public class Counter {
    public static int count(int s, int t, int o, List<Integer> items) {
        int c = 0;
        for(int i = 0; i < items.size(); i++){
            if((items.get(i) + o>=s) && (items.get(i) +o<=t)){
                c++;
            }
        }
        return c;
    }
}
