//方法调用
class s03{
  public static void main(String[] args){
    int a,b;
    a = 5;b = 6;

    //单独调用  ok
    printX(a,b);

    //赋值调用  错误
    //void v = printX(a,b);
    //System.out.println(v);

    //输出调用  错误
    //System.out.println(printX(a,b));
  }
  public static void printX(int x,int y){
    for(int i = 0;i < x;i++){
	    for(int j = 0;j < y;j++){
		    System.out.print("*");
	    }
	    System.out.println();
    }
  }
}
