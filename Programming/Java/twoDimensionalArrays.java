package Programming.Java;

public class twoDimensionalArrays {
  public static void main(String[] args){

    System.out.println("Two Dimensional Arrays");

    int[][] nums = { {1,2,3,4,5}, {6,7,8} };
    System.out.println(nums[1][0]);

    //Looping through an Array:
    for( int i = 0; i< nums.length; i++){
      for( int j =0; j< nums[i].length; j++){
        System.out.println(nums[i][j]);
      }
    }
  }
}
