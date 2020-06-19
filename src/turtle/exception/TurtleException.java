package turtle.exception;

public class TurtleException  extends Exception{
			public TurtleException() {}
			
			public TurtleException(String message) {
				super(message);
			}
			
			public TurtleException(Throwable exception) {
				super(exception);
			}
			
			public TurtleException(String message, Throwable thrown) {
				super(message, thrown);
			}
		
		}
		

