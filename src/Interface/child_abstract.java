package Interface;

public class child_abstract extends Abstract_class {
 // added the keyword of 'extend parent_abstract_name'
	// all methods should be implemented i.e . bodycolor
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child_abstract ch = new child_abstract();
		ch.bodyweight();
		ch.bodycolor();
		ch.engine();
	
		/* Abstract_class pa = new Abstract_class();
		 -> we cannot create the object of parent class which is abstract because of abstract keyword present in parent 
		 class name and this is only called as instantiate object (last point of notes)
		 -> private is not used in abstract bcoz it has to be used by everywhere. 
		 */
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("Define the color of your vehicle with emblem");
	}

}
