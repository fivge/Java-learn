//数组默认值
class s07{
  public static void main(String[] args){
    int[] arrInt = new int[5];
    String[] arrString = new String[7];
    outPut(arrInt);
    outPut(arrString);
    arrString[2] = "a";
    System.out.println(arrString[1]);
    outPut(arrString);
  }

  public static void outPut(int[] arr){
    System.out.println("Int array:");
    for(int i = 0;i < arr.length;i++){
      System.out.println(arr[i]);
    }
  }

  public static void outPut(String[] arr){
    System.out.println("String array:");
    for(int i = 0;i < arr.length;i++){
      System.out.println(arr[i]);
    }
  }



}
