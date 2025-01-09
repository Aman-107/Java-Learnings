package Super_keyword;

public class super_child extends super_parent {

	String name = "Shadow Daredevil";
	
	public void getData() {
		super.getData(); // calling the parent class function value using super keyword
		System.out.println("This is child class method function value");
	}
	
	public super_child() {
		super(); // calling parent class constructor (by default it's calling parent without using super keyword still remember the theory)
		System.out.println("Child Class Constructor");
	}
	
	public void getString() {
		System.out.println(name);
// 'Shadow Daredevil' is output because it's a local variable and preference given to local is first i.e. child then 
// parent if there is a case of conflicts
		System.out.println(super.name);
	// super keyword is used to call the parent values when there is case of child and parent conflicts.	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		super_child cd = new super_child();
		cd.getString(); 
		cd.getData();
		}

}
