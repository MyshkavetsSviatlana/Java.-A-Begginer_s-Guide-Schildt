/*
Demonstrate automatic convertion from long to double.
*/

class LToD {
public static void main(String[] args) {

long L;
double D;

L = 100123285L;
D = L; // Automatic covertion from long to double

System.out.println("L and D " + L + " " + D);

/*long l;
double d;

d = 100123285.0;
l = d; // No automativ cobertion from double to long

System.out.println("L and D " + L + " " + D);
*/

}
}