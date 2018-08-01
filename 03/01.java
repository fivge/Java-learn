//switch 没有break的情况。遇到匹配值会一直往下执行
class s01{
  public static void main(String[] args){
    int x = 3;
    int y = 3;
    switch(x){
	    default:
		    y++;
	    case 3:
		    y++;
	    case 4:
		    y++;
  }
  System.out.println("x = " + x + "; y = " + y);  //x = 3;y = 5;
}
}
