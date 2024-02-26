import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATAsTRUCTUR");
		lblNewLabel.setForeground(new Color(255, 20, 147));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(136, 28, 185, 19);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Array().setVisible(true);
			}
		});
		array.setFont(new Font("Constantia", Font.PLAIN, 14));
		array.setForeground(new Color(255, 0, 0));
		array.setBounds(180, 81, 79, 27);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Stack().setVisible(true);
			}
		});
		stack.setFont(new Font("Constantia", Font.PLAIN, 14));
		stack.setForeground(new Color(0, 0, 205));
		stack.setBounds(72, 120, 77, 27);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(128, 0, 0));
		queue.setFont(new Font("Constantia", Font.PLAIN, 14));
		queue.setBounds(288, 120, 81, 27);
		contentPane.add(queue);
		
		JButton circularqueue = new JButton("CIRCULARQUEUE");
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
			}
		});
		circularqueue.setForeground(new Color(220, 20, 60));
		circularqueue.setFont(new Font("Constantia", Font.PLAIN, 14));
		circularqueue.setBounds(39, 169, 151, 27);
		contentPane.add(circularqueue);
		
		JButton singlylinkedlist = new JButton("SINGLYLINKEDLIST");
		singlylinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Singlylinkedlist().setVisible(true);
				
			}
		});
		singlylinkedlist.setForeground(new Color(0, 0, 205));
		singlylinkedlist.setFont(new Font("Constantia", Font.PLAIN, 14));
		singlylinkedlist.setBounds(263, 169, 163, 27);
		contentPane.add(singlylinkedlist);
		
		JButton dlinkedlist = new JButton("DOUBLYLINKEDLIST");
		dlinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Doublylinkedlist().setVisible(true);
			}
		});
		dlinkedlist.setForeground(new Color(85, 107, 47));
		dlinkedlist.setFont(new Font("Constantia", Font.PLAIN, 14));
		dlinkedlist.setBounds(150, 215, 171, 27);
		contentPane.add(dlinkedlist);
	}
}
