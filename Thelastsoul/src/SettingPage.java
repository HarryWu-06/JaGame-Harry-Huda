import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SettingPage extends JFrame implements ActionListener{
	ImageIcon gameIcon;
	JFrame frame = new JFrame();
	Container con;
	JPanel textPanel, inputPanel;
	JLabel textLabel;
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
	JTextField jtf;
	JButton skinB, gametime, bgmusic;
	JLabel titleS;
	JLabel authorS;
	
	Color green = new Color(43, 220, 20);
	
	public SettingPage() {
		gameIcon = new ImageIcon("images\\gameIcon.png");
		this.setIconImage(gameIcon.getImage());
		
		this.setTitle("The Last Soul");
		this.setSize(960, 640);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		
		
		inputPanel = new JPanel();
		inputPanel.setBounds(190, 550, 500, 50);
		inputPanel.setBackground(Color.pink);
		inputPanel.setLayout(new GridLayout(1,2));
		
		
		bgmusic = new JButton();
		bgmusic.setText("change background music");
		bgmusic.setFont(new Font("MV Boli", Font.BOLD, 12));
		bgmusic.setBounds(500, 300, 250, 60);
		bgmusic.setFocusable(false);
		bgmusic.setForeground(Color.black);
		
		skinB = new JButton();
		skinB.setText("change character/weapon skin");
		skinB.setFont(new Font("MV Boli", Font.BOLD, 12));
		skinB.setBounds(500, 380, 250, 60);
		skinB.setFocusable(false);
		skinB.setForeground(Color.black);

		
		gametime = new JButton("check game time");
		gametime.setFont(new Font("MV Boli", Font.BOLD, 18));
		gametime.setBounds(500, 460, 250, 60);
		gametime.setFocusable(false);
		gametime.setForeground(Color.black);
		
		titleS = new JLabel("Setting page");
		titleS.setFont(new Font("MV Boli", Font.BOLD, 95));
		titleS.setBounds(50, 70, 700, 100);
		authorS = new JLabel("- Harry Wu & Huda Huda Hameed");
		authorS.setFont(new Font("MV Boli", Font.BOLD, 30));
		authorS.setBounds(80, 150, 700, 100);
		
		frame.add(skinB);
		frame.add(gametime);
		frame.add(bgmusic);
		
		this.add(bgmusic);
		this.add(skinB);
		this.add(gametime);
		this.add(titleS);
		this.add(authorS);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.pink);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == bgmusic) {
			new Bgmusic();
			this.dispose();
		}
		else if(e.getSource() == skinB) {
			new Skin(); 
		}
		else if(e.getSource() == gametime) { 
			new Gametime();
		}
		
	}


}