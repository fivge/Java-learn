//一个java文件多个class

//手机类
class Phone{
  //成员变量
  String brand;   //品牌
  int price;      //价格
  String color;   //颜色

  //成员方法

  public void call(String name){  //打电话
    System.out.println("Call " + name + " right now!");
  }

  public void sendMessage(){    //发短信
    System.out.println("Send message to all.");
  }

  public void showCountPrice(int count){    //打折
    System.out.println("Price after count is " + (1.0 * count / 10)*price );
  }
}

class s02{
    public static void main(String[] args){
        //创建对象
        Phone p = new Phone();

        //成员变量测试
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);

        p.brand = "Sony";
        p.price = 3000;
        p.color = "red";

        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.color);

        //成员方法测试
        p.call("fivge luan");
        p.sendMessage();
        p.showCountPrice(7);
    }
}
