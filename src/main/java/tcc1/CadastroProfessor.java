package tcc1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.sql.Date;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroProfessor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UsuarioTF;
	private JTextField emailTF;
	private JTextField senhaTF1;
	private JTextField CargoTF;
	private JTextField telefoneTF;
	private JTextField NomeCivilTF;
	private JTextField FaculdadeTF;
	private JTextField NomeSocialTF;
	private JTextField SexoTF;
	private JTextField DataNascimentoTF;
	private JTextField tipoSanguineoTF;
	private JTextField NaturalidadeTF;
	private JTextField NacionalidadeTF;
	private JLabel campoNacionalidadeJLbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroProfessor frame = new CadastroProfessor();
					URL caminhoImagem = this.getClass().getResource("IfscLogo.png");
					Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoImagem);
					
					frame.setIconImage(iconeTitulo);
					
					

					//("C:Users/Athay/OneDrive/Imagens/Capturas de tela/Ifsc.png");
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
	public CadastroProfessor() {
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 930, 765);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel logoIFSCJLbl = new JLabel("");
		logoIFSCJLbl.setIcon(new ImageIcon(CadastroProfessor.class.getResource("/tcc1/Ifsc.png")));
		logoIFSCJLbl.setBounds(10, 1, 280, 138);
		contentPane.add(logoIFSCJLbl);
		
		JLabel campoUsuarioJLbl = new JLabel("Usuário:");
		campoUsuarioJLbl.setBounds(136, 186, 69, 13);
		contentPane.add(campoUsuarioJLbl);
		
		UsuarioTF = new JTextField();
		UsuarioTF.setBounds(245, 183, 96, 19);
		contentPane.add(UsuarioTF);
		UsuarioTF.setColumns(10);
		
		JLabel TextoJLbl = new JLabel("Inscrição Professor / Técnico");
		TextoJLbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		TextoJLbl.setBounds(241, 126, 203, 13);
		contentPane.add(TextoJLbl);
		
		JLabel campoEmailJLbl = new JLabel("Email:");
		campoEmailJLbl.setBounds(136, 237, 45, 13);
		contentPane.add(campoEmailJLbl);
		
		emailTF = new JTextField();
		emailTF.setBounds(245, 234, 96, 19);
		contentPane.add(emailTF);
		emailTF.setColumns(10);
		
		JLabel campoSenhaJLbl = new JLabel("Digite a sua senha:");
		campoSenhaJLbl.setBounds(136, 290, 108, 13);
		contentPane.add(campoSenhaJLbl);
		
		senhaTF1 = new JPasswordField();
		senhaTF1.setBounds(245, 287, 96, 19);
		contentPane.add(senhaTF1);
		senhaTF1.setColumns(10);
		
		JLabel campoCargoJLbl = new JLabel("Cargo:");
		campoCargoJLbl.setBounds(136, 379, 45, 13);
		contentPane.add(campoCargoJLbl);
		
		CargoTF = new JTextField();
		CargoTF.setBounds(245, 376, 96, 19);
		contentPane.add(CargoTF);
		CargoTF.setColumns(10);
		
		JLabel TelefoneJLbl = new JLabel("Telefone");
		TelefoneJLbl.setBounds(136, 334, 79, 13);
		contentPane.add(TelefoneJLbl);
		
		telefoneTF = new JTextField();
		telefoneTF.setBounds(245, 331, 96, 19);
		contentPane.add(telefoneTF);
		telefoneTF.setColumns(10);
		
		JButton btnNewButton = new JButton("Inscrever");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(321, 524, 123, 21);
		contentPane.add(btnNewButton);
		
		JLabel campoNomeCivilJLbl = new JLabel("Nome Civil:");
		campoNomeCivilJLbl.setBounds(136, 423, 79, 13);
		contentPane.add(campoNomeCivilJLbl);
		
		NomeCivilTF = new JTextField();
		NomeCivilTF.setBounds(245, 420, 96, 19);
		contentPane.add(NomeCivilTF);
		NomeCivilTF.setColumns(10);
		
		JLabel campoFaculdadeJLbl = new JLabel("Faculdade:");
		campoFaculdadeJLbl.setBounds(136, 470, 69, 13);
		contentPane.add(campoFaculdadeJLbl);
		
		FaculdadeTF = new JTextField();
		FaculdadeTF.setBounds(245, 467, 96, 19);
		contentPane.add(FaculdadeTF);
		FaculdadeTF.setColumns(10);
		
		JLabel campoNomeSocialJLbl = new JLabel("Nome Social");
		campoNomeSocialJLbl.setBounds(426, 379, 69, 13);
		contentPane.add(campoNomeSocialJLbl);
		
		NomeSocialTF = new JTextField();
		NomeSocialTF.setBounds(555, 376, 96, 19);
		contentPane.add(NomeSocialTF);
		NomeSocialTF.setColumns(10);
		
		JLabel campoSexoJLbl = new JLabel("Sexo:");
		campoSexoJLbl.setBounds(426, 423, 45, 13);
		contentPane.add(campoSexoJLbl);
		
		SexoTF = new JTextField();
		SexoTF.setBounds(555, 420, 96, 19);
		contentPane.add(SexoTF);
		SexoTF.setColumns(10);
		
		JLabel campoDataNascimentoJLbl = new JLabel("Data Nascimento:");
		campoDataNascimentoJLbl.setBounds(426, 186, 108, 13);
		contentPane.add(campoDataNascimentoJLbl);
		
		DataNascimentoTF = new JTextField();
		DataNascimentoTF.setBounds(555, 183, 96, 19);
		contentPane.add(DataNascimentoTF);
		DataNascimentoTF.setColumns(10);
		
		JLabel campoTipoSanguineoJLbl = new JLabel("Tipo Sanguineo:");
		campoTipoSanguineoJLbl.setBounds(426, 237, 108, 13);
		contentPane.add(campoTipoSanguineoJLbl);
		
		tipoSanguineoTF = new JTextField();
		tipoSanguineoTF.setBounds(555, 234, 96, 19);
		contentPane.add(tipoSanguineoTF);
		tipoSanguineoTF.setColumns(10);
		
		JLabel campoNaturalidadeJLbl = new JLabel("Naturalidade:");
		campoNaturalidadeJLbl.setBounds(426, 290, 108, 13);
		contentPane.add(campoNaturalidadeJLbl);
		
		NaturalidadeTF = new JTextField();
		NaturalidadeTF.setBounds(555, 287, 96, 19);
		contentPane.add(NaturalidadeTF);
		NaturalidadeTF.setColumns(10);
		
		campoNacionalidadeJLbl = new JLabel("Nacionalidade:");
		campoNacionalidadeJLbl.setBounds(426, 334, 96, 13);
		contentPane.add(campoNacionalidadeJLbl);
		
		NacionalidadeTF = new JTextField();
		NacionalidadeTF.setBounds(555, 331, 96, 19);
		contentPane.add(NacionalidadeTF);
		NacionalidadeTF.setColumns(10);
	}
	
	public void inserirProfessor() throws ClassNotFoundException, SQLException {
//		CadastroProfessor cadastroProfessor = new CadastroProfessor();
		CadastroProfessor.inserirProfessor(UsuarioTF.getText(), emailTF.getText(), new String(senhaTF1.getText()), telefoneTF.getText(), CargoTF.getText(), NomeCivilTF.getText(), FaculdadeTF.getText(), DataNascimentoTF.getText(), tipoSanguineoTF.getText(), NaturalidadeTF.getText(), NacionalidadeTF.getText(), NomeSocialTF.getText(), SexoTF.getText());
	}

	public static void inserirProfessor(String usuario, String email, String senha, String telefone, String cargo, String nomeCivil, String faculdade, String dataNascimento, String tipoSanguineo, String naturalidade, String nacionalidade,  String nomeSocial, String sexo) throws ClassNotFoundException {
	
		String sql = "INSERT INTO PROFESSOR (usuario, email, senha, telefone, cargo, nomeCivil, faculdade, dataNascimento, tipoSanguineo, naturalidade, nacionalidade, nomeSocial, sexo)  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?  )";
	
			
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		final String URL = "jdbc:mysql:/127.0.0.1:3306/studies?";
	    final String USER = "root";
	    final String PASSWORD = "88567731";
		    
		try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
	
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
					
		
					pstmt.setString(1, usuario);
					pstmt.setString(2, email);
					pstmt.setString(3, senha);
					pstmt.setString(4, telefone);
					pstmt.setString(5, cargo);
					pstmt.setString(6, nomeCivil);
					pstmt.setString(7, faculdade);
					
					Calendar c = Calendar.getInstance();
					
					Date data = (Date) c.getTime();
					
					DateFormat f = DateFormat.getDateInstance();
					
					java.util.Date data2 = f.parse(data.toString());
					
					SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
					
					System.out.println("Data formatada: " + formatData.format(data));
					
					String dataFormatada = formatData.format(data);
		
					pstmt.setDate(8, dataFormatada.toString(data));
					
					
//					pstmt.setDate(8, java.sql.Date.valueOf(dataNascimento));
					pstmt.setString(9, tipoSanguineo);
					pstmt.setString(10, naturalidade);
					pstmt.setString(11, nacionalidade);
					pstmt.setString(12, nomeSocial);
					pstmt.setString(13, sexo);
					
		
					pstmt.executeUpdate();
					conn.close();
	
			System.out.println("Professor inserido com sucesso!");
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	private static SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
}

