package org.santhoshkumar;

public class SelectionSort {

    int[] values;

    public static void main(String[] args) {
        int[] a = {9,8,7,6,3,4,2,1,0};
        SelectionSort ss = new SelectionSort();
        ss.values = a;
        ss.sort();
        ss.print();
    }

    public void sort(){
        for(int i = 0; i < values.length-1; i++){
            for(int j = i+1; j < values.length; j++){
                if(values[i]>values[j]){
                    swap(i,j);
                }
            }
        }
    }

    private void swap(int from, int to){
        int temp = values[from];
        values[from] = values[to];
        values[to] = temp;
    }

    public void print(){
        for(int i=0; i < values.length; i++){
            System.out.print(values[i]+ " ");
        }
        System.out.println();
    }
}
