import javax.swing.JOptionPane;

	public class Rectangle {
	
	public static void main(String [] args ) {
	
String input = JOptionPane.showInputDialog("Enter the length value of the rectangle. ");
	
String input2 = JOptionPane.showInputDialog("Enter the width value of the rectangle. ");
		
	int width = Integer.parseInt(input2);
		
	int length =  Integer.parseInt(input); 
		
	int sum = width + length;
		
	int area = width * length; 
		
JOptionPane.showMessageDialog(null, "The perimeter value of the rectangle. is P= " + 2*sum );
		
JOptionPane.showMessageDialog(null, "The area value of the rectangle. is A= " + area );





	
	}

}	
