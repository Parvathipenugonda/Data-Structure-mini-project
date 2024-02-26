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

public class Stack extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField stacksize;
	private JTextField push;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 16));
		lblNewLabel.setBounds(281, 32, 195, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheStacksize = new JLabel("ENTER THE STACKSIZE:");
		lblEnterTheStacksize.setForeground(Color.RED);
		lblEnterTheStacksize.setFont(new Font("Algerian", Font.BOLD, 16));
		lblEnterTheStacksize.setBounds(54, 94, 184, 22);
		contentPane.add(lblEnterTheStacksize);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setForeground(Color.RED);
		lblEnterAnElement.setFont(new Font("Algerian", Font.BOLD, 16));
		lblEnterAnElement.setBounds(43, 210, 195, 22);
		contentPane.add(lblEnterAnElement);
		
		stacksize = new JTextField();
		stacksize.setBounds(281, 96, 96, 19);
		contentPane.add(stacksize);
		stacksize.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				size=Integer.valueOf(stacksize.getText());
				s=new int[size];
				String message="stack of size "+size+" created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setForeground(new Color(0, 0, 139));
		stack.setFont(new Font("Constantia", Font.BOLD, 16));
		stack.setBounds(254, 146, 149, 29);
		contentPane.add(stack);
		
		push = new JTextField();
		push.setBounds(248, 212, 96, 19);
		contentPane.add(push);
		push.setColumns(10);
		
		JButton btnPush = new JButton("PUSH");
		btnPush.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "push not possible");
				}
				else
				{
					elem=Integer.valueOf(push.getText());
					++top;
					s[top]=elem;
					String message=" element pushed successfully";
					JOptionPane.showMessageDialog(contentPane, message);
					push.setText("");
				}
			}
		});
		btnPush.setForeground(new Color(255, 20, 147));
		btnPush.setFont(new Font("Constantia", Font.BOLD, 16));
		btnPush.setBounds(419, 211, 149, 29);
		contentPane.add(btnPush);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "pop not possible");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "element deleted is"+s[top]);
				    --top;
				}

			}
		});
		pop.setForeground(new Color(220, 20, 60));
		pop.setFont(new Font("Constantia", Font.BOLD, 16));
		pop.setBounds(254, 275, 149, 29);
		contentPane.add(pop);
		
		JButton Display = new JButton("DISPLAY");
		Display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "display not possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg=msg+""+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		Display.setForeground(new Color(128, 0, 0));
		Display.setFont(new Font("Constantia", Font.BOLD, 16));
		Display.setBounds(254, 339, 149, 29);
		contentPane.add(Display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(176, 196, 222));
		displaybox.setBounds(180, 436, 313, 19);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
