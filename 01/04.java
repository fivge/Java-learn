class s04{
  public static void main(String[] args){
    //隐式转换
    //小的转大的
    byte a = 2;
    int b = 23;
    System.out.println(a + b);
    long c;
    c = a + b;
    System.out.println(c);
    /* 从 long 转为 int 报错
    int d;
    d = c + 1;
    */

    //强制转换
    //可能会丢失精度
    //目标数据类型 变量名 = (目标数据类型)(被转换的数据);
    byte d = (byte)(c+1);
    System.out.println(d);
  }
}
