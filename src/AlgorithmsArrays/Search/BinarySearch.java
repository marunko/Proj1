package AlgorithmsArrays.Search;

public class BinarySearch {
    static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {

    }
    public static void binarySearch(int [] array, int number){

        int right = array.length-1, left=0, middle;

        while (right >= left){

            middle = (right+left)/2;
            if(number > array[middle]){
                left = middle+1;
            }
            else if(number < array[middle]){
                right = middle-1;
            }
            else{
                System.out.printf("The number found on index: " + middle + " number: "+array[middle]);
                return;
            }
        }
        System.out.print("Num has not been found");
    }

    public static void binarySearch2(int[] array, int data, int index){
       // reset array left - right
        //

    }

}
