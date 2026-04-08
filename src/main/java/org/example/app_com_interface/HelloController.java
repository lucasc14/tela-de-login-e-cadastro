package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField txtUsuario ;
    @FXML
    PasswordField txtSenha;
    @FXML
    Button btnLogin;
    @FXML
    Label labelLogin;

    @FXML
    protected void onBtnLoginClick() {
       LoginDAO usuario = new LoginDAO();
       String usuariDigitado = txtUsuario.getText();
       String senhaDigitado = txtSenha.getText();

       boolean autenticado = usuario.autenticar (usuariDigitado, senhaDigitado);

       if (autenticado) {
           labelLogin.setText("Usuario e senha corretos!!");
       }
       else {
           labelLogin.setText("Usuario ou senha incorretos!!");
       }
    }

}
