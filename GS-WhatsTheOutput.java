// does the code compile output - complain
class Solution {

public static void main(String[] args) {

     javaSample(null);

   }

   private static void javaSample(Integer inte){
     System.out.println(inte + " is a Number");
   }

   private static void javaSample(Long lo){
     System.out.println(lo + " is a Long");
   }


   private static void javaSample(String str){
     System.out.println(str + " is a String");
   }

   private static void javaSample(Object obj){
     System.out.println(obj + " is an Object");
   }
}



