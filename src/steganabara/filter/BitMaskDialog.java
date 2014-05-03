package steganabara.filter;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import steganabara.SpringUtilities;

public class BitMaskDialog extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3185486959658850463L;
	private static final String[] channels = { "Alpha", "Red", "Green", "Blue" };
	private final JCheckBox[][] argb;
	private JCheckBox amp;
	private BitMaskOptions[] optionsList;

	public BitMaskDialog(Frame owner, String title) {

		super(owner, title, true);

		setLayout(new BorderLayout());
		argb = new JCheckBox[4][8];

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		for (int j = 0; j < 4; j++) {
			panel.add(new JLabel(channels[j], JLabel.TRAILING));
			for (int i = 0; i < 8; i++)
				panel.add(argb[j][i] = new JCheckBox());
		}
		SpringUtilities.makeCompactGrid(panel, 4, 9, 3, 3, 3, 3);
		add(panel, BorderLayout.NORTH);

		panel = new JPanel();
		amp = new JCheckBox("Amplify");
		panel.add(amp);
		add(panel, BorderLayout.CENTER);
		panel = new JPanel();
		JButton okButton = new JButton("OK");
		okButton.setActionCommand("ok");
		okButton.addActionListener(this);
		panel.add(okButton);
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("cancel");
		cancelButton.addActionListener(this);
		panel.add(cancelButton);
		JButton lsbButton = new JButton("LSB");
		lsbButton.setActionCommand("lsb");
		lsbButton.addActionListener(this);
		panel.add(lsbButton);
		add(panel, BorderLayout.SOUTH);
		pack();
		setResizable(false);

	} // end constructor

	public BitMaskOptions[] getOptionsList() {

		return optionsList;

	} // end getOptionsList

	public void actionPerformed(ActionEvent e) {

		String cmd = e.getActionCommand();
		if (cmd.equals("ok")) {
			long value = 0;
			for (int j = 0; j < 4; j++)
				for (int i = 0; i < 8; i++)
					value = (value << 1) | (argb[j][i].isSelected() ? 1 : 0);
			optionsList = new BitMaskOptions[] {
				new BitMaskOptions(value, amp.isSelected())
			};
		} else if (cmd.equals("lsb")) {
			optionsList = new BitMaskOptions[] {
				new BitMaskOptions(1, true),
				new BitMaskOptions(0x100, true),
				new BitMaskOptions(0x10000, true)
			};
		}
		setVisible(false);

	} // end actionPerformed

	public static BitMaskOptions[] showBitMaskDialog(Component target, String title) {

		BitMaskDialog dialog = new BitMaskDialog(null, title);
		dialog.setLocationRelativeTo(target);
		dialog.setVisible(true);
		return dialog.getOptionsList();

	} // end showBitMaskDialog

} // end class
