package priceMatch;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JPanel{
	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
	
	private Model model;
	
	JFrame frame;
	private JButton searchButton;
	private JTextField authorInput;
	private JTextField keywordInput;
	private JComboBox<String> categoryCombo;
	
	public static void main(String[] args) {
		View view = new View();
	}
	
	public View() {
		this.frame = new JFrame(); 
		this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.frame.setTitle("PriceMatch");
		this.frame.setResizable(false);
		this.frame.getContentPane().setLayout(new FlowLayout());

		
		JPanel titlePanel = createTitlePanel();
		JPanel searchConditionPanel = createSearchConditionPanel();
		JPanel searchButtonPanel = createSearchButtonPanel();
		JPanel resultPanel = createResultPanel();
		
		this.frame.add(titlePanel);
		this.frame.add(searchConditionPanel);
		this.frame.add(searchButtonPanel);
		this.frame.add(resultPanel);
		this.frame.setVisible(true);
		
	}
	
	private JPanel createTitlePanel(){
		JLabel titleLabel = new JLabel("Price search");
		
		JPanel titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(1000,20));
		
		titlePanel.add(titleLabel);
		return titlePanel;
	}
	
	private JPanel createSearchConditionPanel(){
		this.authorInput = new JTextField(10);
		this.authorInput.setText("Author");
		this.keywordInput = new JTextField(10);
		this.keywordInput.setText("Book title");
//		this.categoryCombo = new JComboBox<String>();
//		this.categoryCombo.addItem("Books");
//		this.categoryCombo.addItem("Beauty");
//		this.categoryCombo.addItem("Grocery");
		
		JPanel searchConditionPanel = new JPanel();
		searchConditionPanel.setPreferredSize(new Dimension(1000,20));
		searchConditionPanel.setLayout(new GridLayout(1, 2));
		
//		searchConditionPanel.add(this.categoryCombo);
		searchConditionPanel.add(this.authorInput);
		searchConditionPanel.add(this.keywordInput);
		
		return searchConditionPanel;
	}
	
	private JPanel createSearchButtonPanel(){
		JPanel searchButtonPanel = new JPanel();
		this.searchButton = new JButton("Search");
		searchButtonPanel.add(this.searchButton);
		return searchButtonPanel;
	}
	
	private JPanel createResultPanel(){
		JPanel resultPanel = new JPanel();
		return resultPanel;
	}
	
	public void addSearchButtonListener(ActionListener listener){
		this.searchButton.addActionListener(listener);
	}
	
	public String getKeywordInput(){
		return this.keywordInput.getText();
	}
	
	public String getAuthorInput(){
		return this.authorInput.getText();
	}
	
	public String getCategory(){
		return (String)this.categoryCombo.getSelectedItem();
	}
	
	
	
	
}
