package priceMatch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}

	class SearchButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String keyword = view.getKeywordInput();
			String author = view.getAuthorInput();
		}
		
	}
}
