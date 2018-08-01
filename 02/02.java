//二维数组
class s02{
  public static void main(String[] args){
    //定义二维数组
    int[][] arr = {{22,66,44},{77,33,88},{25,45,65,32},{11,66,99}};

    System.out.println(arr.length);
    //遍历输出二维数组
    for(int i = 0;i < arr.length;i++){
      System.out.println("i = " + i + ",length = " + arr[i].length);
      for(int j = 0;j < arr[i].length;j++){
        System.out.println("arr[" + i + "," + j + "] = " + arr[i][j]);
      }
    }

  }
}
