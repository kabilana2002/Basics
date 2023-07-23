public class Alphabet {
 public static void main(String[] args) 
 {
  int i, j;
  for(i=65; i<=69; i++)
  {
   for(j=65; j<=i; j++)
    System.out.format("%c", i);
   System.out.println();
  }
 }
}
