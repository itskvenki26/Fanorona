
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Canvas;

public class MainMenu {

	// All windows for the Game
	private JFrame frmMainMenu;	
	private GameSelect gameSelect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// initialize all windows and set button functions
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("Main Menu");
		frmMainMenu.setBounds(100, 100, 358, 329);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);		
		
		gameSelect = new GameSelect();
		
		// title
		JLabel lblFed = new JLabel("Fanorona!");
		lblFed.setHorizontalAlignment(SwingConstants.CENTER);
		lblFed.setToolTipText("");
		lblFed.setBounds(10, 53, 320, 37);
		lblFed.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frmMainMenu.getContentPane().add(lblFed);
		
		// new game button allows the user to select game type
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameSelect.setVisible(true);
			}
		});
		btnNewGame.setBounds(10, 149, 161, 58);
		btnNewGame.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmMainMenu.getContentPane().add(btnNewGame);	
	
		
		// quit button exits the application
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnQuit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnQuit.setBounds(169, 149, 161, 58);
		frmMainMenu.getContentPane().add(btnQuit);
	}
}
