package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    //we don't want our array to be mutable that's why private
    private int[] data;
    //static cause it doesn't depend on object
    private static int Size_Default = 10;
    //initial size
    private int size = 0; //also working as index value

    public CustomArrayList() {
        this.data = new int[Size_Default];
    }
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];
    //copy all the elements in the temp array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        //we are just reducing the size of the list by one and returning that list
        int removed = data[--size];
        return removed;
    }

    public int get (int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(7);

        System.out.println(list);
//        ArrayList list = new ArrayList();


//      so tha problem with above arraylist is that it could only store one
//      type of data type i.e int, string, char etc

        //but arraylist can store any type of data type so to do that we
        // create an internal arraylist with the data type inserted in it
        //ans this functionality is know as GENERICS i.e <Integer>
        ArrayList<Integer> list2 = new ArrayList<>();

    }
}
