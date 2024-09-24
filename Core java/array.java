public class array {
    public static void main(String[] args) {
        // int nums[]= new int[4];
        // nums[0]=4;
        // nums[1]= 10;
        // nums[2]=7;
        // nums[3]=9;
        
        // for(int i= 0; i<=3; i++){
        //     System.out.println(nums[i]);
        // }

        // int num1[][]= new int[3][4];

        // for(int i=0; i<3; i++){
        //     for(int j=0; j<4; j++){
        //         num1[i][j]= (int)(Math.random()*10);
        //     }
        //     // System.out.println();
        // }

        // for(int i=0; i<3; i++){
        //     for(int j=0; j<4; j++){
        //         System.out.print(num1[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        
        // for (int n[]: num1)
        // {
        //     for(int m: n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // int num1[][]= new int[3][]; //Jagged Array

        // num1[0]= new int[3];
        // num1[1]= new int[4];
        // num1[2]= new int[2];

        // for(int i=0; i<num1.length; i++){
        //         for(int j=0; j<num1[i].length; j++){
        //             num1[i][j]= (int)(Math.random()*10);
        //         }
        //         // System.out.println();
        //     }

        // for (int n[]: num1)
        //     {
        //         for(int m: n)
        //         {
        //             System.out.print(m + " ");
        //         }
        //         System.out.println();
        //     }

        int num1[][][]= new int[3][4][5]; // 3-D Array

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                for(int q=0; q<5; q++){
                num1[i][j][q]= (int)(Math.random()*10);
                }
            }
            // System.out.println();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                for(int q=0; q<5; q++){
                System.out.print(num1[i][j][q]+ " ");
                }
            }
            System.out.println();
        }
    

    }
}
