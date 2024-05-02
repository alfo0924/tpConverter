import java.util.*;




class tpc
{

// double temperatute;
double temp;
// double a;
// double b;

double ftoc(double a)
{
 temp=(a-32)*5/9;
 return temp;
    



}
double ctof(double b)
{

temp=((b*9)/5)+32;
return temp;


}

void printOut()
{


System.out.println(temp);
System.out.println();


}

}
public class tpConverter
{
  public static void main(String[]args)
  {
    Scanner scanner= new Scanner(System.in);


    System.out.println("Type in temperature :");
    double type=scanner.nextDouble();
   



    tpc t=new tpc();
    t.ftoc(type);
    t.printOut();




    System.out.println("Type in 2nd temperature :");
    double type2=scanner.nextDouble();
    t.ctof(type2);
    t.printOut();

    // 溫度值從class取function 再由void printout輸出







    //隨機值<50 ,且>0 , 並且最後印出時排序
    


int ctoi=0;
int a[]=new int[5];


    for(int i=0 ; i<a.length ;i++)
    {
    double c=Math.random();
    double cc=c*100;
    double d=Math.round(cc);   
    ctoi=(int)d;

          a[i]=ctoi;
    System.out.println(a[i]);
    }


    //測試
    System.out.println("Test");
    System.out.println(a[0]);
    System.out.println(a[1]);


    //藉由Arrays.sort(); 排序 array裡面的值大小
    Arrays.sort(a);


    for(int i=0;i<a.length;i++)
    {
        //設定條件
        if(a[i]<=50 && a[i]>=0)
        {
           
               
            System.out.println("The numbers which matched :"+a[i]);
          


        }

    }





  }




    
}
