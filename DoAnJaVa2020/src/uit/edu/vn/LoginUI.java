package uit.edu.vn;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField passPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
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
	public LoginUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel pnLogin = new JPanel();
		contentPane.add(pnLogin);
		pnLogin.setLayout(new BoxLayout(pnLogin, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		pnLogin.add(panel_3);
		
		JLabel lblTieuDe = new JLabel("LOGIN");
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setFont(new Font("SVN-Avo", Font.BOLD, 17));
		panel_3.add(lblTieuDe);
		
		JPanel panel_4 = new JPanel();
		pnLogin.add(panel_4);
		
		txtUser = new JTextField();
		txtUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_TAB)
				{
					passPass.setText("");
					passPass.setEchoChar('*');
				}
				
			}
			
		});
		txtUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUser.setText("");
			}
		});
		txtUser.setText("@username");
		txtUser.setHorizontalAlignment(SwingConstants.CENTER);
		txtUser.setFont(new Font("SVN-Avo", Font.ITALIC, 12));
		txtUser.setColumns(20);
		panel_4.add(txtUser);
		
		JPanel panel_5 = new JPanel();
		pnLogin.add(panel_5);
		
		passPass = new JPasswordField("@password");
		passPass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
					
					ManageUI ui=new ManageUI();
					ui.show();
					dispose();
				}
			}
		});
		passPass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passPass.setText("");
				passPass.setEchoChar('●');
			}
		});
		passPass.setEchoChar((char)0);
		passPass.setHorizontalAlignment(SwingConstants.CENTER);
		passPass.setFont(new Font("Dialog", Font.ITALIC, 12));
		passPass.setColumns(20);
		panel_5.add(passPass);
		
		JPanel panel_6 = new JPanel();
		pnLogin.add(panel_6);
		
		JButton btnDangNhap = new JButton("GO!");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageUI ui=new ManageUI();
				ui.show();
				dispose();
			}
		});
		btnDangNhap.setForeground(Color.WHITE);
		btnDangNhap.setFont(new Font("SVN-Avo", Font.BOLD, 13));
		panel_6.add(btnDangNhap);
		
		JPanel pnTKMK = new JPanel();
		contentPane.add(pnTKMK);
		pnTKMK.setLayout(new BoxLayout(pnTKMK, BoxLayout.X_AXIS));
		
		JPanel pnChucNang = new JPanel();
		pnTKMK.add(pnChucNang);
		pnChucNang.setLayout(new BoxLayout(pnChucNang, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(0);
		flowLayout.setHgap(0);
		pnChucNang.add(panel);
		
		JButton btnGoogle = new JButton("");
		panel.add(btnGoogle);
		btnGoogle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGoogle.setBackground(Color.WHITE);
		btnGoogle.setIcon(new ImageIcon("hinh\\google.png"));
		btnGoogle.setFont(new Font("SVN-Avo", Font.BOLD | Font.ITALIC, 11));
		
		JPanel panel_1 = new JPanel();
		pnChucNang.add(panel_1);
		
		JButton btnFacebook = new JButton("");
		panel_1.add(btnFacebook);
		btnFacebook.setBackground(Color.WHITE);
		btnFacebook.setIcon(new ImageIcon("hinh\\facebook.png"));
		btnFacebook.setFont(new Font("SVN-Avo", Font.BOLD | Font.ITALIC, 11));
		
		JPanel panel_2 = new JPanel();
		pnChucNang.add(panel_2);
		
		JLabel lblCreat = new JLabel("Creat an Account");
		panel_2.add(lblCreat);
		lblCreat.setForeground(Color.DARK_GRAY);
		lblCreat.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreat.setFont(new Font("SVN-Avo", Font.BOLD, 12));
		lblCreat.setBackground(Color.WHITE);
		btnFacebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desktop browser =Desktop.getDesktop();
				try {
				browser.browse(new URI("https://www.facebook.com/"));
				}
				catch(IOException err)
				{
				}
				catch (URISyntaxException err){
				}
			}
			
		});
	}

}
