public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      int searchNum = num;
      for (int i = 1; i>0; i++){
        searchNum = searchNum + i;
        if (testPalindromicNum(searchNum) == true){
          break;
        }
      }
      return searchNum-num;
      //supposed to return 110 - the miles you have to go until you get to the next pa;endromic num?
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      Integer reverseInt = Integer.valueOf(reverseNum(num));
      if (reverseInt.equals(num)) {
          return true;
      }
      else{
        return false;
      }

    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      String number = Integer.toString(num);
      //did this for wrapper class bc primitive variables do not have methods associated with them - so use wrpper class to do int to string
      String reverse = "";
      for (int i = number.length()-1; i>= 0; i--){
        reverse = reverse + number.charAt(i);
      }
        return reverse;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
