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

public class Queue extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField queuesize;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(238, 22, 192, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE :");
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(78, 99, 145, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT :");
		lblNewLabel_1_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(65, 209, 150, 18);
		contentPane.add(lblNewLabel_1_1);
		
		queuesize = new JTextField();
		queuesize.setBackground(new Color(192, 192, 192));
		queuesize.setBounds(238, 97, 96, 19);
		contentPane.add(queuesize);
		queuesize.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBackground(Color.LIGHT_GRAY);
		element.setBounds(238, 207, 96, 19);
		contentPane.add(element);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(queuesize.getText());
				q=new int[size];
				String message="queue of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setForeground(new Color(148, 0, 211));
		queue.setBounds(238, 150, 143, 27);
		contentPane.add(queue);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "insertion not possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					String message="element inserted successfully ";
					JOptionPane.showMessageDialog(contentPane, message);
					element.setText("");
				}
			}
		});
		btnInsert.setForeground(new Color(148, 0, 211));
		btnInsert.setFont(new Font("Constantia", Font.BOLD, 14));
		btnInsert.setBounds(379, 206, 143, 27);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "deletion not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+q[f]);
					++f;
				}
			}
		});
		btnDelete.setForeground(new Color(85, 107, 47));
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDelete.setBounds(223, 274, 143, 27);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "dispaly is not possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg=msg+""+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		btnDisplay.setForeground(new Color(128, 0, 0));
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 14));
		btnDisplay.setBounds(223, 326, 143, 27);
		contentPane.add(btnDisplay);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBackground(Color.LIGHT_GRAY);
		displaybox.setBounds(156, 404, 319, 19);
		contentPane.add(displaybox);
	}

}
