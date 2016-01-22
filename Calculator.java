import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JavaCalculator extends JFrame {
    private JButton jbtNum1;
    private JButton jbtNum2;
    private JButton jbtNum3;
    private JButton jbtNum4;
    private JButton jbtNum5;
    private JButton jbtNum6;
    private JButton jbtNum7;
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;
    private JButton jbtAdd;
    private JButton jbtSubtract;
    private JButton jbtMultiply;
    private JButton jbtDivide;
    private JButton jbtSolve;
    private JButton jbtClear;
    private JButton jbtDot;
    private JButton jbtDEL;
    private double TEMP;
    private double SolveTEMP;
    private JTextField jtfResult;
    private JPanel content;

    Boolean addBool = false ;
	Boolean subBool = false ;
	Boolean divBool = false ;
	Boolean mulBool = false ;
	Boolean dot = false;
	Boolean Multi = false;
	String display = "";
	static double TEMPSolveTEMP;

	public JavaCalculator() {
	    //Creating and positioning GUI    
	    jbtNum1 = new JButton("1");
	    jbtNum2 = new JButton("2");
	    jbtNum3 = new JButton("3");
	    jbtNum4 = new JButton("4");
	    jbtNum5 = new JButton("5");
	    jbtNum6 = new JButton("6");
	    jbtNum7 = new JButton("7");
	    jbtNum8 = new JButton("8");
	    jbtNum9 = new JButton("9");
	    jbtNum0 = new JButton("0");
	    jbtClear = new JButton("AC");
	    jbtDEL = new JButton("DEL");
	    jbtDot = new JButton(".");
	    
	    jtfResult = new JTextField(25);
	    jtfResult.setEditable(false);
	    
	    jbtAdd = new JButton("+");
	    jbtSubtract = new JButton("-");
	    jbtMultiply = new JButton("*");
	    jbtDivide = new JButton("/");
	    jbtSolve = new JButton("=");
	    
	    Dimension BtnNum = new Dimension(74,25);
	    jbtNum1.setPreferredSize(BtnNum);
	    jbtNum2.setPreferredSize(BtnNum);
	    jbtNum3.setPreferredSize(BtnNum);
	    jbtNum4.setPreferredSize(BtnNum);
	    jbtNum5.setPreferredSize(BtnNum);
	    jbtNum6.setPreferredSize(BtnNum);
	    jbtNum7.setPreferredSize(BtnNum);
	    jbtNum8.setPreferredSize(BtnNum);
	    jbtNum9.setPreferredSize(BtnNum);
	    jbtNum0.setPreferredSize(BtnNum);
	    jbtDEL.setPreferredSize(BtnNum);	    
	    jbtDot.setPreferredSize(BtnNum);
	    
	    Dimension BtnOperator = new Dimension(50,25);
	    jbtAdd.setPreferredSize(BtnOperator);
	    jbtSubtract.setPreferredSize(BtnOperator);
	    jbtMultiply.setPreferredSize(BtnOperator);
	    jbtDivide.setPreferredSize(BtnOperator);
	    jbtSolve.setPreferredSize(BtnOperator);
	    
	    Dimension BtnEquals = new Dimension(153,25);
	    jbtSolve.setPreferredSize(BtnEquals);
	    
	    Dimension BtnCler = new Dimension(129,25);
	    jbtClear.setPreferredSize(BtnCler);
	    
	    content = new JPanel();
	    content.setLayout(new FlowLayout());
	    content.add(jtfResult, BorderLayout.NORTH);
	    content.add(jbtNum1);
	    content.add(jbtNum2);
	    content.add(jbtNum3);
	    
	    content.add(jbtAdd);
	    
	    content.add(jbtNum4);
	    content.add(jbtNum5);
	    content.add(jbtNum6);
	    
	    content.add(jbtSubtract);
	    
	    content.add(jbtNum7);
	    content.add(jbtNum8);
	    content.add(jbtNum9);
	    
	    content.add(jbtMultiply);
	    
	    content.add(jbtDot);
	    content.add(jbtNum0);
	    content.add(jbtDEL);
	    
	    content.add(jbtDivide);
	    
	    content.add(jbtSolve);
	    content.add(jbtClear);
	    
	    this.setContentPane(content);
	   	
	    //Set Action Listeners to buttons 
	    jbtNum1.addActionListener(new ListenToOne());
	    jbtNum2.addActionListener(new ListenToTwo());
	    jbtNum3.addActionListener(new ListenToThree());
	    jbtNum4.addActionListener(new ListenToFour());
	    jbtNum5.addActionListener(new ListenToFive());
	    jbtNum6.addActionListener(new ListenToSix());
	    jbtNum7.addActionListener(new ListenToSeven());
	    jbtNum8.addActionListener(new ListenToEight());
	    jbtNum9.addActionListener(new ListenToNine());
	    jbtNum0.addActionListener(new ListenToZero());
	    jbtDEL.addActionListener(new ListenToDel());
	    jbtAdd.addActionListener(new ListenToAdd());
	    jbtSubtract.addActionListener(new ListenToSubtract());
	    jbtMultiply.addActionListener(new ListenToMultiply());
	    jbtDivide.addActionListener(new ListenToDivide());
	    jbtDot.addActionListener(new ListenToDot());
	    jbtSolve.addActionListener(new ListenToSolve());
	    jbtClear.addActionListener(new ListenToClear());
	
	
	
	}
	
	//Creating Clear Button Function 
	class ListenToClear implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        jtfResult.setText("");
	        addBool = false ;
	        subBool = false ;
	        mulBool = false ;
	        divBool = false ;
	        dot = false;
	        Multi = false;
	
	        TEMP = 0;
	        SolveTEMP =0 ;
	        
	        
	    	
	    }
	}
	
	//When clicking del button
	class ListenToDel implements ActionListener {
		public void actionPerformed(ActionEvent evt){
			if(jtfResult.getText().length()>0){
				jtfResult.setText(jtfResult.getText().substring(0,jtfResult.getText().length()-1));
			}
		}
	}

	//when Clicking Button 1
	class ListenToOne implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "1");
	    }
	}
	
	//when Clicking Button 2
	class ListenToTwo implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "2");
	    }
	}
	
	//when Clicking Button 3
	class ListenToThree implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "3");
	    }
	}
	
	//when Clicking Button 4
	class ListenToFour implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "4");
	    }
	}
	
	//when Clicking Button 5
	class ListenToFive implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "5");
	    }
	}
	
	//when Clicking Button 6
	class ListenToSix implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "6");
	    }
	}
	
	//when Clicking Button 7
	class ListenToSeven implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "7");
	    }
	}
	
	//when Clicking Button 8
	class ListenToEight implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "8");
	    }
	}
	
	//when Clicking Button 9
	class ListenToNine implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "9");
	    }
	}
	
	//when Clicking Button 0
	class ListenToZero implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        display = jtfResult.getText();
	        jtfResult.setText(display + "0");
	    }
	}

	////when Clicking Button + 
    class ListenToAdd implements ActionListener {
    	public void actionPerformed(ActionEvent e) {    		
    		TEMP = Double.parseDouble(jtfResult.getText());
            jtfResult.setText("");
            addBool = true ;
            dot = false;
    	}
	}
    
  //when Clicking Button -
	class ListenToSubtract implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        TEMP = Double.parseDouble(jtfResult.getText());
	        jtfResult.setText("");
	        subBool =true;
	        dot = false;
	    }
	}
	
	//when Clicking Button *
	class ListenToMultiply implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        TEMP = Double.parseDouble(jtfResult.getText());
	        jtfResult.setText("");
	        mulBool =true;
	        dot = false;
	
	    }
	}
	
	//when Clicking Button /
	class ListenToDivide implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        TEMP = Double.parseDouble(jtfResult.getText());
	        jtfResult.setText("");
	        divBool =true;
	        dot = false;
	    }
	}
	
	//when Clicking Button . 
	class ListenToDot implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	if(dot == false){
	    		display = jtfResult.getText();
	    		jtfResult.setText(display + ".");
	    		dot = true;
	    	}
	    }
	}
	
	//when Clicking Button =
	class ListenToSolve implements ActionListener {		
	    public void actionPerformed(ActionEvent e) {
	    	
	    	if( Multi == false){
	    		TEMPSolveTEMP = Double.parseDouble(  jtfResult.getText() );
	    		SolveTEMP = Double.parseDouble(  jtfResult.getText() );
		        if ( addBool == true  ){
		        	SolveTEMP = TEMP + SolveTEMP;
		        }else if ( subBool == true  ){
		            SolveTEMP = TEMP - SolveTEMP;
		        }else if ( mulBool == true  ){
		            SolveTEMP = TEMP * SolveTEMP;
		        }else if ( divBool == true  ){
		        	SolveTEMP = TEMP / SolveTEMP;
		        }
		        Multi = true;



	    	}else{
	    		SolveTEMP = Double.parseDouble(  jtfResult.getText() );
		        if ( addBool == true  ){
		        	SolveTEMP = SolveTEMP + TEMPSolveTEMP;
		        }else if ( subBool == true  ){
		        	SolveTEMP = SolveTEMP - TEMPSolveTEMP;
		        }else if ( mulBool == true  ){
		        	SolveTEMP = SolveTEMP * TEMPSolveTEMP;
		        }else if ( divBool == true  ){
		        	SolveTEMP = SolveTEMP / TEMPSolveTEMP;
		        }	
	    	}
	    	jtfResult.setText(  Double.toString( SolveTEMP ) );
	    }
	}
	
    
    public static void main(String[] args) {
        JavaCalculator calc = new JavaCalculator();
        calc.setSize(300, 210);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
        calc.setResizable(false);
        calc.setLocationRelativeTo(null);       
    }    
}