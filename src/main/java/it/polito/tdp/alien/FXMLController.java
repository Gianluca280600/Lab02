package it.polito.tdp.alien;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	List<String> l=new ArrayList<String>();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtText;

    @FXML
    void doClear(ActionEvent event) {
    	l.clear();
    	txtArea.clear();
    	txtText.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	txtArea.clear();
    	String par=txtText.getText();
    	par=par.toLowerCase();
    	if(par.contains(" ")==true) {
    		l.add(par);
    	}else {
    		for(String x:l) {
    			if(x.contains(par)==true) {
        			txtArea.appendText(x+"\n");
    			}
    		}	
    	}
    	txtText.clear();
    	
    }

    @FXML
    void initialize() {
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtText != null : "fx:id=\"txtText\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}

