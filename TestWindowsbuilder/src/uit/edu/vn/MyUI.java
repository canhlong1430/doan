package uit.edu.vn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.ImageIcon;

public class MyUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHsa;
	private JTextField txtHsb;
	private JTextField txtKetqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyUI frame = new MyUI();
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
	public MyUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 342);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnuFile = new JMenu("File");
		menuBar.add(mnuFile);
		mnuFile.addSeparator();
		
		JMenuItem mnuFileNew = new JMenuItem("New");
		mnuFileNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtHsa.setText(null);
				txtHsb.setText(null);
				txtKetqua.setText(null);
			}
		});
		mnuFile.add(mnuFileNew);
		
		JMenuItem mnuFileExit = new JMenuItem("Exit");
		mnuFileExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); 				
			}
		});
		mnuFile.add(mnuFileExit);
		
		JMenu mnuEdit = new JMenu("Edit");
		menuBar.add(mnuEdit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Giải Phương Trình Bậc 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.ORANGE);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập hệ số a:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_1);
		
		txtHsa = new JTextField();
		panel_1.add(txtHsa);
		txtHsa.setColumns(15);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		JLabel lblHsb = new JLabel("Nhập hệ số b:");
		lblHsb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblHsb);
		
		txtHsb = new JTextField();
		panel_2.add(txtHsb);
		txtHsb.setColumns(15);
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4);
		
		JLabel lblKetqua = new JLabel("Kết quả: ");
		lblKetqua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_4.add(lblKetqua);
		
		txtKetqua = new JTextField();
		panel_4.add(txtKetqua);
		txtKetqua.setColumns(15);
		txtKetqua.setEditable(false);
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3);
		
		lblKetqua.setPreferredSize(lblHsb.getPreferredSize());
		JButton btnNewButton = new JButton("Giải");
		btnNewButton.setIcon(new ImageIcon("D:\\Do An\\DuAnJava\\DuAnJava\\PJ_QuanLyThuVien\\Hinh\\login.png"));
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(btnNewButton);
		
		
		JButton btnThoat = new JButton("Thoat");
		btnThoat.setIcon(new ImageIcon("D:\\Do An\\DuAnJava\\DuAnJava\\PJ_QuanLyThuVien\\Hinh\\close.png"));
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnThoat.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(btnThoat);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				XuLyPhuongTrinh();

			}
		});
	}

	protected void XuLyPhuongTrinh() {
		// TODO Auto-generated method stub
		double a= Double.parseDouble(txtHsa.getText());
		double b= Double.parseDouble(txtHsb.getText());
		double kq=(float)(-b)/a;
		txtKetqua.setText(String.valueOf(kq));
	}

}
