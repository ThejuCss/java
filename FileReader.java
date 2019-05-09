import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
class FileReader
{ 
static double maxValues = 0;
 static double minValues =1.0;
  static double sum=0;
   static double n=63;
 static void calMinMax(String[] line) {
    for (int i = 0; i < line.length; i++) {  
            double currentValue = Double.parseDouble(line[1]);
            if(currentValue > maxValues ) {
                maxValues = currentValue;
            }
            if(currentValue < minValues) {
                minValues= currentValue;
            }       
       for(int j = 0; j< line.length ; j++)
        {
            sum = sum + Double.parseDouble(line[j]);
        }
        System.out.println("Sum:"+sum);
        double average = (double)sum / n;
    }
System.out.println(minValues);
System.out.println(maxValues);
}
  public static void main(String[] args)th
rows FileNotFoundException, IOException,NumberFormatException
  {
      BufferedReader br = null;
      String line = ","; 
       String cvsSplitBy = ",";

      try
      {
        br = new BufferedReader(new java.io.FileReader("C:/Users/css119008/Downloads/LoadRun_2 Hps.csv"));
       while((line = br.readLine()) != null)
       {
            String[] col= line.split(cvsSplitBy);
             calMinMax(col);
       }
     }   
     catch (FileNotFoundException e)
     {
        e.printStackTrace();
     } 
     catch (IOException e)
     {
        e.printStackTrace();
     } 
     catch(NumberFormatException e)
     {
           e.printStackTrace();
      }
     finally 
     {
        if (br != null) 
        {
            try 
            {
                br.close();
            }
            catch (IOException e)
             {
                e.printStackTrace();
            }
            catch(NumberFormatException e)
            {
           e.printStackTrace();
           }
        }
    }

 }
}