//字符串操作

class s03{
  public static void main(String[] args){
    System.out.println("a" + "b");	//ab
    System.out.println('a' + 'b');	//195
    System.out.println('a' + 2);	  //99
    System.out.println('a' + '2');  //147
    System.out.println("a" + 2);  //a2
    System.out.println(2 + "b");  //2b
    System.out.println('a' + "b");  //ab
    System.out.println('a' + 2 + "b");  //99b
    System.out.println('a');  //a

    System.out.println("-------------------------");

    System.out.println("hello"+'a'+1); //左边字符串，往后拼的都是字符串
    System.out.println('a'+1+"hello");
    System.out.println("5+5="+5+5);
    System.out.println(5+5+"=5+5");
//    helloa1
//    98hello
//    5+5=55
//    10=5+5
  }
}

// ASCII
/*
a 97
b 98
2 50
*/
