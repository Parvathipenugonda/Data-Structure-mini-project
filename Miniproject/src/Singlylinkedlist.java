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

public class Singlylinkedlist extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField rear;
	private JTextField front;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Singlylinkedlist frame = new Singlylinkedlist();
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
	public Singlylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 224));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(240, 40, 388, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT :");
		lblEnterTheElement.setForeground(new Color(139, 0, 139));
		lblEnterTheElement.setFont(new Font("Algerian", Font.BOLD, 16));
		lblEnterTheElement.setBackground(new Color(255, 255, 224));
		lblEnterTheElement.setBounds(45, 91, 190, 22);
		contentPane.add(lblEnterTheElement);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT :");
		lblEnterTheElement_1.setForeground(new Color(139, 0, 139));
		lblEnterTheElement_1.setFont(new Font("Algerian", Font.BOLD, 16));
		lblEnterTheElement_1.setBackground(new Color(255, 255, 224));
		lblEnterTheElement_1.setBounds(45, 155, 190, 22);
		contentPane.add(lblEnterTheElement_1);
		
		rear = new JTextField();
		rear.setBackground(new Color(176, 224, 230));
		rear.setBounds(258, 93, 96, 19);
		contentPane.add(rear);
		rear.setColumns(10);
		
		front = new JTextField();
		front.setColumns(10);
		front.setBackground(new Color(176, 224, 230));
		front.setBounds(258, 157, 96, 19);
		contentPane.add(front);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				
				int elem=Integer.valueOf(rear.getText());
				String message="element inserted rear successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				rear.setText("");
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link!=null)
					{
						temp=temp.link;
						
					}
					temp.link=newnode;
				}
			}
		});
		insertrear.setForeground(new Color(0, 0, 255));
		insertrear.setBackground(new Color(192, 192, 192));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 14));
		insertrear.setBounds(430, 92, 127, 27);
		contentPane.add(insertrear);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int elem=Integer.valueOf(front.getText());
				String message="element inserted front successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				front.setText("");
				Node newnode=new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
			}
		});
		btnInsertFront.setForeground(Color.BLUE);
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertFront.setBackground(Color.LIGHT_GRAY);
		btnInsertFront.setBounds(430, 156, 139, 27);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.link.link!=null)
					{
						temp=temp.link;
						
					}
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+temp.link.data);
					temp.link=null;
				}
			}
		});
		btnDeleteRear.setForeground(new Color(255, 69, 0));
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBackground(Color.LIGHT_GRAY);
		btnDeleteRear.setBounds(258, 221, 129, 27);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+first.data);
					first=first.link;
				}
			}
		});
		btnDeleteFront.setForeground(new Color(255, 69, 0));
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBackground(Color.LIGHT_GRAY);
		btnDeleteFront.setBounds(260, 273, 141, 27);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else if(first.link==null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.link;
					}	
					displaybox.setText(msg);
				}
				
			}
		});
		btnDisplay.setForeground(new Color(255, 20, 147));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBackground(Color.LIGHT_GRAY);
		btnDisplay.setBounds(272, 327, 127, 27);
		contentPane.add(btnDisplay);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(175, 238, 238));
		displaybox.setBounds(162, 408, 424, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
