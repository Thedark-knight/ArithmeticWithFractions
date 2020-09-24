import java.io.\*;  

public class ArithmeticWithFractions{  
   private static Fraction fraction1;  
   private static Fraction fraction2;   
 public static void main(String\[\] args) throws IOException{  
   
 String fraction1 = args\[0\];  
 String\[\] splitFraction1 = fraction1.split("/");  
 String fraction2 = args\[1\];  
 String\[\] splitFraction2 = fraction2.split("/");  
   
 int numerator1 = Integer.parseInt(splitFraction1\[0\]);  
 int denominator1 = Integer.parseInt(splitFraction1\[1\]);  
 int numerator2 = Integer.parseInt(splitFraction2\[0\]);  
 int denominator2 = Integer.parseInt(splitFraction2\[1\]);  
   
 ArithmeticWithFractions.fraction1 = new Fraction (numerator1, denominator1);  
 ArithmeticWithFractions.fraction2 = new Fraction (numerator2, denominator2);  
 Fraction newFraction1 = ArithmeticWithFractions.fraction1;  
 Fraction newFraction2 = ArithmeticWithFractions.fraction2;  
    }   
}  
class Calculator{  

}  
class Fraction{  
 public int numerator;  
 public int denominator;  
   
 public Fraction(int n, int d )  
    {  
 this.numerator = n;    
 this.denominator = d;   
    }  
}
