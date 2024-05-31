package org.nudha;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int[] nums2 = {1};
       // merge(nums1,0,nums2,1);

        //Counter
        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
       // System.out.println(Counter.count(7,11,5,apples));

        //Kangaroos
        //System.out.println(Kangaroos.jumps(0,3,4,2));

        //Score
        int[] scoresMas = new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1};
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < scoresMas.length; i++){
            scores.add(scoresMas[i]);
        }
        //System.out.println(Arrays.toString(Score.brokeRecords(scores).stream().toArray()));

        //Chocolate
        int[] chocValues = new int[]{1,1,1,1,1,1};
        List<Integer> chocolateBar = new ArrayList<>();
        for (int i = 0; i < chocValues.length; i++){
            chocolateBar.add(chocValues[i]);
        }
        //System.out.println(Chocolate.waysToShare(chocolateBar,3,2));

        //RankedScore
        int[] rankScore = new int[]{100,90,90,80,75,60};
        List<Integer> rankScoreTable = new ArrayList<>();
        for (int i = 0; i < rankScore.length; i++){
            rankScoreTable.add(rankScore[i]);
        }

        int[] playerScore = new int[]{50,65,77,90,102};
        List<Integer> playerScoreTable = new ArrayList<>();
        for (int i = 0; i < playerScore.length; i++){
            playerScoreTable.add(playerScore[i]);
        }

        RankedScore.rank(rankScoreTable, playerScoreTable).stream().forEach(System.out::println);
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n){
        if(n==0){
            System.out.println(Arrays.toString(nums1));
        }else if(m==0){
            for(int i = 0; i<nums1.length;i++){
                nums1[i]=nums2[i];
            }
            System.out.println(Arrays.toString(nums1));
        }else{
            int b = nums1.length - n ;
            int k = 0;
            for(;b < nums1.length; b++){
                   nums1[b] = nums2 [k];
                   k++;
            }

            int l = nums1.length;
            for (int i = 0; i < l - 1; i++)
                for (int j = 0; j < l - i - 1; j++)
                    if (nums1[j] > nums1[j + 1]) {
                        // swap temp and arr[i]
                        int temp = nums1[j];
                        nums1[j] = nums1[j + 1];
                        nums1[j + 1] = temp;
                    }

            System.out.println(Arrays.toString(nums1));
        }
    }

    private static void remove(int[] nums){
        int res = 0;
        int num = 0;
        for (int i=0; i<nums.length;i++){
            
        }
    }

}