//数组操作的常见问题
class s06{
  public static void main(String[] args){
    int[] arr = {1,2,3};

    // 1.数组索引越界
    System.out.println(arr[3]);
    //可以编译，运行报错
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3

    // 2.空指针异常
    arr = null;
    System.out.println(arr[2]);
    //可以编译，运行报错
    //Exception in thread "main" java.lang.NullPointerException
  }
}
