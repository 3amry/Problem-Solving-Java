package Structures;

import java.util.Arrays;

public class Array {
    public int length;
    private int count = 0;
    private int[] array;
    public Array(int length) {
        this.length = length;
        array = new int [length];
    }

//    O(n)
    public void insert(int number){
        if (count >= length){
            int[] newArray = new int[++length];
            for (int i = 0; i < length-1; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count++] = number;
    }

//    O(n)
    public void removeAt(int index){
        int [] newArray = new int[--length];
        for (int i =0; i<index; i++){
            newArray[i] = array[i];
        }
        for (int i = index; i < length; i++){
            newArray[i] = array[i+1];
        }
        array = newArray;
        count--;
    }

//    O(n)
    public int indexOf(int number){
        for (int i = 0; i < length; i++){
            if (array[i] == number)
                return i;
        }
        return -1;
    }

//    O(n)
    public void reverse(){
        int [] newArray = new int[length];
        for (int i = 0; i < length; i++){
            newArray[i] = array[length-i-1];
        }
        array = newArray;
    }

//    O(n)
    public int max(){
        int max = 0;
        for (int num : array){
            if (num > max)
                max = num;
        }
        return max;
    }

    public void print(){
        System.out.println(Arrays.toString(array));
    }
}
