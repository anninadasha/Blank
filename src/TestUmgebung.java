import javax.swing.JOptionPane;

public class TestUmgebung {

	public static void main(String[] args) {

  String name1 = JOptionPane.showInputDialog("Gib den ersten Namen ein!") ;
  String name2 = JOptionPane.showInputDialog("Gib den zweiten Namen ein!") ;
  
  int num1 = name1.length();
  int num2 = name2.length();
  
  JOptionPane.showMessageDialog(null, "Ihre erste Name besteht aus " + num1 + " Buchstaben; Ihre zweite Name besteht aus " + num2 + " Buchstaben.", "Namelänge", JOptionPane.PLAIN_MESSAGE);

	}

}
