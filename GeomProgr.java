/*
Generate and display the progression 1, 2, 4, 8, 16, 32 and so on.
*/

class GeomProgr {
 public static void main(String args[]) {
  for(int i = 1; i <= 1000; i += i) {
   System.out.print(i + " ");
}
}
}