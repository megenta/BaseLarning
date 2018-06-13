/*
Display the count of consecutive character in the format of character and its count".
For Ex: aabbbbccb
Expected o/p: a2b4c2b1
*/

public class RunLengthEncoding{
  
  
  public static void main(String Args[]){
    
    String inputString = "aabbbbcbaaa";
    //String inputString = "a";
    char[] charArray = inputString.toCharArray();
    
    
    int index = 0;
    int compareIndex = 0;
    int countChar = 0;
    
    StringBuilder sb = new StringBuilder();
    
    while(index < charArray.length){
     char currentChar = charArray[index];
     //System.out.println(charArray[index]);
      
      while(compareIndex < charArray.length && currentChar == charArray[compareIndex] ){
        
        compareIndex++;
        countChar++;
       
      }
      sb.append(currentChar);
      sb.append(countChar);
      index = compareIndex;
      countChar = 0;
     
   } 
    
    System.out.println("Encode String ="+sb.toString());  
    
  }
}
    
