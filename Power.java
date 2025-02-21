// Compute integer power of 2.

class Power {
 public static void main(String args[]) {
  int e;
  int result;

  for(int i = 0; i < 10; i++) {
   result = 1;
   e = i;
   System.out.println("before while i: " + i + ", e: " + e + ", result: " + result);
   while(e > 0) {
    result *= 2;
    e--;
    System.out.println("i: " + i + ", e: " + e + ", result: " + result);
}
    System.out.println("2 to the " + i + " power is " + result);
}
}
}