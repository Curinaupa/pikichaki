package com.brainacad.methods;
/**Create class Matrix with 2D array (int, size 2x2) field and methods: addition and multiplication of matrices;
 *
 */
public class Lab221 {
    private  final int MAX_LENGTH_RAWS = 7;
    private final int MAX_LENGTH_COLUMNS = 7;
    int [][] matrixResult;
    int [] [] matrixProduct;
    //int [][] matrix = new int[MAX_LENGTH_RAWS][MAX_LENGTH_COLUMNS];
    //int [][] matrix ;
    //Generating Matrix
    public void getMatrix(int [][] matrix){

        for (int i = 0; i < MAX_LENGTH_RAWS ; i++) {
            for (int j = 0; j < MAX_LENGTH_COLUMNS ; j++) {
                int randomNumber = (int)(Math.random()*4+1);
                matrix[i][j] = randomNumber;
            }
        }

    }
    public void viewMatrix(int [][] matrix){
        for (int [] a : matrix ) {
            for (int b: a) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    public int getMAX_LENGTH_RAWS() {
        return MAX_LENGTH_RAWS;
    }

    public int getMAX_LENGTH_COLUMNS() {
        return MAX_LENGTH_COLUMNS;
    }
    public int [][] sumMatrix(int[][] matrixAd1, int[][] matrixAd2){
        matrixResult = new int [MAX_LENGTH_RAWS][MAX_LENGTH_COLUMNS];
        //System.out.println("first");
        //viewMatrix(matrixAd1);
        //System.out.println("Second");
        //viewMatrix(matrixAd2);
        if(matrixAd1.length ==matrixAd2.length) {
            for (int i = 0; i <matrixAd1.length ; i++) {
                if (matrixAd1[i].length==matrixAd2[i].length) {
                    for (int j = 0; j < matrixAd1[i].length; j++) {
                        matrixResult[i][j] = matrixAd1[i][j] + matrixAd2[i][j];

                    }
                } else{
                    System.out.println("Impossible to Sum these Matrix");
                }
            }

        } else{
            System.out.println("Impossible to Sum these Matrix");
        }
        //System.out.println("Resultado");
        //viewMatrix(matrixResult);
        //System.out.println();
        return matrixResult;
    }
    public int [][] matrixMultiplication(int [][] matrixA, int [][] matrixB){
        if (matrixA[0].length==matrixB.length){
            matrixResult = new int[matrixA[0].length][matrixB.length];
        }
        else {
            System.out.println("Can not Multiply Matrices");
        }
        for (int i = 0; i <matrixA.length ; i++) {
            for (int j = 0; j <matrixB[i].length ; j++) {
                for (int k = 0; k < matrixB.length; k++) {
                    matrixResult [i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }

        }
//        System.out.println("Multiplicacion");
//        viewMatrix(matrixResult);
        return matrixResult ;
    }


    public static void main(String[] args) {
        Lab221 lab221 = new Lab221();
        int [][] matrix1 = new int[lab221.getMAX_LENGTH_RAWS()][lab221.getMAX_LENGTH_COLUMNS()];
        int [][] matrix2 = new int[lab221.getMAX_LENGTH_RAWS()][lab221.getMAX_LENGTH_COLUMNS()];
        //Suma
        System.out.println("First Matrix");
        lab221.getMatrix(matrix1);
        lab221.viewMatrix(matrix1);
        System.out.println("second Matrix");
        lab221.getMatrix(matrix2);
        lab221.viewMatrix(matrix2);
        System.out.println("Suma Two Matrix");
        lab221.viewMatrix(lab221.sumMatrix(matrix1, matrix2));
        // Multiplication
        lab221.matrixMultiplication(matrix1,matrix2);
        System.out.println("Multiplicacion");
        lab221.viewMatrix(lab221.matrixMultiplication(matrix1,matrix2));
    }
}
