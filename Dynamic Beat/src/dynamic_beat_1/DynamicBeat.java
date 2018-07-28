package dynamic_beat_1;

import javax.swing.*;

public class DynamicBeat extends JFrame{
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false); 
		setLocationRelativeTo(null); // 게임창 정중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
