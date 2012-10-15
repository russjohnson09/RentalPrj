package package1;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class ListEngine extends AbstractListModel {

	private ArrayList<DVD> listDVDs;

	// constructor method that initializes the arraylist
	// override these two methods from AbstractListModel class

	public Object getElementAt(int arg0) {
		return arg0;
	}

	public int getSize() {
		return 0;
	}

	// add methods to add, delete, and update.
	// add methods to load/save accounts from/to a binary file
	// add other methods as needed

}
