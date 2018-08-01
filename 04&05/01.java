//通过方法，输出两个数中的较大者
class s01{
  public static void main(String[] args){
    int a,b;
    a = 5;
    b = 8;
    int max = Max(a,b);
    System.out.println(max);
  }
  public static int Max(int x,int y){
    if(x > y){
	    return x;
    }
    else{
	    return y;
    }
  }
}
