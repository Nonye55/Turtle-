package turtle;
import java.util.Scanner;
public class TurtleGraphics {
	
	Turtle myTurtle  = new Turtle();
	
	Scanner input = new Scanner(System.in);
	
	SketchPad sketchpad = new SketchPad();
	
	public void draw() throws Throwable {
		System.out.println("enter command ");
		int command = input.nextInt();
		while(command !=9 ) {
			
		switch(command) {
			
			case 3:
				myTurtle.TurnRight();
			break;
			
			case 5:
				System.out.println("enter steps");
				int step = input.nextInt();
				myTurtle.moveForward(step,sketchpad.getFloor());
			break;
			
			case 6:
				myTurtle.displayPad(sketchpad);
			break;
		}
		
		myTurtle.displayTurtlePosition();
		
		System.out.println("enter next command");
			command = input.nextInt();
		
					
    }
			
 }
		
}
