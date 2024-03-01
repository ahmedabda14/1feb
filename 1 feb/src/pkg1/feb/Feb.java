/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.feb;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ahmed
 */
public class Feb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
int n = 3;
int f =1;
for(int i =1;i<=n;i++){
    f=f*i;
}
System.out.println(f); //3*2*1

int num = 24613579;
int even=0;
int odd=0;
while(num>0){
   int digit = num%10;
   if(digit%2==0){
       even++;
   }
   else{
       odd++;
   }
       num=num/10;
    }

Random rand = new Random();
int rand1 = rand.nextInt(1000);
System.out.println(rand1);
Scanner keyboard = new Scanner(System.in);
int p= keyboard.nextInt();
if(p==rand1)
    System.out.println("true");
else
    System.out.println("false");

int [] a = {10,20,3,4};
int max = a[0];
for(int i =0;i<a.length;i++){
    for(int j=i+1;j<a.length;j++){
        if (a[i]>a[j]){
        max = a[i];
        a[i]=a[j];
        max=a[j];
        
   }
    }
   
}
System.out.println(a[a.length-1]);

       for (int i=1; i<=5;i++){
    for(int n=1;n<=i;n++){
  System.out.print(" X ");
    }//end of second loop
    System.out.println();
}//end of first for loop
       
       for(int l=1;l<=5;l++){
           for(int k=5;k>=l;k--){
               System.out.print(" X ");
           }
           System.out.println();
       }
       */
       int mat1[][]={{1,2,4},{4,6,7},{4,6,7}};
      int mat2[][]={{1,2,1},{3,7,8},{6,7,9}};
      int resultmat[][]={};
      System.out.println(mat1.length);
for(int o=0;o<mat1.length;o++){
    for(int m=0;m<mat1.length;m++){
   //System.out.print(mat1[o][m]+" ");
     int v= mat1[m][o]+mat2[m][o];   
System.out.print(v+" ");
    }
    System.out.println();
}

    }
    
    }
    

