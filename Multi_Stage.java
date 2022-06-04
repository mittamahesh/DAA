import java.io.*;
import java.util.*;

class Multi {
    public static void main(String args[]) throws IOException {
        BufferedReader o = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the graph: ");
        int n=sc.nextInt();
        		int [][] x=new int[n][n];
        System.out.println(" enter cost adjacency matrix for graph : ");
        		 for(int i=0;i<n;i++) {
                     for(int j=0;j<n;j++) {
                             x[i][j] = sc.nextInt();
                     }

             }
        int i, j, c, a;
        int s[] = new int[20];
        int p[] = new int[20];
        int temp[] = new int[20];
        for (i = 0; i < 10; i++) {
            s[i] = 0;
            temp[i] = 0;
            p[i] = 0;
        }
        System.out.println("\n\nProgram for MultiStage Graph\n\n");
        System.out.println("Select Any one Method\n");
        System.out.println("1. Forward Method\n");
        System.out.println("2. Backward Method\n\t");
        a = Integer.parseInt(o.readLine());
        switch (a) {
            case 1:
            	System.out.println("Forward Graph");
                for (i = 11; i >= 0; i--) {
                    c = 0;
                    for (j = 0; j <= 11; j++) {
                        if (x[i][j] != 0) {
                            if (c == 0) {
                                s[i] = s[j] + x[i][j];
                                p[i] = j;
                                c = 1;
                            } else {
                                temp[i] = s[j] + x[i][j];
                                if (temp[i] < s[i]) {
                                    s[i] = s[j] + x[i][j];
                                    p[i] = j;
                                }
                            }
                        }
                    }
                }
                System.out.println("\nSource  Cost  Parent");
                for (i = 11; i >= 0; i--) {
                    System.out.print("\n  " + i);
                    System.out.print(" \t   " + s[i]);
                    System.out.print(" \t   " + p[i]);
                }
                System.out.println("\n\n");
                System.out.println("\n\nOptimal Path:\n\t");
                i = p[0];
                System.out.print("1-->" + (i+1));
                while (i != 11) {
                    i = p[i];
                    System.out.print("-->" + (i+1));
                }
                break;
            case 2:
            	System.out.println("Backward Graph");
                for (j = 0; j <= 11; j++) {
                    c = 0;
                    for (i = 0; i <= 11; i++) {
                        if (x[i][j] != 0) {
                            if (c == 0) {
                                s[j] = s[i] + x[i][j];
                                p[j] = i;
                                c = 1;
                            } else {
                                temp[j] = s[i] + x[i][j];
                                if (temp[j] < s[j]) {
                                    s[j] = s[i] + x[i][j];
                                    p[j] = i;
                                }
                            }
                        }
                    }
                }
                System.out.println("\nSource  Cost   Parent");
                for (i = 0; i <= 11; i++) {
                    System.out.print("\n  " + i);
                    System.out.print(" \t   " + s[i]);
                    System.out.print(" \t   " + p[i]);
                }
                System.out.println("\n\n");
                System.out.println("\n\nOptimal Path:\n\t");
                i = p[11];
                System.out.print("12-->" + (i+1));
                while (i != 0) {
                    i = p[i];
                    System.out.print("-->" + (i+1));
                }
                break;
        }
    }
}