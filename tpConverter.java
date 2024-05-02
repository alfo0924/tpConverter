import java.util.*;




class tpc
{

// double temperatute;
double temp;
// double a;
// double b;


 //華氏轉攝氏的類別方法
double ftoc(double a)
{
 //溫度公式 華氏轉攝氏
 temp=(a-32)*5/9;
 return temp;
    



}
 //攝氏轉華氏的類別方法
double ctof(double b)
{
//溫度公式 攝氏轉華示
temp=((b*9)/5)+32;
return temp;


}

 //呼叫印出類別函氏
void printOut()
{
//印出的class
System.out.println(temp);
System.out.println();


}

}
public class tpConverter
{
  public static void main(String[]args)
  {

   //藉scanner 輸入溫度 華氏/設氏
    Scanner scanner= new Scanner(System.in);


    System.out.println("Type in temperature :");
      //藉scanner 輸入溫度 華氏/設氏
    double type=scanner.nextDouble();
   



 //建立物件t ,並從物件t帶入scanner輸入的值回傳到 華氏轉攝氏的類別方法
    tpc t=new tpc();
   //回傳到 華氏轉攝氏的類別方法
    t.ftoc(type);
   //呼叫印出類別函氏
    t.printOut();




    System.out.println("Type in 2nd temperature :");
      //藉scanner 輸入溫度 華氏/設氏
    double type2=scanner.nextDouble();

      //回傳到 攝氏轉華氏的類別方法
    t.ctof(type2);
     //呼叫印出類別函氏
    t.printOut();

    // 溫度值從class取function 再由void printout輸出









   
    // 題目2  取隨機值 範圍在<50 ,且>0 , 並且最後印出時依小到大排序
    

//宣告變數
int ctoi=0;
   //設定創建一個空的5格一維陣列
int a[]=new int[5];


   //藉for迴圈 產生5次 隨機值
    for(int i=0 ; i<a.length ;i++)
    {
     //產生隨機值
    double c=Math.random();
     //隨機值為了大於0 所以*100
    double cc=c*100;
    // 隨機值*100後再藉Math.round 四捨五入
    double d=Math.round(cc);   
     //把double 小數點型態轉換 int(integer)整數型態
    ctoi=(int)d;


         //把所有(5次)隨機值放入陣列a 裡面
          a[i]=ctoi;
     //印出 陣列a裡面所有內容
    System.out.println(a[i]);
    }


    //測試
    System.out.println("Test");
    System.out.println(a[0]);
    System.out.println(a[1]);


    //藉由Arrays.sort(); 排序 array裡面的值大小
    Arrays.sort(a);

    //藉陣列大小跑條件
    for(int i=0;i<a.length;i++)
    {
        //設定範圍條件
        if(a[i]<=50 && a[i]>=0)
        {
           
               //印出篩選後的值
            System.out.println("The numbers which matched :"+a[i]);
          


        }

    }





  }




    
}
