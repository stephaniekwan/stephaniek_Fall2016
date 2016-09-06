
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
	
	public static double round2(double x){
		int a= x*100;
		
		
	}
}
