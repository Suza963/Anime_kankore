import javax.swing.JButton;
import javax.swing.JFrame;


public class PoiPoi_mado {

	public static void main(String[] args) {

		Frame_toka creator = new Frame_toka();
		JFrame frame = creator.createFrame();
		JButton btn = creator.createBtn();
		frame.add(btn);

	}


}
