public class Types {

public static void main(String[] args) {
   short smallNumber=150;
   int bigNumber= smallNumber;
   short anothersmallNumber= (short) bigNumber;
   System.out.println(smallNumber);
   System.out.println(bigNumber);
   System.out.println(anothersmallNumber);
   byte tinyNumber = (byte) smallNumber;
   System.out.println(smallNumber);
   System.out.println(tinyNumber);

   }
}
