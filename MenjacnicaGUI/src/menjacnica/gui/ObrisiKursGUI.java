package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textFieldSifra;
	private JLabel lblNaziv;
	private JTextField textFieldNaziv;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajni;
	private JLabel lblNewLabel_1;
	private JTextField textFieldKupovni;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSrednji;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSkraceni;
	private JButton btnObrisi;
	private JButton btnNewButton;
	private JRadioButton rdbtnZaistaObrisiKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI(null);
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
	public ObrisiKursGUI(MenjacnicaGUI gp) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 344, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajni());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTextFieldKupovni());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSrednji());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSkraceni());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnNewButton());
		contentPane.add(getRdbtnZaistaObrisiKurs());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Sifra");
			lblNewLabel.setBounds(10, 21, 46, 14);
		}
		return lblNewLabel;
	}

	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 46, 152, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(172, 21, 46, 14);
		}
		return lblNaziv;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(172, 46, 152, 20);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 82, 101, 14);
		}
		return lblProdajniKurs;
	}

	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setBounds(10, 107, 152, 20);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Kupovni kurs");
			lblNewLabel_1.setBounds(172, 82, 86, 14);
		}
		return lblNewLabel_1;
	}

	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setBounds(172, 107, 152, 20);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 138, 101, 14);
		}
		return lblSrednjiKurs;
	}

	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setBounds(10, 163, 152, 20);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(172, 138, 86, 14);
		}
		return lblSkraceniNaziv;
	}

	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setBounds(172, 163, 152, 20);
			textFieldSkraceni.setColumns(10);
		}
		return textFieldSkraceni;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String a = MenjacnicaGUI.textPane.getText() + "\nObrisana valuta --> Naziv: "
							+ textFieldNaziv.getText() + " Skraceni naziv:" + textFieldSkraceni.getText()
							+ " Kupovni-Srednji-Prodajni: " + textFieldKupovni.getText() + "-"
							+ textFieldSrednji.getText() + "-" + textFieldProdajni.getText();

					MenjacnicaGUI.textPane.setText(a);
					dispose();

				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 220, 152, 23);
		}
		return btnObrisi;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Odustani");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton.setBounds(172, 220, 152, 23);
		}
		return btnNewButton;
	}

	private JRadioButton getRdbtnZaistaObrisiKurs() {
		if (rdbtnZaistaObrisiKurs == null) {
			rdbtnZaistaObrisiKurs = new JRadioButton("Zaista obrisi kurs");
			rdbtnZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (rdbtnZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
					} else
						btnObrisi.setEnabled(false);
				}
			});
			rdbtnZaistaObrisiKurs.setBounds(10, 190, 109, 23);
		}
		return rdbtnZaistaObrisiKurs;
	}
}
