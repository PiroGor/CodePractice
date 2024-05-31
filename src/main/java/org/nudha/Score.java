package org.nudha;

import java.util.ArrayList;
import java.util.List;

public class Score {
    public static List<Integer> brokeRecords(List<Integer> records){
        List<Integer> timesOfBrokeRecords = new ArrayList<>(2);
        timesOfBrokeRecords.add(0);
        timesOfBrokeRecords.add(0);

        int max = records.get(0);
        int min = records.get(0);

        for(int i:records){
            if(i>max){
                max = i;
                timesOfBrokeRecords.set(0, timesOfBrokeRecords.get(0)+1);
            } else if (i<min) {
                min = i;
                timesOfBrokeRecords.set(1, timesOfBrokeRecords.get(1)+1);
            }
        }
        return timesOfBrokeRecords;
    }
}
