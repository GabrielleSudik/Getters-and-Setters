//again, normally a class would be in its own file
//but we'll add it here for simplicity

class Person{
	String name;
	int age;
	
	//one method: doesn't return anything "void"
	void speak(){
		System.out.println("My name is " + name);
	}
	
	//another method: returns an "int"
	int calcYearsUntilRetirement(){
		int yearsLeft = 65 - age;
		System.out.println(yearsLeft);
		
		return yearsLeft;
	}
	
	//another method that returns an int (see below)
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
}


public class Application {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe";
		person1.age = 23;
		person1.speak();
		person1.calcYearsUntilRetirement();
		
		//here's something new-ish:
		//you're creating a variable that is equal to
		//what get returned from the method
		//we learned something like this in javascript, but not clearly
		
		int years = person1.calcYearsUntilRetirement();
		System.out.println("Years until retirement: " + years);
		//it makes a lot more sense now.
		
		//something similar here.
		//THIS variable age is what get returned from the class's method/variable
		//doesn't have to use the same word but it can
		int age = person1.getAge();
		System.out.println(age);
		
		//and same thing, but with the returned String
		String name = person1.getName();
		System.out.println(name);
	}

}
