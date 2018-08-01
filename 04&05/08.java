//二维数组
class s08{
  public static void main(String[] args){

    //定义格式1
    int[][] arr1 = new int[3][4];

    int[] arr2[] = new int[3][4];

    int arr3[][] = new int[3][4];

    //定义格式2
    int[][] arr4 = new int[3][];

    arr4[0] = new int[4];
    arr4[1] = new int[3];

    //定义格式3
    int[][] arr5 = {{1,2,3,4},{1,2,3},{4,5,6},{6,7,8,9}};

    //二维数组遍历
    for(int i = 0;i < arr5.length;i++){
      for(int j = 0;j < arr5[i].length;j++){
        System.out.println("arr[" + i + "][" + j +"] = " + arr5[i][j]);
      }
    }

  }
}
