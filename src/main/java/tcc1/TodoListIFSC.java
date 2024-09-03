package tcc1;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.JProgressBar;

public class TodoListIFSC extends JFrame {
	
	JProgressBar progressBar = new JProgressBar();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TodoListIFSC frame = new TodoListIFSC();
					URL caminhoImagem = this.getClass().getResource("IfscLogo.png");
					Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
					
					frame.setIconImage(iconeTitulo);
					
					

					// ("C:Users/Athay/OneDrive/Imagens/Capturas de tela/Ifsc.png");
					frame.setTitle("IFSC-Eventos");
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
	public TodoListIFSC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 592);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ButtonSearch = new JButton("Search");
		ButtonSearch.setBackground(Color.WHITE);
		ButtonSearch.setIcon(new ImageIcon("C:\\Users\\Athay\\Downloads\\material-symbols_search.png"));
		ButtonSearch.setBounds(35, 21, 281, 50);
		contentPane.add(ButtonSearch);
		
		
		progressBar.setBounds(35, 102, 500, 50);
		progressBar.setStringPainted(true);
		Temporizador t = new Temporizador();
//		progressBar.setValue();
		progressBar.setMaximum(1000);
		progressBar.setForeground(Color.GREEN);
		contentPane.add(progressBar);
		
	}
	
	public class Temporizador extends Thread {
		public void run() {
			while(progressBar.getValue() <= 1000) {
				progressBar.setValue((progressBar.getValue()) + 5);
			}
			
			
		}
	}
	
	
}
