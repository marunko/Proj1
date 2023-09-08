package AlgorithmsArrays.Sorting;

import java.util.Arrays;

public class SortArray {
    static int[] array = {1,23,4,6,7,8,9,4,5,2,3,12,33};
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        sortArray.selectionSort();
        //sortArray.change(array);
        Arrays.stream(array).forEach(s->System.out.print(" "+s));
    }
    private void mergeSort(){

    }

    private void swap(int[] a, int indexA, int indexB){
        int temp = a[indexA];
        a[indexA] = a[indexB];
        a[indexB] = temp;
    }
    public void bubbleSortCycle(int[] arr){
        if(arr.length == 0) return;
        for (int i =0; i < arr.length; i++){
            for (int j =0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public void selectionSort(){
        for(int i =0; i <array.length; i++){

            for (int k =i; k<array.length; k++){
                if(array[i]> array[k]){
                    this.swap(array, i, k);
                }
            }
        }
    }

    public void quickSort(){

    }

}
