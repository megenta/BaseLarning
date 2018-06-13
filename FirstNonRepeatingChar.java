/*
find out the first non repetitive character of a string
input- GoodsforGoods
outpu-f
*/

public class Solution{

public static void main(String Args[]){
  
 //HashSet dd  = new HashSet();
String inoutString  = "amitsrivastava";
char[] charArray =  inoutString.toCharArray();
char searchChar;

  
  
  outer:
  for (int i=0 ; i < charArray.length  ;i++){
     searchChar = charArray[i];
      boolean found = false;
      inner:
      for (int j=i+1 ; j < charArray.length ; j++){
        //System.out.println(" searchChar ="+searchChar + " compare= "+charArray[j]);
    
        if(searchChar == charArray[j]){
          //System.out.println(" non repeated char ="+searchChar);
          found = true;
            break inner;
          }
    
      }
    if (found == false){
      System.out.println(" non repeated char ="+searchChar);
       break outer;
    }
    
  }
  }//MAIN
}//CLASS
