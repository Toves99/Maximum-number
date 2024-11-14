
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author flag10
 */
public class Array {

    public static void displayMaximumNumberInArray() {
        int[] numbers = {30, 60, 70, 90, 40, 20, 100};
        int maximum = numbers[0];
        int count;
        for (count = 1; count < numbers.length; count++) {
            if (numbers[count] > maximum) {
                maximum = numbers[count];
                List array = new ArrayList();
                array.add(maximum);
                System.out.print("Maximum numbers is:" + array);
            }

        }
        System.out.println("========================================================");
        List array = new ArrayList();
        array.add(maximum);
        System.out.println("Greatest number is:" + array);

    }

    public static void main(String[] args) {
        displayMaximumNumberInArray();
    }
}
