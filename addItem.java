package code;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import code.pippo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.util.*;
public class addItem extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	protected static GraphicsConfiguration pippo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addItem frame = new addItem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param pippo 
	 */
	public addItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelQueueCommand = new JPanel();
		panelQueueCommand.setBackground(Color.RED);
		panelQueueCommand.setBounds(6, 6, 198, 128);
		contentPane.add(panelQueueCommand);
		panelQueueCommand.setLayout(null);
		
		JButton dequeueButton = new JButton("dequeue");
		dequeueButton.setBounds(6, 6, 186, 29);
		panelQueueCommand.add(dequeueButton);
		
		JButton peekButton = new JButton("peek");
		peekButton.setBounds(6, 47, 186, 29);
		panelQueueCommand.add(peekButton);
		
		JButton enqueueButton = new JButton("enqueue");
		enqueueButton.setBounds(6, 86, 186, 29);
		panelQueueCommand.add(enqueueButton);
		
		textField = new JTextField();
		textField.setBounds(216, 6, 196, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("dato da inserire");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(226, 44, 186, 26);
		contentPane.add(lblNewLabel);
		
		JButton stampaButton = new JButton("STAMPA CODA");
		stampaButton.setBounds(130, 172, 214, 68);
		contentPane.add(stampaButton);
		
		JRadioButton rdbtnInt = new JRadioButton("INT");
		rdbtnInt.setBounds(250, 82, 54, 23);
		contentPane.add(rdbtnInt);
		
		JRadioButton rdbtnStr = new JRadioButton("STR");
		rdbtnStr.setBounds(303, 82, 55, 23);
		contentPane.add(rdbtnStr);
		
		ActionListener enqueue = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rdbtnStr.isSelected()) {
					code.pippo.coda.enqueue(textField.getText());
				}
				else if(rdbtnInt.isSelected()){
					int value = Integer.parseInt(textField.getText());
					code.pippo.coda.enqueue(value);
					
				}
				
			}
			
		};
		//creazione enqueue
		enqueueButton.addActionListener(enqueue);
		
		ActionListener dequeue = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				code.pippo.coda.dequeue();
			}
			
		};
		//creazione dequeue
		dequeueButton.addActionListener(dequeue);
		
		ActionListener peek = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(peekButton, "ITEM = " + code.pippo.coda.peek());
			}
			
		};
		//set peek
		peekButton.addActionListener(peek);
		
		//creazione stampa
		ActionListener stampa = new ActionListener() {
			ArrayList <Object> lista = new ArrayList<Object>();
			String ritorno = "";
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				while(!code.pippo.coda.isEmpty()) {
					code.pippo.coda.dequeue();
					lista.add(code.Coda.ciccio);
					ritorno += code.Coda.ciccio.toString()+" ";
					
					
					
					
					
				}
				JOptionPane.showMessageDialog(peekButton, "CODA = " + ritorno);	
			}
			
		};
		stampaButton.addActionListener(stampa);
	}
}
