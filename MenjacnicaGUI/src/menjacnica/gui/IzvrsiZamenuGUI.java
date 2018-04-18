package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JComboBox comboBox;
	private JLabel lblProdajniKurs;
	private JLabel lblValuta;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblIznos;
	private JTextField textField_2;
	private JLabel lblVrstaTransakcije;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JRadioButton Radio1;
	private JRadioButton Radio2;
	private JSlider slider;
	ButtonGroup bgr = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI(null);
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
	public IzvrsiZamenuGUI(MenjacnicaGUI gp) {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(IzvrsiZamenuGUI.class.getResource("/icons/menjacnica-grk-promet-slike293.jpg")));
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 363, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getComboBox());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLblIznos());
		contentPane.add(getTextField_2());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getRadio1());
		contentPane.add(getRadio2());
		contentPane.add(getSlider());
		bgr.add(Radio2);
		bgr.add(Radio1);
		comboBox.addItem("EUR");
		comboBox.addItem("USD");
		comboBox.addItem("CHF");

	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 11, 93, 14);
		}
		return lblKupovniKurs;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(146, 30, 64, 20);
		}
		return comboBox;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(221, 11, 73, 14);
		}
		return lblProdajniKurs;
	}

	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(146, 11, 65, 14);
		}
		return lblValuta;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 30, 126, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(220, 30, 127, 20);
		}
		return textField_1;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 68, 46, 14);
		}
		return lblIznos;
	}

	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(10, 93, 126, 20);
			textField_2.setColumns(10);

		}
		return textField_2;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(180, 68, 80, 14);
		}
		return lblVrstaTransakcije;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					String tekst = "";

					if (Radio1.isSelected())
						tekst = Radio1.getText();
					else if (Radio2.isSelected())
						tekst = Radio2.getText();

					String a = MenjacnicaGUI.textPane.getText() + "\nIzvrsena je " + tekst + "" + " , valute "
							+ comboBox.getSelectedItem() + " u iznosu od " + textField_2.getText();

					MenjacnicaGUI.textPane.setText(a);
					dispose();

				}
			});
			btnIzvrsiZamenu.setBounds(21, 211, 138, 23);
		}
		return btnIzvrsiZamenu;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(180, 211, 147, 23);
		}
		return btnOdustani;
	}

	private JRadioButton getRadio1() {
		if (Radio1 == null) {
			Radio1 = new JRadioButton("Kupovina");
			Radio1.setSelected(true);
			Radio1.setBounds(190, 95, 109, 23);
		}

		return Radio1;
	}

	private JRadioButton getRadio2() {

		if (Radio2 == null) {
			Radio2 = new JRadioButton("Prodaja");
			Radio2.setBounds(190, 129, 109, 23);
		}

		return Radio2;
	}

	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent arg0) {
					String s = "" + slider.getValue();
					textField_2.setText(s);
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					String s = "" + slider.getValue();
					textField_2.setText(s);
				}
			});
			slider.setSnapToTicks(true);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setBounds(21, 148, 306, 52);
		}
		return slider;
	}

}
