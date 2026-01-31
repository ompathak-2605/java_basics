
public class jaggedarray {
    public static void main(String[] args)
        {
        int num[][]=new int[4][];
        num[0] = new int[4];
        num[1] = new int[3];
        num[2] = new int[4];
        num[3] = new int[6];
        for (int i = 0; i <num.length; i++)
         {
            for (int j = 0; j <num[i].length; j++) 
            {
                num[i][j]=(int)(Math.random()*100);
                System.out.print(num[i][j] + " ");
            }
            System.err.println();
                

        }
                System.err.println();
                        System.err.println();
        System.err.println();
        System.err.println();
            int arr[][][]=new int[3][4][5];
            for (int k = 0; k < arr.length; k++) {
                for (int l = 0; l < arr[k].length; l++) {
                    for (int m = 0; m < arr[k][l].length; m++) {
                        arr[k][l][m]=(int)(Math.random()*100);
                        System.out.print(arr[k][l][m] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                System.out.println("");
            }
            

    }
}
