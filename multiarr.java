import java.util.Scanner;

public class multiarr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=input.nextInt();
            }
        }
           for (int k = 0; k <arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                
               System.out.print(arr[k][l] + " ");
              
                
            } 
            System.out.println();
        }
        

        }
    }

