class PhoneDemo{
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

//编译 && 运行
//javac -encoding utf-8 Phone.java PhoneDemo.java
//java PhoneDemo
