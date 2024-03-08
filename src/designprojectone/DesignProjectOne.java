/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * Program: Tech Fair Cost Calculator 
 * Author: Sarah Cui 
 * Date: 08/03/2024 
 * Description: Finding the total cost of the tech fair and the cost required per student 


 */
package designprojectone;
import java.util.*;

/***************************************************
*
*  Program: Tech Fair Cost Calculator 
*  Author: Sarah Cui 
*  Date: 07/03/2023 
*  Description: Using number of students to find total cost of science fair, and cost per student 
****************************************************/

/**************** IPO CHART ************************
*INPUT:
*Number of Students doing arduino projects 
*Number of students doing raspberry PI projects
*Number of students doing VR Projects 
*
*PROCESSING:
*Determine fixed cost of science kit per student, including if discount needed
*Determine cost of arduino projects, including if discount needed
*Determine cost of Raspberry projects, including if discount needed
*Determine cost of VR Projects  projects, including if discount needed
*Determine total cost by adding all previous costs
* Determine cost per student by dividing total cost by number of students 
*
*OUTPUT:
*Display total cost of project 
*Display cost per student 
*
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Ouput
*
*
*
*
*
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS
  final double TOTALSTUDENTDISCOUNT = 0.95;
  final int BASESTUDENTCOST = 50; 
  final int ARDUINOSTUDENT = 10;
  final int ARDUINODISCOUNT = 9;
  final int RASPBERRYSTUDENT = 15;
  final int RASPBERRYDISCOUNT = 12; 
  final int VRSTUDENT = 20;  
  
  //VARIABLES
  int arduinoNumber = 0;
  int raspberryNumber = 0;
  int vrNumber = 0;
  int totalStudentNumber = 0;
  double baseStudentCost = 0;
  double totalCost = 0;
  double costPerStudent = 0;
  double arduinoCost = 0;
  double raspberryCost = 0;
  double vrCost = 0;
 
  //CODE
  
  //intialize scanner 
  Scanner kb = new Scanner (System.in);
  
  //Recieve input for number of student per project 
  System.out.println("How many students are doing the arduino project?");
  arduinoNumber = kb.nextInt(); 
  System.out.println("How many students are doing the raspberry Pi project?");
  raspberryNumber = kb.nextInt(); 
  System.out.println("How many students are doing the VR project?");
  vrNumber = kb.nextInt(); 
  
  
  //CALCULATIONS//
  
  //Calculate number of students, check if number of students is zero 
  totalStudentNumber
  
  //Calculate base cost of project 
  
  
  //Calculate cost from Arduino projects 
  
  
  //Calculate cost from Raspberry PI projects 
  
  
  //Calculate cost from Arduino projects 
  
  
  //Calculate total cost of project, cost per student 
  

  //Output total cost of fair, cost per student 
  
    }
    
}
