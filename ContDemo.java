// Use continue.

class ContDemo {
 public static void main(String args[]) {
  int i; 

  // print even numbers between 2 and 100
  for(i=2; i<=100; i++) {
   if(i%2 != 0) continue;
   System.out.println(i);
}
}
}