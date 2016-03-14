import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Font;

public class GUI {

	private JPanel jPanel = new JPanel();
	private JFrame frame = new JFrame("ARCHORG");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public GUI() {

		
		frame.getContentPane().add(jPanel);
		GridBagLayout gbl_jPanel = new GridBagLayout();
		gbl_jPanel.columnWidths = new int[]{262, 215, 0};
		gbl_jPanel.rowHeights = new int[]{91, 14, 36, 14, 20, 35, 14, 20, 65, 23, 20, 0};
		gbl_jPanel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_jPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jPanel.setLayout(gbl_jPanel);
		
		JLabel lblTitle = new JLabel(" IEEE-754 binary-64 floating point translator ");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 0);
		gbc_lblTitle.gridx = 1;
		gbc_lblTitle.gridy = 1;
		jPanel.add(lblTitle, gbc_lblTitle);
		
		JLabel lblInputDigit = new JLabel("Input 16-digit hexadecimal value");
		GridBagConstraints gbc_lblInputDigit = new GridBagConstraints();
		gbc_lblInputDigit.anchor = GridBagConstraints.NORTH;
		gbc_lblInputDigit.insets = new Insets(0, 0, 5, 0);
		gbc_lblInputDigit.gridx = 1;
		gbc_lblInputDigit.gridy = 3;
		jPanel.add(lblInputDigit, gbc_lblInputDigit);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		jPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblor = new JLabel("-OR-");
		GridBagConstraints gbc_lblor = new GridBagConstraints();
		gbc_lblor.insets = new Insets(0, 0, 5, 0);
		gbc_lblor.gridx = 1;
		gbc_lblor.gridy = 5;
		jPanel.add(lblor, gbc_lblor);
		
		JLabel lblInput = new JLabel("Input 64-bit partition binary ");
		GridBagConstraints gbc_lblInput = new GridBagConstraints();
		gbc_lblInput.anchor = GridBagConstraints.SOUTH;
		gbc_lblInput.insets = new Insets(0, 0, 5, 0);
		gbc_lblInput.gridx = 1;
		gbc_lblInput.gridy = 6;
		jPanel.add(lblInput, gbc_lblInput);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 7;
		jPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton btnTranslate = new JButton("Translate");
		GridBagConstraints gbc_btnTranslate = new GridBagConstraints();
		gbc_btnTranslate.insets = new Insets(0, 0, 5, 0);
		gbc_btnTranslate.gridx = 1;
		gbc_btnTranslate.gridy = 9;
		jPanel.add(btnTranslate, gbc_btnTranslate);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 10;
		jPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);

	}

	public static void main(String[] args) {
		GUI gui = new GUI();

	}
}
