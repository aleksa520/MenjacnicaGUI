package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNaziv;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldProdajni;
	private JTextField textFieldKupovni;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI frame = new DodajKursGUI(null);
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
	public DodajKursGUI(MenjacnicaGUI gp) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajKursGUI.class.getResource("/icons/menjacnica-grk-promet-slike293.jpg")));
		setResizable(false);
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getTextFieldSkraceni());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(10, 23, 67, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(166, 23, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 48, 146, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(166, 48, 146, 20);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 79, 88, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni Kurs");
			lblKupovniKurs.setBounds(166, 79, 83, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setBounds(10, 95, 146, 20);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setBounds(166, 95, 143, 20);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 126, 77, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(166, 126, 94, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setBounds(10, 142, 143, 20);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setBounds(166, 142, 143, 20);
			textFieldSkraceni.setColumns(10);
		}
		return textFieldSkraceni;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String a = MenjacnicaGUI.textPane.getText()+"\nNova valuta --> Naziv: "+textFieldNaziv.getText()+
							" Skraceni naziv:"+textFieldSkraceni.getText()+
							" Kupovni-Srednji-Prodajni: "+textFieldKupovni.getText()+"-"
							+textFieldSrednji.getText()+"-"+textFieldProdajni.getText();
					
					MenjacnicaGUI.textPane.setText(a);
					dispose();
					
				}
			});
			btnNewButton.setBounds(10, 173, 146, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
					
				}
			});
			btnNewButton_1.setBounds(166, 173, 143, 23);
		}
		return btnNewButton_1;
	}
}
