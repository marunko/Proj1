package AlgorithmsArrays.Sorting;

public class SortArray {
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        sortArray.mergeSort();
    }
    private void mergeSort(){

    }

    public void bubbleSortCycle(int[] arr, int[] result){
        if(arr.length == 0) return;

    }

    public void selectionSort(){

    }

    public void quickSort(){

    }

}
class Ex extends Exception{

    public static void main(String ...n){

        try {
            m();
        }
        catch (Ex e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
    static void m() throws Exception{
        throw new Ex("Some exception");
    }

    Ex(String m){
        super(m);
    }


}