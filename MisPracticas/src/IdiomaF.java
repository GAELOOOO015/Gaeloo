import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class IdiomaF {

	private JFrame frmIdiomaDeLa;
	private JTextArea txtTexto;
	private JTextArea txtTraduccion;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdiomaF window = new IdiomaF();
					window.frmIdiomaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IdiomaF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIdiomaDeLa = new JFrame();
		frmIdiomaDeLa.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ALUMNO.SC3PC12\\Pictures\\imagen 1.jpg"));
		frmIdiomaDeLa.setTitle("IDIOMA DE LA F");
		frmIdiomaDeLa.setBounds(100, 100, 450, 300);
		frmIdiomaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIdiomaDeLa.getContentPane().setLayout(null);
		frmIdiomaDeLa.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("IDIOMA DE LA F");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(124, 0, 136, 22);
		frmIdiomaDeLa.getContentPane().add(lblNewLabel);
		
		txtTexto = new JTextArea();
		txtTexto.addKeyListener(new KeyAdapter() {
		
			public void keyReleased(KeyEvent e) {
				String texto=txtTexto.getText().toString();
				texto=texto.replace("a","afa");
				texto=texto.replace("e","efe");
				texto=texto.replace("i","ifi");
				texto=texto.replace("o","ofo");
				texto=texto.replace("u","ufu");
				txtTraduccion.setText(texto);
			}
		});
		txtTexto.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtTexto.setBounds(70, 39, 90, 130);
		frmIdiomaDeLa.getContentPane().add(txtTexto);
		
		txtTraduccion = new JTextArea();
		txtTraduccion.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtTraduccion.setBounds(237, 39, 90, 126);
		frmIdiomaDeLa.getContentPane().add(txtTraduccion);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtTexto.setText("");	
			txtTraduccion.setText("");
			}
		});
		btnBorrar.setBounds(147, 203, 89, 23);
		frmIdiomaDeLa.getContentPane().add(btnBorrar);
	}
}
