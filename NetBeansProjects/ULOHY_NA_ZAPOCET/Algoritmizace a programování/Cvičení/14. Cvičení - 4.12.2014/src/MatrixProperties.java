public class MatrixProperties {
    public static boolean isUpTriangle (int[][] matrix){
        /*if (1 == 2){
            throw new IllegalArgumentException("Matice nemaji stejne rozmery....");
        }*/
        
        for (int i = 1; i < matrix.length; i++){
            for (int j = 0; j < i; j++){
                if (matrix [i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSymetric (int [][] matrix){
        for (int i = 1; i < matrix.length; i++){
            for (int j = 0; j < i; j++){
                if (matrix [i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
