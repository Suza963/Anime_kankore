import javax.swing.JButton;
import javax.swing.JFrame;

class Frame_toka {

	JFrame createFrame(){
		JFrame frame = new JFrame();  //新しいフレームの作成
		frame.setTitle("ぽいぽいの窓");  //フレームのタイトル
		frame.setBounds(100, 100, 400, 300);
		frame.setLocationRelativeTo(null); //初期画面中央表示
		frame.setVisible(true); //画面に表示する
		frame.setLayout(null);  //ボタン配置用にレイアウトを使えるようにしておく
		frame.setResizable(false); //フレームのサイズ固定
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //終了処理
		return frame;
	}

	JButton createBtn() {
		JButton btn = new JButton(new BtnAction());//ボタンにActionを渡す
		btn.setBounds(150, 100, 100, 100);	//ボタンの大きさと座標
		return btn;
	}
	
}



