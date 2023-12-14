import java.util.function.Supplier;

//		Supplier Takes no arguments and returns a result of type T.
public class SupplierDemo implements Supplier<String>{

	public static void main(String[] args) {
		Supplier<String> supplier= new SupplierDemo();
		System.out.println(supplier.get());	
	}

	@Override
	public String get() {
		return "Hi somya";
	}
}

//using lambda exp.
public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> supplier= ()->{
			return "Hi SOmya";
		};	
		System.out.println(supplier.get());		
	}
}

//example using stream
public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> supplier= ()->{
			return "Hi SOmya";
		};		
		List<String> list= Arrays.asList("aa", "cx", "df", "xz", "asdcx");

//      here if element is present in list return that otherwise supplier.get will return a default result
		System.out.println(list.stream().findAny().orElse(supplier.get()));		

//without using supplier interface
    List<String> list1= Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(()->"Hi somya"));
	}
}
