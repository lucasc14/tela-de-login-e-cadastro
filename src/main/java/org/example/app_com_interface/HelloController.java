package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    Hyperlink LinkCadastro;

    @FXML
    protected void irParaTelaCadastro () throws Exception {
        // chama o metodo da Appllication para trocar a cena
        HelloApplication.trocadorDeTelas("cadastro.fxml");
    }


    @FXML
    protected void onBtnLoginClick() {
       LoginDAO usuario = new LoginDAO();
       String usuarioDigitado = txtUsuario.getText();
       String senhaDigitado = txtSenha.getText();

       boolean autenticado = usuario.autenticar (usuarioDigitado, senhaDigitado);

       if (autenticado) {
           labelLogin.setText("Usuario e senha corretos!!");
       }
       else {
           labelLogin.setText("Usuario ou senha incorretos!!");
       }
    }


}
