/* 
Read characters from the keyboard until a period is received.
Count the number of spaces.
Report the total number at the end/
*/

class ReadChar {
 public static void main(String args[]) 
  throws java.io.IOException {
   
  char ch, ignore;
  int space = 0;

  System.out.println("Press any key!");
do {
  System.out.print("You've pressed ");
  ch = (char) System.in.read();
  do {
   ignore = (char) System.in.read(); // discard any other characters in the input buffer
} while (ignore != '\n');
  if(ch == ' ') space ++;
} while(ch != '.');
System.out.println("Total number of spaces received is " + space + ".");
} 
}