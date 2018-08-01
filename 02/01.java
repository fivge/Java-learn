import java.util.Scanner;
//一维数组
class s01{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // int arr[] = {2,4,6,4,1};      //方法一
    // int[] arr= {2,4,6,4,1};       //方法二
    int arr[];                       //方法三
    // int[] arr; //等同
    arr = new int[3];
    arr[0] = 9;

    //可循环赋值，从终端读数到数组中

    for(int i = 0;i < arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
