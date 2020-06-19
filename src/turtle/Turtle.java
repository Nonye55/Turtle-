package turtle;
import java.math.BigInteger;
import java.math.BigInteger;
import turtle.exception.*;
public class Turtle {
	private Pen TurtlePen;
	private int ycoordinate;
	private int xcoordinate;
	private Compass direction = Compass.EAST;
	
	
	
			public Pen getTurtlePen() {
				return TurtlePen;
			}
			public void setTurtlePen(Pen turtlePen) {
				TurtlePen = turtlePen;
			}
			public int getYcoordinate() {
				return ycoordinate;
			}
			public void setYcoordinate(int ycoordinate) {
				this.ycoordinate = ycoordinate;
			}
			public int getXcoordinate() {
				return xcoordinate;
			}
			public void setXcoordinate(int xcoordinate) {
				this.xcoordinate = xcoordinate;
			}
			public Compass getDirection() {
				return direction;
			}
			public void setDirection(Compass direction){
				
				this.direction = direction;
			}
			
			
			public void penUp() {
				
			}
			
			public void moveForward(int NumberOfSteps,int [][] Canvas) throws Throwable {
					this.NumberOfSteps(NumberOfSteps, Canvas.length);
					
					if(this.getDirection() == Compass.EAST) {
						for (int i= 0;i < NumberOfSteps; i++) {
							Canvas[ycoordinate][xcoordinate] = BigInteger.ONE.intValue();
							xcoordinate++;
						}	
					}
				
				    else if(this.getDirection() == Compass.SOUTH) {
						for(int i = 0; i < NumberOfSteps; i++) {
							Canvas[ycoordinate][xcoordinate] = BigInteger.ONE.intValue();
							 ycoordinate++;
						}
				    }
					
					
				    else if(this.getDirection() == Compass.WEST) {
						for(int i = 0; i < NumberOfSteps; i++) {
							Canvas[ycoordinate][xcoordinate] = BigInteger.ONE.intValue();
							xcoordinate--;
						}
				    }
					
				    else if(this.getDirection() == Compass.NORTH) {
						for(int i = 0; i < NumberOfSteps; i++) {
							Canvas[ycoordinate][xcoordinate] = BigInteger.ONE.intValue();
							ycoordinate--;
						}
				    }
					
					
			}	

			public void TurnRight() throws Exception{
				
						if(this.getDirection()== null) {
							throw new Exception("Compass is null");
						}
						
						else if(getDirection()== Compass.EAST) {
							
							this.setDirection(Compass.SOUTH);
						}
						
						else if(getDirection()== Compass.SOUTH) {
							this.setDirection(Compass.WEST);
						}
						
						else if(getDirection()== Compass.WEST) {
							this.setDirection(Compass.NORTH);
						}
						
						else if(getDirection()== Compass.NORTH) {
							this.setDirection(Compass.EAST);
						}
						
						
		}
						
				
			
			public Boolean NumberOfSteps(int steps,int floorsize)throws Throwable {
								boolean result= true;
						if(steps < BigInteger.ZERO.intValue()) {
							throw  new Exception("increase the number of steps");
						}
						else if(getDirection()== Compass.EAST && (steps+getXcoordinate() > floorsize)){
							throw  new Exception("Reduce the number of steps");
						}
						else if(getDirection()== Compass.WEST && (steps+getXcoordinate() > floorsize)){
								throw  new Exception("Reduce the number of steps");	
							}
						else if(getDirection()== Compass.SOUTH && (steps+getXcoordinate() > floorsize)){
									throw  new Exception("Reduce the number of steps");
						}
						else if(getDirection()== Compass.NORTH && (steps+getXcoordinate() > floorsize)){
							throw  new Exception("Reduce the number of steps");
							
						}
						return result;
						
						
						
						
					}
			
			public void displayPad(SketchPad sketchPad) {
				for(int i= 0; i < sketchPad.getFloor().length;i ++) {
					for(int j =0; j < sketchPad.getFloor()[i].length;j ++) {
						
//						System.out.print(sketchPad.getFloor()[i][j]);
						
						if(sketchPad.getFloor()[i][j] == 1) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
					System.out.println();
					
			}
		}
			
			public void displayTurtlePosition() {
				
				System.out.printf("Turtle is facing %s:%nTurle position is(%d, %d)", getDirection(),getXcoordinate(),getYcoordinate());
			}
}	
			
			
			
			


	
	