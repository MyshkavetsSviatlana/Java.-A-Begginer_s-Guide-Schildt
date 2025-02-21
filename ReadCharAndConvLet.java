/*
Read characters from the keyboard.

Convert all lowcase letters to uppercase and all uppercase to lowercase, displaying the result.

Make no changes to any other characters.

Stop when a period is entered.

Display the number of changes that have taken place at the end.
*/

class ReadCharAndConvLet {
public static void main(String args[])
 throws java.io.IOException {
  char ch, ignore;
  int lowToUpperChanges=0, upperToLowChanges=0, totalChanges = 0;

  System.out.println("Press any key! Enter period to stop.");
  
   do {
    ch = (char) System.in.read();
    int asc = (int)ch;
    if(asc <= 90 & asc >= 65){
     lowToUpperChanges ++;
     int asc2 = asc + 32;
     System.out.println("It's an uppercase letter. Converting " + ch + " to lowercase… The result is " + (char)asc2 + ".");
}
    else if(asc <= 122 & asc >= 97) {
     upperToLowChanges ++;
     int asc3 = asc - 32;
     System.out.println("It's a lowercase letter. Converting " + ch + " to uppercase… The result is " + (char)asc3 + ".");
} else System.out.println("It's not a letter. No conversion is needed.");
    do {
     ignore = (char) System.in.read();
       } while(ignore != '\n');
      } while(ch != '.');
System.out.println("You've enetered a period.");
totalChanges = lowToUpperChanges + upperToLowChanges;
System.out.println(lowToUpperChanges + " lowercase to uppercase conversions have been made.");
System.out.println(upperToLowChanges + " uppercase to lowercase conversions have been made.");
System.out.println(totalChanges + " conversions have been made in total.");
System.out.println("Bye!");
}
}