/**
 * 
 */
package turtle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import turtle.exception.TurtleException;

/**
 * @author user
 *
 */
class TurtleTest {
		private Logger logger = Logger.getLogger(TurtleTest.class.getName());
		private Turtle myTurtle;
		private SketchPad sketchPad;

@BeforeEach
void setUp() throws Exception {
	 myTurtle  =  new Turtle();
	Pen biro = new Pen();
	myTurtle.setTurtlePen(biro);
	
	sketchPad = new SketchPad();
}

@Test
void turtleReadyTest() {
	assertNotNull(myTurtle);
	assertNotNull(myTurtle.getTurtlePen());
	assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getPosition());
	assertEquals(Compass.EAST, myTurtle.getDirection());
}

@Test
void penPositionChangeTest() {
	assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getPosition());
	myTurtle.getTurtlePen().setPosition(PenPosition.DOWN);
	assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getPosition());
}

@Test
void turtleMoveForwardSouthTest() {
	
	myTurtle.setDirection(Compass.SOUTH);
	assertEquals(Compass.SOUTH,myTurtle.getDirection());
	
	myTurtle.setYcoordinate(4);
	
	assertEquals(0, myTurtle.getXcoordinate());
	assertEquals(4, myTurtle.getYcoordinate());
	
	
	try {
		logger.info("calling move forward method");
		myTurtle.moveForward(5, sketchPad.getFloor());
	}catch(TurtleException tex) {
		logger.info(tex.getMessage());
	} catch (Throwable e) {
		e.printStackTrace();
	}
//	myTurtle.setXcoordinate(11);
	assertEquals(0, myTurtle.getXcoordinate());
	assertEquals(9, myTurtle.getYcoordinate());
	 
		myTurtle.displayPad(sketchPad);
	}

@Test
void TurtleMoveForwardEastTest(){
	
	myTurtle.setDirection(Compass.EAST);
	assertEquals(Compass.EAST,myTurtle.getDirection());
	
	 myTurtle.setXcoordinate(5);
	 
	 assertEquals(0,myTurtle.getYcoordinate());
	 assertEquals(5,myTurtle.getXcoordinate());
	 
	 try {
		 logger.info("Trutle is moving East");
		 myTurtle.moveForward(3,sketchPad.getFloor());
		 
	 }catch(TurtleException tex) {
		 logger.info(tex.getMessage());
	 }catch (Throwable e) {
		 e.printStackTrace();
	 }
	 
	 myTurtle.displayPad(sketchPad); 
	 }

@Test
void TurtleMoveForwardWESTTest(){
	
	myTurtle.setDirection(Compass.WEST);
	assertEquals(Compass.WEST,myTurtle.getDirection());
	
	 myTurtle.setXcoordinate(2);
	 
	 assertEquals(0,myTurtle.getYcoordinate());
	 assertEquals(2,myTurtle.getXcoordinate());
	 
	 try {
		 logger.info("move forward method is called Trutle is moving WEST ");
		 myTurtle.moveForward(6,sketchPad.getFloor());
		 
	 }catch(TurtleException tex) {
		 logger.info(tex.getMessage());
	 }catch (Throwable e) {
		 e.printStackTrace();
	 }
	 
	 myTurtle.displayPad(sketchPad); 
	 }

@Test
void TurtleMoveForwardNorthTest(){
	
	myTurtle.setDirection(Compass.NORTH);
	assertEquals(Compass.NORTH,myTurtle.getDirection());
	
	 myTurtle.setYcoordinate(9);
	 
	 assertEquals(9,myTurtle.getYcoordinate());
	 assertEquals(0,myTurtle.getXcoordinate());
	 
	 try {
		 logger.info("move forward method is called Trutle is moving North");
		 myTurtle.moveForward(5,sketchPad.getFloor());
		 
	 }catch(TurtleException tex) {
		 logger.info(tex.getMessage());
	 }catch (Throwable e) {
		 e.printStackTrace();
	 }
	 
	 myTurtle.displayPad(sketchPad); 
	 }


@Test
void turtleGraphicsDrawMethodTest() throws Throwable {
	
	TurtleGraphics graph =new TurtleGraphics();
	graph.draw();
}

//@Test
//void randomTest() {
//	System.out.println(BigInteger.ONE.intValue());
//}
}