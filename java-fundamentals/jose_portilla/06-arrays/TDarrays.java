import java.util.Arrays;

public class TDarrays {

    public static void main(String[] args) {
        
        int[][] grades = new int[3][4];
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;
        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;
        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]));

        int[][]grades2 = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        System.out.println(Arrays.toString(grades2[0]));
        System.out.println(Arrays.toString(grades2[1]));
        System.out.println(Arrays.toString(grades2[2]));

        for (int j = 0; j < grades2[0].length; j++) {
            System.out.print(grades2[0][j] + " ");  // [0][0] [0][1] [0][2]
        }
        System.out.println("\n");

        for (int j = 0; j < grades2[1].length; j++) {
            System.out.print(grades2[1][j] + " ");  // [0][0] [0][1] [0][2]
        }
        System.out.println("\n");

        for (int j = 0; j < grades2[2].length; j++) {
            System.out.print(grades2[2][j] + " ");  // [0][0] [0][1] [0][2]
        }
        System.out.println("\n");

        int[][]grades3 = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        // nested loop
        for (int i = 0; i < grades3.length; i++) {
            switch(i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
            }

            for (int j = 0; j < grades3[i].length; j++) {
                System.out.print(grades3[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    
}
