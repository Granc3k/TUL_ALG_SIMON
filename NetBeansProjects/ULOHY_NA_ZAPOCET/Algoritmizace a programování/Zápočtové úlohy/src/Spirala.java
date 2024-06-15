import java.util.Scanner;
public class Spirala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lengthOfMatrix;
        
        while ((lengthOfMatrix = scan.nextInt()) > 0){
            int[][] matrix = new int [lengthOfMatrix][scan.nextInt()];
            
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = scan.nextInt();
                }
            }
            
            System.out.println(isMatrixSpiral(matrix)); 
        }
    }
    public static int isMatrixSpiral(int[][] matrix){
        int count = 0;
        int columnA = 0;
        int columnB = matrix[0].length-1;
        int rowA = 0;
        int rowB = matrix.length-1;
        while(count < (matrix.length*matrix[0].length)){
            //Right
            for(int j = columnA; j < columnB; j++){
                if(matrix[rowA][j] > matrix[rowA][j+1]) return 0;
                count++;
            }
            count++;
            if (count >= (matrix.length*matrix[0].length)) return 1;
            //Down
            for(int i = rowA+1; i < rowB; i++){
                if(matrix[i][columnB] > matrix[i+1][columnB]) return 0;
                count++;
            }
            count++;
            if (count >= (matrix.length*matrix[0].length)) return 1;
            //Left
            for(int j = columnB-1; j > columnA; j--){
                if(matrix[rowB][j] > matrix[rowB][j-1]) return 0;
                count++;
                
            }
            count++;
            if (count >= (matrix.length*matrix[0].length)) return 1;
            //Up
            for(int i = rowB-1; i > rowA+1; i--){
                if(matrix[i][columnA] > matrix[i-1][columnA]) return 0;
                count++;
            }
            count++;
            if (count >= (matrix.length*matrix[0].length)) return 1;
            
            columnA++;
            columnB--;
            rowA++;
            rowB--;
        }
        return 1;
    }    
}