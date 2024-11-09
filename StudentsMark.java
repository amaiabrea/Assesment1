
/**
 * Write a description of class StudentsMark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class StudentsMark
{
    public static void main(String [] args){
        int numberOfStudents=5;
        
        float[] marks= new float[numberOfStudents];
        
        Scanner scanner= new Scanner(System.in);
        
        //Input assignment name
        System.out.println("Enter the assignment name:");
        String assignmentName=scanner.nextLine();
        
        System.out.println("Enter marks for " +numberOfStudents+ "students (0-30):");
        
        //System.out.println("Give marks for 5 students");
        //Getting valid marks for each students
        for(int i=0; i<numberOfStudents; i++){ //to get input for user
            while(true){
            
            float temp= scanner.nextFloat(); //guardo las notas que yo doy de input en mi lista marks[]
            if(temp >=0 && temp <=30){
                
                marks[i]=temp;
                break;
            }else{
            System.out.println("Invalid mark, please enter again");
            }
            
            //for array para arreglar el 0
            marks[i]=temp;
        
            }
        }
        System.out.println("Entered marks");
        for(int i=0; i<numberOfStudents; i++){ //to get print data
            
            System.out.println(marks[i]);           
        
        }
        
        float total=0;
        
        for(int i=0; i<numberOfStudents; i++){
            total= total+ marks[i];
               
        
         }
        float mean=0;
        mean=total/numberOfStudents;
        System.out.println("This is the mean mark:");
        System.out.print(mean);
    
        float sumdiff=0;
        for(int i=0; i<numberOfStudents; i++){
            sumdiff=sumdiff+(marks[i]-mean)* (marks[i]-mean);
            
            sumdiff=sumdiff/numberOfStudents;
        
         }
         
        System.out.println(Math.abs(-1));
         
         
    }
}

