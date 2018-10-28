package javafxpractice;

import javafx.application.*;
import javafx.stage.*;

public class AppMain extends Application{
	@Override
	public void init() throws Exception{
		System.out.println(Thread.currentThread().getName()+": AppMain() »£√‚");
	}
	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
