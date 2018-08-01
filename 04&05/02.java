//方法重载 多个数求和
class s02{
  public static void main(String[] args){
    int a,b,c;
    float d,e;
    a = 3;b = 4;c = 5;
    d = 0.7F;e = 1.3F;
    //调用Sum方法
    int s = 0;
    s = Sum(a,b);
    System.out.println("Sum 1 is : " + s);
    s = Sum(a,b,c);
    System.out.println("Sum 2 is : " + s);
    float s1;
    s1 = Sum(d,e);
    System.out.println("Sum 3 is : " + s1);
    Sum(a,b);
  }

  public static int Sum(int x,int y){
    int sum;
    sum = x + y;
    return sum;
  }

  public static int Sum(int x,int y,int z){
    int sum;
    sum = x + y + z;
    return sum;
  }

  public static float Sum(float x,float y){
    float sum;
    sum = x + y;
    return sum;
  }

  /*
  public static void Sum(int x,int y){
    int sum;
    sum = x + y;
    System.out.println("void: sum = " + sum);
  }
  */
  
}
