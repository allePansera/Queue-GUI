package code;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class pippo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static Coda coda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pippo frame = new pippo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pippo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.YELLOW);
		buttonPanel.setBounds(41, 36, 166, 201);
		contentPane.add(buttonPanel);
		buttonPanel.setLayout(null);
		
		JButton queueSizeButton = new JButton("SET SIZE");
		queueSizeButton.setBounds(6, 19, 154, 36);
		buttonPanel.add(queueSizeButton);
		
		JButton switchInterfaceButton = new JButton("GO TO");
		switchInterfaceButton.setBounds(6, 101, 154, 29);
		buttonPanel.add(switchInterfaceButton);
		
		JPanel dataPanel = new JPanel();
		dataPanel.setBackground(Color.GREEN);
		dataPanel.setBounds(275, 36, 151, 45);
		contentPane.add(dataPanel);
		dataPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(0, 5, 151, 34);
		dataPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DIMENSIONE CODA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(241, 81, 225, 62);
		contentPane.add(lblNewLabel);
		
		ActionListener setsize = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int size = Integer.parseInt(textField.getText());
				coda = new Coda(size);
			}
			
		};
		//fine del set size della queue
		ActionListener ActionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addItem interfaccia = new addItem();
				interfaccia.setVisible(true);
				
			}
			
		};
		switchInterfaceButton.addActionListener(ActionListener);
		queueSizeButton.addActionListener(setsize);
	}
}
