package Programming.Java;

public class recursion {
  public static void main(String[] args){
    int res = sum(5,10);
    System.out.println(res);
  }
  public static int sum(int start, int end){
    if (end > start){
      return end + sum(start, end-1);
    } else {
      return end;
    }
  }
}
