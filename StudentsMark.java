
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
        int numberOfStudents=30;
        
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
            
            float temp= scanner.nextFloat(); //saving the marks i input in my list marks[]
            if(temp >=0 && temp <=30){
                
                marks[i]=temp;
                break;
            }else{
            System.out.println("Invalid mark, please enter again");
            }
            
        
            }
        }
        /*System.out.println("Entered marks");
        for(int i=0; i<numberOfStudents; i++){ //to get print data
            
            System.out.println(marks[i]);           
        
        }*/
        //Display assignment name and marks
        
        System.out.println("Assignment: " +assignmentName);
        System.out.println("Entered marks:");
        for(float mark : marks){
        
            System.out.println(mark);        
        }
        //Calculate and display highest and lowest mark
        
        float highest=marks[0];
        float lowest =marks[0];
        
        for (float mark:marks){
            if(mark>highest)highest=mark;
             if(mark>lowest)lowest=mark;
        }
        
        System.out.println("Highest mark:" +highest);
        System.out.println("Lowest mark:" +lowest);
        
        
        //Calculate mean
        
        float total=0;
    
        for(float mark: marks){
            total= total+ mark;
                       
         }
        float mean=total/numberOfStudents;
        System.out.println("This is the mean mark:" +mean);
    
        //Calculate standard deviation
        
        float sumDiff=0;
        for(float mark:marks){
            sumDiff=sumDiff+(mark-mean)* (mark-mean);
        }
        float standardDeviation= (float) Math.sqrt(sumDiff/ numberOfStudents);
        System.out.println("Standard deviation:" +standardDeviation);
        scanner.close();
        
        
        
        
        
         }
         
     
        
         
    }
 
