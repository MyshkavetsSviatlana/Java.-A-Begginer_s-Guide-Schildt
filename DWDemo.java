// Demonstrate the do-while loop.

class DWDemo {
 public static void main(String args[]) 
  throws java.io.IOException {
 
  char ch, ignore;

  do {
   System.out.println("Print a key followed by ENTER: ");
   ch = (char) System.in.read(); // get a char
   System.out.println("Entered key is " + ch);
   System.out.println();
   // discard any other characters in the input buffer (continues to read input until the line is reached.)
   do {
    ignore = (char) System.in.read();
} while (ignore!= '\n');
} while(ch != 'q');
}
}