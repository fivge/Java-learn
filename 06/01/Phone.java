// class s01{
//   public static void main(String[] args){
//
//   }
// }

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

  public void showCountPrice(int count){
    System.out.println("Price after count is " + (1.0 * count / 10)*price );
  }
}
