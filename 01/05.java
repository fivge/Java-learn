class s05{
  public static void main(String[] args){
    byte a = 2;
    byte b = 23;
    byte c;
    c = a + b;    //错误: 不兼容的类型: 从int转换到byte可能会有损失
    System.out.println(a + b);
    System.out.println(c);
  }
}
