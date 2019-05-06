package javaFX2htmlEditor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.web.HTMLEditor;

public class HTMLeditorController {

	@FXML
	private HTMLEditor hte;

	@FXML
	private Button btn;

	@FXML
	private TextArea txa;

	@FXML
	void initialize() {
		assert hte != null : "fx:id=\"hte\" was not injected: check your FXML file 'HTMLeditor.fxml'.";
		assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'HTMLeditor.fxml'.";
		assert txa != null : "fx:id=\"txa\" was not injected: check your FXML file 'HTMLeditor.fxml'.";
	}

	@FXML
	void btnOnAction(ActionEvent e) {
		this.txa.setText(this.hte.getHtmlText());
	}
}
