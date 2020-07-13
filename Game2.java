import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Game2{
	int count=0;
	JFrame frame;
	JLabel lab = new JLabel();
	JLabel lab2 = new JLabel();
	JLabel lab3 = new JLabel();
	JLabel lab4 = new JLabel();
	JLabel lab5 = new JLabel();
	JButton b1 = new JButton("Submit");
	JRadioButton op1,op2,opt3,opt4,opt5,opt6,opt7,opt8,opt9,opt10,opt11,opt12,opt13,opt14,opt15,opt16,opt17,opt18,opt19,opt20;
	ButtonGroup G1 = new ButtonGroup();
	ButtonGroup G2 = new ButtonGroup();
	ButtonGroup G3 = new ButtonGroup();
	ButtonGroup G4 = new ButtonGroup();
	ButtonGroup G5 = new ButtonGroup();
	public Game2(){	
		String name = JOptionPane.showInputDialog(frame,"Enter Name For Quiz");	
		if(!name.equals("")){
		frame = new JFrame("Quiz Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920,720);
		frame.setLayout(null);
		frame.setVisible(true);
		lab.setText("1. Who is the prime minister of India?");
		lab.setBounds(100,50,600,30);
		frame.add(lab);
		lab2.setText("2. Who is the Present RBI Governor in India?");
		lab2.setBounds(100,200,600,30);
		frame.add(lab2);
		lab3.setText("3. Who was the first Indian Scientist to win a Nobel Prize?");
		lab3.setBounds(100,350,600,30);
		frame.add(lab3);
		lab4.setText("4. Which of the following Desert is located India?");
		lab4.setBounds(100,500,600,30);
		frame.add(lab4);
		lab5.setText("5. MS Dhoni Scored 183* runs aganist which country?");
		lab5.setBounds(700,50,600,30);
		frame.add(lab5); 
		b1.setBounds(810,300,120,30);
		frame.add(b1);
		op1 = new JRadioButton();
		op1.setText("Narendra Modi");
		op1.setBounds(100,100,200,30);
		op2 = new JRadioButton();
		op2.setText("Rame Nath Kovind");
		op2.setBounds(100,150,200,30);
		opt3 = new JRadioButton();
		opt3.setText("Nirmala Sitharaman");
		opt3.setBounds(100,250,300,30);
		opt4 = new JRadioButton();
		opt4.setText("Raghuram Rajan");
		opt4.setBounds(100,300,300,30);
		opt5 = new JRadioButton();
		opt5.setText("CV Raman");
		opt5.setBounds(100,400,300,30);
		opt6 = new JRadioButton();
		opt6.setText("Amarty Sen");
		opt6.setBounds(100,450,300,30);
		opt7 = new JRadioButton();
		opt7.setText("Sahara Desert");
		opt7.setBounds(100,550,300,30);
		opt8 = new JRadioButton();
		opt8.setText("Gobi Desert");
		opt8.setBounds(100,600,300,30);
		opt9 = new JRadioButton();
		opt9.setText("Australia");
		opt9.setBounds(700,100,300,30);
		opt10 = new JRadioButton();
		opt10.setText("Westindes");
		opt10.setBounds(700,150,300,30);
		opt11 = new JRadioButton();
		opt11.setText("ShaktiKanth Das");
		opt11.setBounds(400,100,300,30);
		opt12 = new JRadioButton();
		opt12.setText("Pranab Mukherjee");
		opt12.setBounds(400,150,300,30);
		opt13 = new JRadioButton();
		opt13.setText("Urjit Patel");
		opt13.setBounds(400,250,300,30);
		opt14 = new JRadioButton();
		opt14.setText("ShaktiKanth Das");
		opt14.setBounds(400,300,300,30);
		opt15 = new JRadioButton();
		opt15.setText("Hargobind Khorana");
		opt15.setBounds(400,400,300,30);
		opt16 = new JRadioButton();
		opt16.setText("Subramanian Chrandrashekar");
		opt16.setBounds(400,450,300,30);
		opt17 = new JRadioButton();
		opt17.setText("Taklamankan Desert");
		opt17.setBounds(400,550,300,30);
		opt18 = new JRadioButton();
		opt18.setText("Thar Desert");
		opt18.setBounds(400,600,300,30);
		opt19 = new JRadioButton();
		opt19.setText("Sri Lanka");
		opt19.setBounds(1000,100,600,30);
		opt20 = new JRadioButton();
		opt20.setText("England");
		opt20.setBounds(1000,150,600,30);
		frame.add(op1);
		frame.add(op2);
		frame.add(opt3);
		frame.add(opt4);
		frame.add(opt5);
		frame.add(opt6);
		frame.add(opt7);
		frame.add(opt8);
		frame.add(opt9);
		frame.add(opt10);
		frame.add(opt11);
		frame.add(opt12);
		frame.add(opt13);
		frame.add(opt14);
		frame.add(opt15);
		frame.add(opt16);
		frame.add(opt17);
		frame.add(opt18);
		frame.add(opt19);
		frame.add(opt20);
		G1.add(op1);
		G1.add(op2);
		G1.add(opt11);
		G1.add(opt12);
		G2.add(opt3);
		G2.add(opt4);
		G2.add(opt13);
		G2.add(opt14);
		G3.add(opt5);
		G3.add(opt6);
		G3.add(opt15);
		G3.add(opt16);
		G4.add(opt7);
		G4.add(opt8);
		G4.add(opt17);
		G4.add(opt18);
		G5.add(opt9);
		G5.add(opt10);
		G5.add(opt19);
		G5.add(opt20);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				count=0;
				if(op1.isSelected()){
					count=count+1;
				}
				else if(op2.isSelected()){
				}
				else if(opt11.isSelected()){
				}
				else if(opt12.isSelected()){
				}
				if(opt3.isSelected()){
				}
				else if(opt4.isSelected()){
				}
				else if(opt13.isSelected()){
				}
				else if(opt14.isSelected()){
					count=count+1;
				}
				if(opt5.isSelected()){
					count=count+1;
				}
				else if(opt6.isSelected()){
				}
				else if(opt15.isSelected()){
				}
				else if(opt16.isSelected()){
				}
				if(opt7.isSelected()){
				}
				else if(opt8.isSelected()){
				}
				else if(opt17.isSelected()){
				}
				else if(opt18.isSelected()){
					count=count+1;
				}
				if(opt9.isSelected()){
				}
				else if(opt10.isSelected()){
					
				}
				else if(opt19.isSelected()){
					count=count+1;
				}
				else if(opt20.isSelected()){
				}
				String data = String.valueOf(count);
				JOptionPane.showMessageDialog(frame, name+" Your Score is "+data);
			}
		});
			
			}
			else
			{
			
				JOptionPane.showMessageDialog(frame,"please enter the name it is required....");	
			}
			
		
				

			}	

		public static void main(String[] args){
			Game2 g2 = new Game2();
		}







}