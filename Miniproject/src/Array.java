import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enterlength;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField display;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(139, 0, 139));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(283, 53, 203, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(108, 141, 166, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT");
		lblNewLabel_2.setForeground(new Color(255, 20, 147));
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_2.setBounds(36, 254, 210, 18);
		contentPane.add(lblNewLabel_2);
		
		enterlength = new JTextField();
		enterlength.setBackground(new Color(255, 250, 250));
		enterlength.setFont(new Font("Tahoma", Font.PLAIN, 10));
		enterlength.setBounds(307, 139, 96, 19);
		contentPane.add(enterlength);
		enterlength.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATEARRAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len=Integer.valueOf(enterlength.getText());
				arr=new int[len];
				String message="Array of length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnNewButton.setForeground(new Color(218, 112, 214));
		btnNewButton.setBackground(new Color(173, 255, 47));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(273, 189, 137, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("INSERT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="element "+elem+" inserted@position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_1.setBounds(575, 251, 85, 21);
		contentPane.add(btnNewButton_1);
		
		element = new JTextField();
		element.setBounds(243, 252, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_3.setBounds(358, 255, 73, 18);
		contentPane.add(lblNewLabel_3);
		
		insertposition = new JTextField();
		insertposition.setBounds(434, 252, 96, 19);
		contentPane.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ENTER THE POSITION");
		lblNewLabel_4.setForeground(new Color(255, 0, 255));
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_4.setBounds(76, 321, 157, 18);
		contentPane.add(lblNewLabel_4);
		
		deleteposition = new JTextField();
		deleteposition.setBounds(243, 319, 96, 19);
		contentPane.add(deleteposition);
		deleteposition.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="element deleted @ the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deleteposition.setText("");
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton_2.setBounds(391, 318, 87, 27);
		contentPane.add(btnNewButton_2);
		
		JButton displaybox = new JButton("DISPLAY");
		displaybox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				display.setText(msg);
			}
		});
		displaybox.setForeground(Color.BLUE);
		displaybox.setFont(new Font("Constantia", Font.BOLD, 14));
		displaybox.setBounds(316, 378, 93, 27);
		contentPane.add(displaybox);
		
		display = new JTextField();
		display.setBackground(new Color(144, 238, 144));
		display.setBounds(177, 465, 403, 19);
		contentPane.add(display);
		display.setColumns(10);
	}
}
