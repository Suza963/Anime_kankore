import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class BtnAction extends AbstractAction {
	private static final long serialVersionUID = 1L;

	BtnAction() {
		super("ぽい？");//ボタンの名前を設定
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ボタンが押された時の処理
		AudioClip clip = Applet.newAudioClip(
				getClass().getResource("っぽい？.wav"));
		clip.play();

	}
}

