package Interface;

public class IndianTraffic implements Intro,GlobalTraffic {  
	// after creating a class that defines the interface we have to manually add the 'implements interface_name i.e. Intro'
	// after adding the keywords 'Add unimplemented methods' either manually or hovering over class name.
	// we have have to implement all the interface methods if we are calling though we are using it or not i.e. red,green and yellow
	// and if we don't want to execute specific methods then we have to comment it in the interface class
	// we can define multiple interface in the same class but we have to create their respective objects as well i.e. we can't use a single object for every intertface
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intro in = new IndianTraffic(); 
		// here we have created the interface object to call the class values and variables should be public in nature.
		in.redStop();
		in.FlashYellow();
		in.greenGo();
	//	in.walkingrules();  
		// these are not accessible as this method is not part of the interface and the object we are using is of interface.
		
		GlobalTraffic gt = new IndianTraffic();
		gt.raliwaysignal();
		// multiple interface concept
		
		IndianTraffic ab = new IndianTraffic();
		ab.walkingrules();  
		// here it is accessible since we are calling with the class objects itself.
	
		
	}

	public void walkingrules() {    
		// this is not interface, we have created manually and this can be accessible for that class only i.e. IndianTraffic.
		System.out.println("Just Raise your hand as a sigma, stop the vehicle and move on");
	}
	
@Override
public void greenGo() {
	// TODO Auto-generated method stub
	// code
	System.out.println("Vehicle is ready to move");
}

@Override
public void redStop() {
	// TODO Auto-generated method stub
	System.out.println("Apply the brakes to your Vehicle to stop");
}

@Override
public void FlashYellow() {
	// TODO Auto-generated method stub
	System.out.println("Start the Engine of Vehicle to move");
}

@Override
public void raliwaysignal() {
	// TODO Auto-generated method stub
	System.out.println("If speed > 120kmph destroy the object on track but should not stop");
	
}

}
