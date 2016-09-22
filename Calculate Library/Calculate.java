
public class Calculate {
	
	public static double square(double x){
		return x*x;
	}
	
	public static double cube(double x){
		return x*x*x;
	}
	
	public static double average(double x, double y){
		return (x+y)/2;
	}
	
	public static double toDegrees(double x){
		return (x*180)/3.14159;
	}
	
	public static double toRadians(double x){
		return (x*3.14159)/180;
	}
	
	public static double discriminant(double a, double b, double c){
		return (b*b)-(4*a*c);
	}
	
	public static String toImproperFraction(double x, double y, double z){
		double a = x*z + y;
		return a+"/"+z;
	}
	
	public static String toMixedNum(int x, int y){
		int a = x/y;
		int b = x%y;
		return (a+"_"+b+"/"+y);
	}
	
	public static String foil(int a, int b, int c, int d, String var){
		return ((a*c)+var+"^2 + "+(a*d+b*c)+var+" - "+(b*d));
	}
	
	public static Boolean isDivisibleBy(int x, int y){
		if(y == 0){
			throw new IllegalArgumentException("Your second number cannot be 0.");
		}
		return x%y==0;
	}
	
	public static double absValue(int x){
		if(x<0){
			x=-x;
			return x;
		}
		else{
			return x;
		}
	}
	
	public static int max(int x, int y){
		if(x>=y){
			return x;
		}
		else{
			return y;
		}
	}
	
	public static int max(int x, int y, int z){
		if(x>=y && x>=z){
			return x;
		}else if(y>x && y>=z){
			return y;
		}else{
			return z;
		}
	}
	
	public static int min(int x, int y){
		if(x<=y){
			return x;
		}else{
			return y;
		}
	}
	
	public static double round2(double a){
		double x = a*1000;
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
			return (num + " ");
		}
	}

