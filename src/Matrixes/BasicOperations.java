package Matrixes;

import java.util.Arrays;

class Matrix{
    int[][] matrixA = new int[][]{
            {1,4,7,9},
            {3,6,8,2},
            {0,5,6,7}
    };
    int[][] matrixB = new int[][]{
            {1,4,7,9, 1},
            {3,6,4,2,1},
            {0,5,6,7,1},
            {0,5,6,7,1}
    };
    int[][] Transponate = new int[][]{
            {1,4},
            {3,6},
            {0,5},
            {0,5}
    };
    int[][] Transponate2 = new int[][]{
            {1,4, 2,3},
            {1,4, 2,3}
    };

}

public class BasicOperations {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        //int n[][] = matrixMultiplying(matrix.matrixA, matrix.matrixB);
        int n[][] = matrixTransponation(matrix.Transponate);
        int n2[][] = addMatrix(matrix.matrixA, matrix.matrixA);
        for(int i[] : n){
            System.out.println(Arrays.toString(i));
        }
        System.out.println( );
        for(int i[] : n2){
            System.out.println(Arrays.toString(i));
        }
    }
// In result, we obtain MatrixC[rowsA][columnsB] multiply row at each column
    public static int[][] matrixMultiplying(int a[][], int b[][]){
        if(a[0].length!= b.length) return null; // check whether it is eligible for multiplication

        int [][] newMatrix = new int[a.length][b[0].length];
        int data =0;
        for(int ra = 0; ra < a.length; ra++){
            for(int i =0; i < b[0].length; i++){

                for (int k =0; k < a[0].length; k++){ // or k < b.length
                    data += a[ra][k] * b[k][i];

                }
                newMatrix[ra][i] = data;
            }
        }
        return newMatrix;
    }

    // transponation
    public static  int[][] matrixTransponation(int matrix[][]){
        if(matrix[0]==null) return null;

        int [][] trans = new int[matrix[0].length][matrix.length];

        for (int i =0; i < trans.length;i++){
            for (int j = 0; j < trans[i].length; j++){
                trans[i][j] = matrix[j][i];
            }
        }

        return trans;
    }
    // Add matrix
    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB){
        if (matrixA.length != matrixB.length ||matrixA[0].length != matrixB[0].length ) return null;
        int [][] result = new int[matrixA.length][matrixA[0].length];
        for (int i =0; i <matrixA.length; i++){

            for (int k =0; k < matrixA[0].length; k++){
                result[i][k] = matrixA[i][k] + matrixB[i][k];

            }
        }
        return result;
    }
    // Determinant
    public static int determinant(int matrix[][]){

        return 1;
    }
    // Transformation


}
