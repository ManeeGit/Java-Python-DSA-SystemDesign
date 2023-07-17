package Programming.Java;

public class arrays {
  public static void main(String[] args){
    System.out.println("The concept of Arrays");

    //Integer Array
    int[] num = {1,2,3,4,5};
    System.out.println(num[0]);
    System.out.println(num.length);

    //Looping through an array:
    for (int i=0; i < num.length; i++){
      System.out.println(num[i]);
      System.out.println("End");
    }

    //For Each Looping in an array:
    for (int j: num){
      System.out.println(j);
    }
  }
}
