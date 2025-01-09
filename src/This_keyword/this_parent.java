package This_keyword;
// used to resolve global/class variable and method variable when they are same i.e. name conflicts. 


public class this_parent {

	int a =7;
	
	public void getData() {
		int a = 5;
		System.out.println("local variable " + a);
		System.out.println("global variable " + this.a);
		System.out.println("sum of local and global " + (a+this.a));
		// this refers to current object -> object lies in class level.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		this_parent th = new this_parent();
		th.getData();
	}

}
