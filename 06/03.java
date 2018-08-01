//成员变量和局部变量
class s03{
    int x;  //成员变量
    public static void main(String[] args){
      int y;  //局部变量
      // System.out.println(y);  // 03.java:6: 错误: 可能尚未初始化变量y
      s03 s = new s03();  //???
      System.out.println(s.x);  //0
    }
}
