/* Count from 1000 to 0 by -2.
*/

class ThousandToZero {
 public static void main(String args[]) {
  for(int i = 1000; i >= 0; i--) {
   if(i%2 == 0) System.out.print(i + " ");
}
}
}