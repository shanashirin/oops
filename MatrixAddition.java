import java.util.Scanner;
public class MatrixAddition{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the number of rows:");
int rows=scanner.nextInt();
System.out.print("Enter the number of columns:");
int cols=scanner.nextInt();
int[][] matrix1=new int[rows][cols];
int[][] matrix2=new int[rows][cols];
int[][] result=new int[rows][cols];
System.out.print("Enter elements of first matrix:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix1[i][j]=scanner.nextInt();
}
}
System.out.println("Enter elements of second matrix:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
matrix2[i][j]=scanner.nextInt();
}
}
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
result[i][j]=matrix1[i][j]+matrix2[i][j];
}
}
System.out.println("Resultant matrix:");
for(int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.out.print(result[i][j]+" ");
}
System.out.println();
}
scanner.close();
}
}
 
