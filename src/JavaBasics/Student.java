package JavaBasics;

import java.util.ArrayList;

public class Student{

    ArrayList<Integer> scores;
    private double average;

    public ArrayList<Integer> getScores(){ return scores; }

    public double getAverage(){ return average; }

    private void computeAverage(){
        //valid code to compute average
        average = //update average value
    }

    public Student(){
        computeAverage();
    }

    //other code irrelavant to this question not shown

}

//Make the scores instance field private.
//Change getScores to return a copy of the scores list:
//   public ArrayList<Integer> getScores(){
//     return new ArrayList(scores);
//  }