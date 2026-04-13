package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroController {
    @FXML
    TextField txtNome ;

    @FXML
    TextField txtEmail ;

    @FXML
    PasswordField txtSenha;

    @FXML
    PasswordField txtConfirmarSenha;


    @FXML
    Button btnVoltar;

    @FXML
    Button btnCadastrar;

    @FXML
    protected void voltarTela () throws Exception {
        // chama o metodo da Appllication para trocar a cena
        HelloApplication.trocadorDeTelas("hello-view.fxml");
    }


}
