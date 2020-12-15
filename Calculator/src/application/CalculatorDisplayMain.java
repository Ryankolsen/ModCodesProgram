/**
 * 
 */
package application;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

/**
 * @author Ryan Olsen
 * Program designed using JavaFX to create a virtual calculator on the screen
 * User can input information using the buttons. Operations can also be selected and results
 * print to the calculator text label
 * All action events handled in this class. The class Computation contains methods
 */
public class CalculatorDisplayMain extends Application{
	Label response; 		//Label to display user numbers entered, responses, and messages
	String  num1, num2;		//String to hold two numbers
	String operation1;		//String to determine which mathematical operation to perform
	String totalNum;		//String to hold and display the total number
	BigDecimal totalNum1;	//Used BigDecimal for calling method math1() to limit rounding errors
	BigDecimal answer1;		//Receives answer from method math1()
	DecimalFormat df = new DecimalFormat("#,##0.###############"); //Format used to convert strings to numbers with comma separators 

	
	public static void main(String[] args) {	
		
		//Start the JavaFX application by calling launch()
		launch(args);
	}//end main method

//Override the start() method
@Override
public void start(Stage myStage) {
	
	//use constructor for Computations class
	Computations operation = new Computations();
	
	//Give the stage a title
	myStage.setTitle("Hi, I'm a Calculator!");

	//Use a Gridpane for the root node. 
	GridPane rootNode = new GridPane();
		
	//set the size
	rootNode.setPrefSize(275, 230);
	
	//Set border and color for the rootNode
	rootNode.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	
	//Align all nodes in the center of the grid/rootNode
	rootNode.setAlignment(Pos.CENTER);
	
	//Create a scene
	Scene myScene = new Scene(rootNode);
	
	//Set the scene on the stage
	myStage.setScene(myScene);
	
	//Create the label
	response = new Label("Please enter a computation");
	response.setWrapText(true);
	response.setTextAlignment(TextAlignment.JUSTIFY);
	response.setTextFill(Color.web("#0000CD"));
	
	//Create all buttons for calculator
	Button btnZero = new Button("0");
	Button btnOne = new Button("1");
	Button btnTwo = new Button("2");
	Button btnThree = new Button("3");
	Button btnFour = new Button("4");
	Button btnFive = new Button("5");
	Button btnSix = new Button("6");
	Button btnSev = new Button("7");
	Button btneigh = new Button("8");
	Button btnnine = new Button("9");
	Button btnmult = new Button("X");
	Button btnminus = new Button("-");
	Button btnplus = new Button("+");
	Button btnplusneg = new Button("+/-");
	Button btndec = new Button(".");
	Button btnequal = new Button("=");
	Button btndiv = new Button("÷");
	Button btnclear = new Button("CE");
	Button btndel = new Button("<-");
	
	//Set the size for each button. Must set individual sizes because all columns are not the same size
	btnZero.setMinSize(40, 25);
	btnOne.setMinSize(40, 25);
	btnTwo.setMinSize(40, 25);
	btnThree.setMinSize(40, 25);
	btnFour.setMinSize(40, 25);
	btnFive .setMinSize(40, 25);
	btnSix.setMinSize(40, 25);
	btnSev.setMinSize(40, 25);
	btneigh.setMinSize(40, 25);
	btnnine.setMinSize(40, 25);
	btnmult.setMinSize(40, 25);
	btnminus.setMinSize(40, 25);
	btnplus.setMinSize(40, 25);
	btnplusneg.setMinSize(40, 25);
	btndec.setMinSize(40, 25);
	btnequal.setMinSize(40, 25);
	btndiv.setMinSize(40, 25);
	btnclear.setMinSize(90,25);
	btndel.setMinSize(40,25);
	response.setMinSize(50, 25);
	
	//Add height and vertical gap
	rootNode.setHgap(11);
	rootNode.setVgap(11);
		
	//button 1 action event without lambda expression. (Used w/o lambda just as code example)
	btnOne.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent ae) {	
			String inputNum;
			inputNum = btnOne.getText();
			if (totalNum != null) 
				totalNum += inputNum; 		
				else
					totalNum = btnOne.getText();
			BigDecimal bdNum3 = new BigDecimal(totalNum);
			response.setText(df.format(bdNum3));
		}//end method handle()		
	});//end method setOnAction()
	
	//button 2 action event without lambda expression
		btnTwo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent ae) {
				String inputNum;
				inputNum = btnTwo.getText();
				if (totalNum != null) 
					totalNum += inputNum; 		
					else
						totalNum = btnTwo.getText();
				BigDecimal bdNum3 = new BigDecimal(totalNum);
				response.setText(df.format(bdNum3));
			}//end method handle()		
		});//end method setOnAction()
		
		//button 3 action event. All future will use lambdas to save time/space.  
		btnThree.setOnAction((ae) -> {
		String inputNum;
		inputNum = btnThree.getText();
		if (totalNum != null) 
			totalNum += inputNum; 		
			else
				totalNum = btnThree.getText();
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}); //end method setOnAction()
		
		//button 4 action event
		btnFour.setOnAction((ae) -> {
		String inputNum;
		inputNum = btnFour.getText();
		if (totalNum != null) 
			totalNum += inputNum; 		
			else
				totalNum = btnFour.getText();
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}); //end method setOnAction()
		
		//button 5 action event
		btnFive.setOnAction((ae) -> {
		String inputNum;
		inputNum = btnFive.getText();
		if (totalNum != null) 
			totalNum += inputNum; 		
			else
				totalNum = btnFive.getText();
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}); //end method setOnAction()
		
		
		//button 6 action event
		btnSix.setOnAction((ae) -> {
		String inputNum;
		inputNum = btnSix.getText();
		if (totalNum != null) 
			totalNum += inputNum; 		
			else
				totalNum = btnSix.getText();
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}); //end method setOnAction()
		
		//button 7 action event
		btnSev.setOnAction((ae) -> {
		String inputNum;
		inputNum = btnSev.getText();
		if (totalNum != null) 
			totalNum += inputNum; 		
			else
				totalNum = btnSev.getText();
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}); //end method setOnAction()
		
		//button 8 action event
		btneigh.setOnAction((ae) -> {
		String inputNum;
		inputNum = btneigh.getText();
		if (totalNum != null) 
			totalNum += inputNum; 		
			else
				totalNum = btneigh.getText();
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}); //end method setOnAction()
		
		//button 9 action event
		btnnine.setOnAction((ae) -> {
		String inputNum;
		inputNum = btnnine.getText();
		if (totalNum != null) 
			totalNum += inputNum; 		
			else
				totalNum = btnnine.getText();
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}); //end method setOnAction()
		
		//button . action event
		btndec.setOnAction((ae) -> {			
		String inputNum;
		inputNum = btndec.getText();	
		if (totalNum == null || totalNum == "") {
			System.out.println("TotalNum = " + totalNum);
			totalNum = inputNum; 
			response.setText(totalNum);		}
		else if(totalNum.contains(".")) {//do nothing if the number contains a period already			
		}//end if statement			
			else if (totalNum != "."){
				totalNum += inputNum; 
		BigDecimal bdNum3 = new BigDecimal(totalNum);
		response.setText(df.format(bdNum3));
		}//end else if statement
		}); //end method setOnAction()
		
		//button +/- action event
		btnplusneg.setOnAction((ae) -> {
		String inputNum;
		if (totalNum == null) {} // if there are no numbers entered, do nothing
		else {
			inputNum = Double.toString((Double.parseDouble(totalNum) * -1));		
			totalNum = inputNum; 
			BigDecimal bdNum3 = new BigDecimal(totalNum);
			response.setText(df.format(bdNum3));
		}//end else statement
		}); //end method setOnAction()

		//Button btnZero action event 
		btnZero.setOnAction((ae) -> {
			String formattedString = "";	//String after BigDecimal format
			String wholeNum = "";			//String of whole number only
			String remNum = "";				//String of remainder including decimal
			String inputNum;				//String for input/button zero
			int counter = 0; 				//For loop counter to identify decimal 
			inputNum = btnZero.getText();
			if (totalNum != null) {  
				System.out.println("totalNum = " + totalNum);
				totalNum += inputNum; 		
				//If the number contains a decimal, break the number into the whole and remaining parts. 
				//Convert whole number using BigDecimal class, add with remNum before displaying
				if (totalNum.contentEquals(".")) {response.setText(inputNum);}
				else if (totalNum.contains(".")) { 
					for(int i = 0; i < totalNum.length(); i++) {
						if (totalNum.charAt(i) == '.') {
							counter = i;							
					}//end for loop
					}//end for loop
					
					//If text includes a whole number...find the whole number
					if (counter > 1){
						System.out.println("Counter is " + counter);
						 	for(int i = 0; i < counter; i++) {
							wholeNum += totalNum.charAt(i);
							System.out.println("Whole Num = " + wholeNum);
						}//end for loop					
						 	
						 	//Find the remaining number after the decimal
						 	for(int i = counter; i<= totalNum.length()-1; i++) {
							remNum += totalNum.charAt(i);							
						}//end for loop
						 	
						//format whole number to include commas
						BigDecimal bdNum3 = new BigDecimal(wholeNum);
						formattedString = (df.format(bdNum3));
						response.setText(formattedString + remNum);						
					} //end if counter > 1
					else response.setText(totalNum);
				} //end else if statement 
				else {
			BigDecimal bdNum3 = new BigDecimal(totalNum);
			response.setText(df.format(bdNum3));
			System.out.println("totalNum2 = " + totalNum);
				}//end else statement
				}//end first if statement
			}); //end method setOnAction()
				
		//button btndel action event (delete)
		btndel.setOnAction((ae) -> {
			if (totalNum == "") {				
			}
			else if (totalNum != null) {
			if(totalNum.length()==1) {
				System.out.println("totalnum = " + totalNum);
				totalNum = "";
				response.setText("0");}
				else {
			totalNum = totalNum.substring(0, (totalNum.length()-1)); 
			BigDecimal bdNum3 = new BigDecimal(totalNum);
			response.setText(df.format(bdNum3));}
		}//end if statement
		}); //end method setOnAction()
		
		//button clear action event
		btnclear.setOnAction((ae) -> {
		num1 = null;
		num2 = null;
		//if (totalNum != null)
			totalNum = null; 
			response.setText("Numbers erased!");
		}); //end method setOnAction()
		
		//button ÷ action event
		btndiv.setOnAction((ae) -> {
			if(totalNum == "") {
				response.setText("Please enter a number & operation");
				} //end if statement
			else if(num1 == null) {
				num1 = totalNum;
			totalNum = "";
			operation1 = "divide";
			}//end if statement
			else if(num1 != null && num1 != "" && num2 == null) {	
				num2 = totalNum;
				totalNum = null;
				operation1 = "divide";
				BigDecimal bdNum1 = new BigDecimal(num1);
				BigDecimal bdNum2 = new BigDecimal(num2);
				answer1 = operation.math1((bdNum1), (bdNum2), operation1);
				response.setText(df.format(answer1));
				num1 = answer1.toString();
				num2 = null;
			} //end else if statement
		});	//end method setOnAction()
		
		//button + action event
		btnplus.setOnAction((ae) -> {
			if( totalNum == "") {
				response.setText("Please enter a number & operation");
				} //end if statement
			else if(num1 == null) {
				num1 = totalNum;
			totalNum = "";
			operation1 = "addition";
			}//end if statement
			else if(num1 != null && num1 != "" && num2 == null) {		
				num2 = totalNum;
				totalNum = null;
				operation1 = "addition";
				BigDecimal bdNum1 = new BigDecimal(num1);
				BigDecimal bdNum2 = new BigDecimal(num2);
				answer1 = operation.math1((bdNum1), (bdNum2), operation1);
				response.setText(df.format(answer1));
				num1 = answer1.toString();
				num2 = null;
				} //end else if statement
			});	//end method setOnAction()

		//button - action event (subtract)
		btnminus.setOnAction((ae) -> {
			if( totalNum == "") {
				response.setText("Please enter a number & operation");
				} //end if statement
			else if(num1 == null) {
				num1 = totalNum;
			totalNum = "";
			operation1 = "subtraction";
			} //end if statement
			else if(num1 != null && num1 != "" && num2 == null) {		
				num2 = totalNum;
				totalNum = null;
				operation1 = "subtraction";
				BigDecimal bdNum1 = new BigDecimal(num1);
				BigDecimal bdNum2 = new BigDecimal(num2);
				answer1 = operation.math1((bdNum1), (bdNum2), operation1);
				response.setText(df.format(answer1));
				num1 = answer1.toString();
				num2 = null;
				num1 = answer1.toString();
				num2 = null;				
				} //end else if statement
			}); //end method setOnAction()
		
		//button X action event (multiply)
		btnmult.setOnAction((ae) -> {
			if( totalNum == "") {
				response.setText("Please enter a number & operation");
				} //end if statement
			else if(num1 == null) {
				num1 = totalNum;
			totalNum = "";
			operation1 = "multiply";
			} //end if statement
			else if(num1 != null && num1 != "" && num2 == null) {		
				num2 = totalNum;
				totalNum = null;	
				operation1 = "multiply";
				BigDecimal bdNum1 = new BigDecimal(num1);
				BigDecimal bdNum2 = new BigDecimal(num2);
				answer1 = operation.math1((bdNum1), (bdNum2), operation1);
				response.setText(df.format(answer1));
				num1 = answer1.toString();
				num2 = null;
			} //end else if statement
		}); //end method setOnAction()
		
		//button btnequal action event (equals)
		btnequal.setOnAction((ae) -> {
			if(num1 == null || totalNum == "") {
			response.setText("Please enter a number & operation");
			} //end if statement
			else if(operation1 == null) {
				response.setText("Please enter a number & operation");
			}//end else if statement
			else if (num1 != null && num2 == null) {
				num2 = totalNum;
				System.out.println("\ntotalNum = " + totalNum + "\n num1: " + num1 + "\nnum2 = " + num2);
				BigDecimal bdNum1 = new BigDecimal(num1);
				BigDecimal bdNum2 = new BigDecimal(num2);
				answer1 = operation.math1((bdNum1), (bdNum2), operation1);			
				response.setText(df.format(answer1));				
				num2 = null;
				num1 = null;				
				totalNum = answer1.toString();			
			} //end else if statement
		}); //end method setOnAction()		
	
	// Add all buttons and response label to the rootNode (name, col, row, length of col, length of row)
	rootNode.add(response, 0, 0, 4, 1);	
	rootNode.add(btnclear, 0, 1, 2, 1);
	rootNode.add(btndel, 2, 1, 1, 1);
	rootNode.add(btndiv, 3, 1, 1, 1);	
	rootNode.add(btnSev, 0, 2, 1, 1);
	rootNode.add(btneigh, 1, 2, 1, 1);
	rootNode.add(btnnine, 2, 2, 1, 1);
	rootNode.add(btnmult, 3, 3, 1, 1);
	rootNode.add(btnFour, 0, 3, 1, 1);
	rootNode.add(btnFive, 1, 3, 1, 1);
	rootNode.add(btnSix, 2, 3, 1, 1);
	rootNode.add(btnminus, 3, 2, 1, 1);
	rootNode.add(btnOne, 0, 4, 1, 1);
	rootNode.add(btnTwo, 1, 4, 1, 1);
	rootNode.add(btnThree, 2, 4, 1, 1);
	rootNode.add(btnplus, 3, 4, 1, 1);
	rootNode.add(btnplusneg, 0, 5, 1, 1);
	rootNode.add(btnZero, 1, 5, 1, 1);
	rootNode.add(btndec, 2, 5, 1, 1);
	rootNode.add(btnequal, 3, 5, 1, 1);

	//Show the stage and its scene
	myStage.show();		
	
}//end method start()
}//end class JavaFXEventDemo