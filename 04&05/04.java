//数组定义及初始化
class s04{
  public static void main(String[] args){
    //定义
    int[] arr1;        //格式1 推荐使用
    int arr2[];        //格式2 不推荐
    //arr2 只定义不使用是可以不必初始化的；否则，必须初始化

    //初始化
    // 1.动态初始化
    arr1 = new int[4];
    int[] arr3 = new int[5];

    System.out.println(arr1[2]);  // 0
    System.out.println(arr3[3]);  // 0

    // 2.静态初始化
    int[] arr4 = new int[]{3,5,7,8,13,4};
    int[] arr5 = {4,5,6,7,8};

    //一维数组遍历
    for(int i = 0;i < arr5.length;i++){
      System.out.println("arr" + i + " = " + arr5[i]);
    }
  }
}
