import java.util.Scanner;
public class Knapsack {
     public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 int n,m;
    	 System.out.println("Enter number of objects :");
    	 n=sc.nextInt();
    	 int w[]=new int[n];
    	 int p[]=new int[n];
    	 System.out.println("Enter the profits :");
    	 for(int i=0;i<n;i++)
    	 p[i]=sc.nextInt();
    	 System.out.println("Enter the weights :");
    	 for(int i=0;i<n;i++)
    		 w[i]=sc.nextInt();
    	 System.out.println("Enter the knapsack capacity :");
    	 m=sc.nextInt();
    	 double[] p_w=new double[n];
    	 for(int i=0;i<n;i++)
    	 {
    		 p_w[i]=(double)p[i]/(double)w[i];
    	 }
    	 System.out.print("\nObjects :");
    	 for(int i=1;i<=n;i++)
    		 System.out.print(i+" ");
    	 System.out.print("\nProfits :");
    	 for(int i=0;i<n;i++)
    		 System.out.print(p[i]+" ");
    	 System.out.print("\nWeights :");
    	 for(int i=0;i<n;i++)
    		 System.out.print(w[i]+" ");
    	 System.out.print("\nProfits/Weights :");
    	 for(int i=0;i<n;i++)
    		 System.out.printf("%.2f ",p_w[i]);
    	 for(int i=0;i<n-1;i++)
    	 {
    		 for(int j=i+1;j<n;j++)
    		 {
    			 if(p_w[i]<=p_w[j])
    			 {
    				 double temp=p_w[j];
    				 p_w[j]=p_w[i];
    				 p_w[i]=temp;
    				 int temp1 = p[j];
    				 p[j]=p[i];
    				 p[i]=temp1;
    				 int temp2 = w[j];
    				 w[j]=w[i];
    				 w[i]=temp2;
    			 }
    		 }
    	 }
    	 System.out.println("\nAfter sorting according to profits/weights :");
    	 System.out.print("Objects :");
    	 for(int i=1;i<=n;i++)
    	 {
    		 System.out.print(i+" ");
    	 }
    	 System.out.print("\nProfits :");
    	 for(int i=0;i<n;i++)
    		 System.out.print(p[i]+" ");
    	 System.out.print("\nWeights :");
    	 for(int i=0;i<n;i++)
    		 System.out.print(w[i]+" ");
    	 System.out.print("\nProfits/Weights :");
    	 for(int i=0;i<n;i++)
    		 System.out.printf("%.2f ",p_w[i]);
    	 int k=0;
    	 double sum=0;
    	 System.out.println();
    	 while(m>0)
    	 {
    		 if(w[k]<m)
    		 {
    			 sum+=p[k];
    			 m=m-w[k];
    		 }
    		 else
    		 {
    			 sum=sum+(float)m/w[k]*p[k];
    			 m=0;
    		 }
    		 k++;
    	 }
    	 System.out.println("Final Profit is :"+sum);
     }
     
}