import java.util.Scanner;  
/**
 * 题目：企业发放的奖金根据利润提成。
 * 利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，
 * 高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
 * 程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
 */
public class Salary{

   public static void main(String args[]){
	   Scanner scan = new Scanner(System.in);
	   // 从键盘接收数据  
       int i = 0 ;
       int index = 0;
       double salary = 0;
       double x = 0;
       //double []array = {0, 10000, 7500, 10000, 6000, 6000};
       double []array = {0, 100000, 200000, 400000, 600000, 100000};
       double []rate = {0.1, 0.075, 0.05, 0.03, 0.015, 0.01};
       System.out.print("输入整数：");  
       if(scan.hasNextInt()){                 
    	   // 判断输入的是否是整数  
           i = scan.nextInt() ;                
           // 接收整数  
           System.out.println("整数数据：" + i) ;  
       }else{                                 
    	   // 输入错误的信息  
           System.out.println("输入的不是整数！") ;  
       }  
       
       x = i;
       
       if(x<=100000){
    	   index = 0;
    	   //salary = x * 10/100;
       }
       else if(x<=200000){
    	   index = 1;
       }
       else if(x<=400000){
    	   index = 2;
       }
       else if(x<=600000){
    	   index = 3;
       }
       else if(x<=1000000){
    	   index = 4;
       }
       else{
    	   index = 5;
       }
       
       for(int k=0; k<=index; k++)
       {
    	   if (k>1)
    		   salary += array[k]*rate[k-1]; 
       }
       salary += (x-array[index])*rate[index];
       System.out.println("salary is:"+salary+" index is:"+index);
    	   
       
   }
}