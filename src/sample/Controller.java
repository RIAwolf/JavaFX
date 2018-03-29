package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class Controller {


    public TextArea myTextArea;

    public void onHomeClick(ActionEvent actionEvent) {
        myTextArea.appendText("Hello, this is my home page\n");
    }

    public void onAboutClick(ActionEvent actionEvent) {
        myTextArea.appendText("I am awesome\n");
    }

    public void onContactClick(ActionEvent actionEvent) {
        myTextArea.appendText("Shout\n");
    }


}
