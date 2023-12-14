//this is functional interface having only one abstract method
interface Calculator {

// void display();

//	void sum(int a, int b);

//	int diff(int a, int b);

	int div(int a, int b);

	static void version() {
		System.out.println("Version 2");
	}
	default void name() {
		System.out.println("Casio calculator");
	}
}

public class LambdaDemo {
	public static void main(String[] args) {

//		Calculator calc = ()->{
//			System.out.println("Calculator swicthed on");
//		};

//		Calculator calc = (a, b) -> { // we dont need to mention datatype of parameter
//			System.out.println(a + b);
//		};
//		Calculator calc = (a, b) -> b - a; // dont need to mention return too
		
		Calculator calc= (a,b)->{
			if(b==0) {
				throw new RuntimeException("Division by 0 not allowed");
			}
			else {
				return a/b;
			}
		};
//		calc.display(); 
//		calc.sum(10, 20);
//		System.out.println(calc.diff(13, 10));
		System.out.println(calc.div(12, 5));
		System.out.println(calc.div(10, 0));
		calc.name();
		Calculator.version();
	}
}
