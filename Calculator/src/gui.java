import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class gui extends JFrame{
	private JTextField answerShow;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinu, btnMult, btnDevi, btnEqul, btnCler;
	private JPanel content;
	
	public gui(){
		super("My Calculator"); //GUI Name
		answerShow = new JTextField(); //creating a object for JTextField
		answerShow.setPreferredSize( new Dimension( 230, 50 ) );
		answerShow.setEditable(false);		

		btnPlus = new JButton("+");
		btnMinu = new JButton("-");
		btnMult = new JButton("*");
		btnDevi = new JButton("/");
		btnEqul = new JButton("=");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btn0 = new JButton("0");
		btnCler = new JButton("Clear");

		Dimension BtnOperator = new Dimension(114,25);
		btnPlus.setPreferredSize(BtnOperator);
		btnMinu.setPreferredSize(BtnOperator);
		btnMult.setPreferredSize(BtnOperator);
		btnDevi.setPreferredSize(BtnOperator);
		btnCler.setPreferredSize(BtnOperator);
		btn0.setPreferredSize(BtnOperator);
		
		btnEqul.setPreferredSize(new Dimension( 230, 25 ));
		
		Dimension BtnNum = new Dimension(74,25);
		btn1.setPreferredSize(BtnNum);
		btn2.setPreferredSize(BtnNum);
		btn3.setPreferredSize(BtnNum);
		btn4.setPreferredSize(BtnNum);
		btn5.setPreferredSize(BtnNum);
		btn6.setPreferredSize(BtnNum);
		btn7.setPreferredSize(BtnNum);
		btn8.setPreferredSize(BtnNum);
		btn9.setPreferredSize(BtnNum);
		
		
		content = new JPanel(); //creating a object for JPanel
		content.setLayout(new FlowLayout());
		content.add(answerShow, BorderLayout.NORTH);
		content.add(btnPlus);
		content.add(btnMinu);
		content.add(btnMult);
		content.add(btnDevi);
		content.add(btnEqul);
		content.add(btn1);	
		content.add(btn2); 
		content.add(btn3); 	
		content.add(btn4);
		content.add(btn5);
		content.add(btn6);
		content.add(btn7);
		content.add(btn8);
		content.add(btn9);
		content.add(btn0);
		content.add(btnCler);
		this.setContentPane(content);
	}
	
}
