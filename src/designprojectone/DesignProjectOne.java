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
*Number of Students doing Arduino projects 
*Number of students doing raspberry PI projects
*Number of students doing VR Projects 
*
*PROCESSING:
*Determine fixed cost of science kit per student, including if discount needed
*Determine cost of Arduino projects, including if discount needed
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
*Test      Input      Desired Output
*1.        3 3 3      585, 65 
*2.        15 20 10   2900, 64.44 
*3.        16 21 10   2946, 62.68
*4.        0 0 0      Returns nothing
*5.       -1 4 5      Returns nothing 
*6.       40 40 40    7340, 61.17 
*7.  10000 10000 10000  1835000, 61.17
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
  int arduinoCost = 0;
  int raspberryCost = 0;
  int vrCost = 0;
 
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
  totalStudentNumber = arduinoNumber + raspberryNumber + vrNumber; 
  if (totalStudentNumber <= 0 || arduinoNumber <0 || raspberryNumber <0 || vrNumber<0) {
        return; 
    }
  else {
    //Calculate base cost of project 
    baseStudentCost = totalStudentNumber*BASESTUDENTCOST;
    if (totalStudentNumber > 100) {
        baseStudentCost*=TOTALSTUDENTDISCOUNT;
    }

    //Calculate cost from Arduino projects 
    if (arduinoNumber > 15) {
        arduinoCost = arduinoNumber*ARDUINODISCOUNT;
    }
    else {
        arduinoCost = arduinoNumber*ARDUINOSTUDENT; 
    }

    //Calculate cost from Raspberry PI projects 
    if (raspberryNumber > 20) {
        raspberryCost = raspberryNumber*RASPBERRYDISCOUNT;
    }
    else {
        raspberryCost = raspberryNumber*RASPBERRYSTUDENT; 
    }

    //Calculate cost from VR projects 
    vrCost = vrNumber*VRSTUDENT; 

    //Calculate total cost of project, cost per student 
    totalCost = Math.round((baseStudentCost+arduinoCost+raspberryCost+vrCost)*100)/100.0;
    costPerStudent = Math.round((totalCost/totalStudentNumber)*100)/100.0; 

    //Output total cost of fair, cost per student 
    System.out.println("The total cost of the fair is $"+totalCost);
    System.out.println("The cost per student is $"+costPerStudent);
  }
 }
}
