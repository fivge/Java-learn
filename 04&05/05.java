//Java内存分配
//数组赋值
class s05{
  public static void main(String[] args){
    int[] arr1 = new int[3];
    arr1[0] = 5;
    arr1[1] = 7;
    arr1[2] = 1;

    System.out.println("arr1");
    System.out.println(arr1);
    outPutArray(arr1);

    int[] arr2 = arr1;

    System.out.println("arr2");
    System.out.println(arr2);
    outPutArray(arr2);

    System.out.println("----------------------");

    arr2[0] = 3;
    arr2[1] = 3;
    arr2[2] = 4;

    System.out.println("arr2");
    System.out.println(arr2);
    outPutArray(arr2);

    System.out.println("arr1");
    System.out.println(arr1);
    outPutArray(arr1);
  }
  public static void outPutArray(int[] arr){
    int l = arr.length;
    System.out.println(arr);
    for(int i = 0;i < l;i++){
      System.out.println("Arr[" + i + "] = " + arr[i]);
    }
  }
}

/*
arr1
[I@9e89d68
[I@9e89d68
Arr[0] = 5
Arr[1] = 7
Arr[2] = 1
arr2
[I@9e89d68
[I@9e89d68
Arr[0] = 5
Arr[1] = 7
Arr[2] = 1
----------------------
arr2
[I@9e89d68
[I@9e89d68
Arr[0] = 3
Arr[1] = 3
Arr[2] = 4
arr1
[I@9e89d68
[I@9e89d68
Arr[0] = 3
Arr[1] = 3
Arr[2] = 4
*/
