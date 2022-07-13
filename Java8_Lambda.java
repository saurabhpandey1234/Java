package Java8programming;

import java.util.ArrayList;
import java.util.List;

interface Greetings{
	public String say();
}

interface Myfunction{
	public String sayhello();
}

interface Singleparameter{
	public int incrementby5(int a);
}

interface Stringconcat{
	public String sconcat(String a,String b);
}
public class Java8_Lambda {

	public static void main(String[] args) {
		
		Greetings object=()->{
			return "Good Evening everyone";
		};
		System.out.println(object.say());
		
		
		Myfunction msg=()->{
			return "Good Morning Guys";
		};
		System.out.println(msg.sayhello());
		
		
		Singleparameter lambda=(number)->number+5;
		System.out.println("given number"+lambda.incrementby5(34));
		
		
		Stringconcat object1=(firstname,lastname)->firstname+lastname;
		System.out.println("name "+object1.sconcat("Saurabh", "Pandey"));
		
		
		List<String> list =new ArrayList<String>();
		list.add("apple");
		list.add("kiwi");
		list.add("oreange");
		
		System.out.println("List of fruits");
		list.forEach((fruits) -> System.out.println(fruits));
		
	}
}
