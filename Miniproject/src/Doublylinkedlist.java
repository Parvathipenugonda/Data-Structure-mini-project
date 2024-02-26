import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doublylinkedlist extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField dlist;
	private JTextField dlist1;
	private JTextField displaybox;
	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doublylinkedlist frame = new Doublylinkedlist();
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
	public Doublylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 523);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(197, 32, 309, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1.setForeground(new Color(148, 0, 211));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(86, 110, 159, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT :");
		lblNewLabel_1_1.setForeground(new Color(148, 0, 211));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_1.setBounds(86, 176, 159, 18);
		contentPane.add(lblNewLabel_1_1);
		
		dlist = new JTextField();
		dlist.setBounds(266, 108, 96, 19);
		contentPane.add(dlist);
		dlist.setColumns(10);
		
		dlist1 = new JTextField();
		dlist1.setColumns(10);
		dlist1.setBounds(266, 174, 96, 19);
		contentPane.add(dlist1);
		
		JButton btnNewButton = new JButton("INSERT REAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				
				int elem=Integer.valueOf(dlist.getText());
				String message="element inserted rear successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				dlist.setText("");
				Node newnode=new Node();
				newnode.prelink=null;
				newnode.data=elem;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					
				
				temp.nextlink=newnode;
				newnode.prelink=temp;
				}
			}
		});
		btnNewButton.setForeground(new Color(255, 20, 147));
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setBounds(409, 107, 127, 27);
		contentPane.add(btnNewButton);
		
		JButton btnInsertFront = new JButton("INSERT FRONT");
		btnInsertFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(dlist1.getText());
				String message="element inserted front successfully";
				JOptionPane.showMessageDialog(contentPane, message);
				dlist1.setText("");
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
			}
		});
		btnInsertFront.setForeground(new Color(255, 20, 147));
		btnInsertFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsertFront.setBounds(409, 172, 139, 27);
		contentPane.add(btnInsertFront);
		
		JButton btnDeleteRear = new JButton("DELETE REAR");
		btnDeleteRear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
						
					}
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+temp.nextlink.data);
					temp.nextlink=null;
				}
			}
		});
		btnDeleteRear.setForeground(new Color(30, 144, 255));
		btnDeleteRear.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteRear.setBounds(266, 231, 129, 27);
		contentPane.add(btnDeleteRear);
		
		JButton btnDeleteFront = new JButton("DELETE FRONT");
		btnDeleteFront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+first.data);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		btnDeleteFront.setForeground(new Color(30, 144, 255));
		btnDeleteFront.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDeleteFront.setBounds(266, 285, 141, 27);
		contentPane.add(btnDeleteFront);
		
		JButton btnDisplayforword = new JButton("DISPLAYFORWORD");
		btnDisplayforword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}
					displaybox.setText(msg);
				}
			}
		});
		btnDisplayforword.setForeground(new Color(255, 20, 147));
		btnDisplayforword.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayforword.setBounds(135, 346, 171, 27);
		contentPane.add(btnDisplayforword);
		
		JButton btnDisplayReverse = new JButton("DISPLAY REVERSE");
		btnDisplayReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, first.data);
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					  
					}
					displaybox.setText(msg);
				}
			}
			
		});
		btnDisplayReverse.setForeground(new Color(255, 20, 147));
		btnDisplayReverse.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplayReverse.setBounds(359, 346, 161, 27);
		contentPane.add(btnDisplayReverse);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(127, 418, 455, 19);
		contentPane.add(displaybox);
	}

}
