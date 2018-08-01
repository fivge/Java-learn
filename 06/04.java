//基本类型传递
class Demo{
  public int sum(int a, int b){
    return a+b;
  }
}

class s04{
  public static void main(String[] args){
    Demo d = new Demo();
    int s = d.sum(6,7);
    System.out.println(s);
    
    int a = 3;
    int b = 5;
    int s2 = d.sum(a,b);
    System.out.println(s2);
  }
}
