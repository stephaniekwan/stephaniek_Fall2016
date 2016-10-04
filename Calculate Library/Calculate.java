/* Stephanie Kwan
 * APCS Period 1
 * Date: September 24, 2016
 * This program is a series of methods that calculate different
 * mathematical operations.
 */


public class Calculate {
	
	//this method returns the square of an integer.
	public static int square(int num){
		return num*num;
	}
	
	// this method returns the cube of an integer
	public static int cube(int num){
		return num*num*num;
	}

	// this method returns the average of 2 doubles.
	public static double average(double num1, double num2){
		return (num1+num2)/2;
	}
	
	//this method returns the average of 3 doubles
	public static double average(double num1, double num2, double num3){
		return (num1+num2+num3)/3;
	}
	
	//this method converts a number in radians to degrees
	public static double toDegrees(double radians){
		return (radians*180)/3.14159;
	}
	
	//this method converts a number in degrees to radians
	public static double toRadians(double degrees){
		return (degrees*3.14159)/180;
	}
	
	//this method gets the discriminant with an input of 3 doubles
	public static double discriminant(double a, double b, double c){
		return (b*b)-(4*a*c);
	}
	
	//this method converts a mixed number to an improper fraction
	public static String toImproperFraction(double wholeNum, double numer, double denom){
		double newNumerator = wholeNum*denom + numer;
		return newNumerator+"/"+denom;
	}
	
	//this method converts an improper fraction to a mixed number
	public static String toMixedNum(int numer, int denom){
		int wholeNum = numer/denom;
		int newNumer = numer%denom; 
		return (wholeNum+"_"+newNumer+"/"+denom);
	}
	
	//this method converts a binomial multiplication of the form into a quadratic equation
	public static String foil(int num1, int num2, int num3, int num4, String var){
		return ((num1*num3)+var+"^2 + "+((num1*num4)+(num2*num3))+var+" - "+(num2*num4));
	}
	
	//this method determines whether or not one integer is evenly divisible by another.
	public static Boolean isDivisibleBy(int num, int divisor){
		if(divisor == 0){
			throw new IllegalArgumentException("Your second number cannot be 0.");
		}
		return num%divisor==0;
	}
	
	//this method returns the absolute value of the number passed
	public static double absValue(double num){
		if(num<0){
			num=-num;
			return num;
		}
		else{
			return num;
		}
	}
	
	//this method returns the larger of 2 numbers
	public static int max(int num1, int num2){
		if(num1>=num2){
			return num1;
		}
		else{
			return num2;
		}
	}
	
	//this method returns the largest  of 3 numbers
	public static double max(double x, double y, double z){
		if(x>=y && x>=z){
			return x;
		}else if(y>x && y>=z){
			return y;
		}else{
			return z;
		}
	}
	
	//this method returns the smaller of 2 values passed
	public static double min(double num1, double num2){
		if(num1<=num2){
			return num1;
		}else{
			return num2;
		}
	}
	
	//this method returns a double rounded to 2 decimal places
	public static double round2(double num){
		double  = num*1000;
		double y = x%10;
		if(y>=5){
			return (x-y+10)/1000;
		}else{
			return (x-y)/1000;
		}
	}
	
	public static double exponent(double num, int exp){
		if(exp<=0){
			throw new IllegalArgumentException("Your second number must be greater than 0.");
		}
		double x = num;
		for(var i = 1; i < exp; i++){
			x = x * num;
		}
		return num;
	}
	
	public static int factorial(int x){
		if(x<=0){
			throw new IllegalArgumentException("Enter a number greater than 0.");
		}
		int num = 1;
		for(int i = x; i >= 1; i--){
			num *= i;
		}
		return num;
	}
	
	public static boolean isPrime(int x){
		for(int i = 2; i < x; i++){
			if(Calculate.isDivisibleBy(x,i)){
				return false;
			}
		}
		return true;
	}
	
	public static int gcf(int x, int y){
		int gcf = 1;
		for(int i = 2; i <= x; i++){
			if(isDivisibleBy(x,i) && isDivisibleBy(y,i)){
				gcf = i;
			}
		}
		return gcf;
	}
	
	public static double sqrt(double x){
		if(x<0){
			throw new IllegalArgumentException("Enter a number that is 0 or greater.");
		}
		double y;
		double sqrt = x/2;
		do {
			y = sqrt;
			sqrt = (y + (x/y) / 2);
		} while((x-sqrt) != 0);
		return Calculate.round2(sqrt);
		}
	}

	public static String quadFormula(int a, int b, int c){
		double discriminant = discriminant(a, b, c);
		if(discriminant<0){
			return "no real roots";
		}
		if(discriminant==0){
			double num = (-1*b)/2*a;
			return (round2(num) + " ");
		}
		if(discriminant>0){
			double num1 = ((-1*b)+sqrt(discriminant))/(2*a);
			double num2 = ((-1*b)-sqrt(discriminant))/(2*a);
			double smallerNum = min(num1, num2);
			double largerNum = max(num1, num2);
			return (smallerNum + " and " + largerNum);
		}
	}

