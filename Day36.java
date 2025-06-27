//Day 36
class Day36{
    public static void main(String[] args){
        int[][] matrix ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] transposed = transpose(matrix);

        System.out.println("Original matrix:");
        printMatrix(matrix);

        System.out.println("Transposed matrix:");
        printMatrix(transposed);
    }
     static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] Final = new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                Final[j][i] = matrix[i][j];
            }
        }
         return Final;
    }
     static void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for (int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
