import java.util.Scanner;
class Matrix {
  Matrix(int Row,int Col){
    int[][] matrix = new int[Row][Col];
   }s
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Matrix Rows");
         
        int Row = scan.nextInt();
         
        System.out.println("Enter The Number Of Matrix Columns");
         
        int Col = scan.nextInt();
         
        int[][] matrix = new int[Row][Col];
        
        enterMatrixData(matrix, Row, Col);
        
        printMatrix(matrix,Row,Col);
  }
  public static void enterMatrixData(int[][] matrix, int Row, int Col){
      Scanner scan = new Scanner(System.in);
     System.out.println("Enter Matrix Data");
          
          for (int i = 0; i <Row; i++)
          {
              for (int j = 0; j < Col; j++)
              {
                  matrix[i][j] = scan.nextInt();
              }
          }
  }
  
  public static void printMatrix(int[][] matrix, int Row, int Col){
    System.out.println("Your Matrix is : ");
        
        for (int i = 0; i < Row; i++)
        {
            for (int j = 0; j < Col; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
  }
}