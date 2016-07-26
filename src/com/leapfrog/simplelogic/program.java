/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.leapfrog.simplelogic;


/**
 *
 * @author ASUS
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String grade=" ";
     String gradedesc=" ";
       double gradepoint=0,sc=10,nep=60,eng=70,cmath=90,optmath=80,total=0,percent=0;
       double fullmark=100,passmark=32,totalfullmark=500;
       
      // string grade="";
       total=sc+nep+eng+cmath+optmath;
       System.out.println("Full marks:"+(int)fullmark+ "\t\t Pass marks:"+(int)passmark);
       System.out.println("Marks Obtained");
       System.out.println("Science \t\t "+sc);
              System.out.println("Nepali \t\t\t "+nep);
              System.out.println("English \t\t "+eng);
              System.out.println("cmath \t\t\t "+cmath);
              System.out.println("optmath \t\t "+optmath);
              System.out.println("------------------------------");
              System.out.println("Total \t\t\t"+total);
       if (sc<passmark || eng<passmark || eng<passmark || cmath<passmark || optmath<passmark )
       {
           System.out.println("Fail");//sout+tab
           //System.out.println("passmark = " + passmark);//soutv    
       }
       else 
       {
           percent=(total/totalfullmark)*100;
           if (percent>90) 
           {
               gradedesc="Outstanding";
               grade="A+";
               gradepoint=4;
                       
           }
           else if (percent<90 && percent>=80) 
            {
              gradedesc="Excellent";
               grade="A";
                gradepoint=3.6;
           }
           else if (percent<80 && percent>=70) 
            {
              gradedesc="Very Good";
               grade="B+";
               gradepoint=3.2;
           } 
             else if (percent<70 && percent>=60) 
            {
              gradedesc="Good";
               grade="B";
               gradepoint=2.8;
           } 
             else if (percent<60 && percent>=50) 
            {
              gradedesc="Above Average";
               grade="C+";
               gradepoint=2.4;
           }   
             else if (percent<50 && percent>=40) 
            {
              gradedesc="Average";
               grade="C";
               gradepoint=2.0;
           }
              else if (percent<40 && percent>=20) 
            {
              gradedesc=" Below Average";
               grade="D";
               gradepoint=1.6;
           }  
            else if (percent<20) 
            {
              gradedesc="Insufficient";
               grade="E";
               gradepoint=0.8;
           } 
           else
            {
                  gradedesc="Nit Graded";
               grade="N";
               gradepoint=0;
            }
              
              System.out.println("Grade:\t\t\t"+grade);
              System.out.println("Grade Description:"+gradedesc);
              System.out.println("Grade Point:\t"+gradepoint);
       }
              
       
       
       
       
    }
    
}
/* whileexp while wid expression 
whilen
whileit
sw switch case
"im" expands to "implements; "ex" to "extends".

*/
