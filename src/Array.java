/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author flag10
 */
public class Array {

    public static void displayNumbers() {
//        String[] studentNames = {"clinton", "Joram", "Rose", "Vivian"};
//        int[] marks = {80, 60, 70, 40};
        int[]numbers={30,60,70,90,40,20,100};
        int maximum=numbers[0];
        int count;
        for (count = 1; count<numbers.length; count++) {
            if(numbers[count]>maximum){
                maximum=numbers[count];
            }
             
        }
        System.out.println("Maximum number is:"+maximum);
    }

    public static void main(String[] args) {
        displayNumbers();
    }
}
