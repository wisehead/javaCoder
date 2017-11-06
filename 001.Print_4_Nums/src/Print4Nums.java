import java.io.*;
/**
 * 题目：有四个数字：1、2、3、4，能组成多少个互不相同且无重复数字的三位数？各是多少？
 * 程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
 * 程序源代码：
 */
public class Print4Nums{

   public static void main(String args[]){
      /* 使用构造器创建两个对象 */
	   for (int i=1; i<5; i++)
	   {
		   for(int j=1; j<5; j++)
		   {
			   for(int k=1; k<5; k++)
			   {
				   //System.out.println("haha:"+i+" "+j+" "+" "+k);
				   if(i != j && j != k && i != k)
				   {
					   System.out.println(i+" "+j+" "+" "+k);
				   }
				   /*
				   else
				   {
					   System.out.println("haha:"+i+" "+j+" "+" "+k);
				   } 
				   */
			   }
		   }
	   }
   }
}