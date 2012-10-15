package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DialogRentDVD  extends JDialog implements ActionListener{
private JTextField titleTxt;
private JTextField renterTxt;
private JTextField rentedOnTxt;
private JTextField DueBackTxt;
private JButton okButton;
private JButton cancelButton;
private boolean closeStatus;
private DVD unit;  

public DialogRentDVD(JFrame parent, DVD d) {	
	unit = d;
}
if (rentGameItem == e.getSource()) {
		Game game = new Game();
	DialogRentGame dialog = new DialogRentGame(this, game);
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
