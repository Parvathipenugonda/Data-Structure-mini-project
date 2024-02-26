import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField csize;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(196, 34, 275, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(89, 115, 145, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_1_1.setForeground(new Color(139, 0, 139));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(84, 214, 150, 18);
		contentPane.add(lblNewLabel_1_1);
		
		csize = new JTextField();
		csize.setBackground(new Color(192, 192, 192));
		csize.setBounds(256, 113, 96, 19);
		contentPane.add(csize);
		csize.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBackground(Color.LIGHT_GRAY);
		element.setBounds(256, 212, 96, 19);
		contentPane.add(element);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBackground(Color.LIGHT_GRAY);
		displaybox.setBounds(166, 404, 385, 19);
		contentPane.add(displaybox);
		
		JButton cqueue = new JButton("CREATE QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(csize.getText());
				cq=new int[size];
				String message="circularqueue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		cqueue.setForeground(new Color(139, 69, 19));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		cqueue.setBounds(256, 162, 143, 27);
		contentPane.add(cqueue);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insertion not possible");
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					String message="element inserted successfully";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		btnInsert.setForeground(new Color(218, 112, 214));
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsert.setBounds(362, 211, 143, 27);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
					
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible"+cq[f]);
					f=(f+1)%size;
					count--;
				}
			}
		});
		btnDelete.setForeground(new Color(255, 20, 147));
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(240, 274, 143, 27);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				int f1=f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(127, 255, 0));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(240, 331, 143, 27);
		contentPane.add(btnDisplay);
	}

}
