import java.util.Scanner;
public class Figura {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int row;
        
        while ((row = scan.nextInt()) > 0){
            int column = scan.nextInt();
            int actualRow = scan.nextInt();
            int actualColumn = scan.nextInt();
            int rowChange = scan.nextInt();
            int columnChange = scan.nextInt();
            boolean ERROR = false;
            
            int numberOfSteps = scan.nextInt();
            for (int i = 0; i < numberOfSteps; i++){
                int step = scan.nextInt();
                if (step == 0){
                    actualRow = actualRow + rowChange;
                    actualColumn = actualColumn + columnChange;
                    if (actualRow < 0 || actualRow >= row || actualColumn < 0 || actualColumn >= column) ERROR = true;
                }
                else if (step == -1){
                    if (rowChange == -1 && columnChange == 0){rowChange = 0; columnChange = 1;}
                    else if (rowChange == 0 && columnChange == 1){rowChange = 1; columnChange = 0;}
                    else if (rowChange == 1 && columnChange == 0){rowChange = 0; columnChange = -1;}
                    else if (rowChange == 0 && columnChange == -1){rowChange = -1; columnChange = 0;}
                }
                else if (step == 1){
                    if (rowChange == -1 && columnChange == 0){rowChange = 0; columnChange = -1;}
                    else if (rowChange == 0 && columnChange == -1){rowChange = 1; columnChange = 0;}
                    else if (rowChange == 1 && columnChange == 0){rowChange = 0; columnChange = 1;}
                    else if (rowChange == 0 && columnChange == 1){rowChange = -1; columnChange = 0;}
                }
            }            
            if (ERROR == true) System.out.println("ERR");
            else{
                System.out.println(actualRow + " " + actualColumn + " " + rowChange + " " + columnChange);
            }
        }
    }
}