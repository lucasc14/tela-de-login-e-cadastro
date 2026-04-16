package org.example.app_com_interface;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {
    // metodo que conecta no banco e autentica  ususario e sennha!!
    public boolean autenticar(String nomeDigitado, String senhaDigitada) {
        String sql = "SELECT senha FROM usuario WHERE nome = ?";


        try (
                Connection conn = DatabaseConfig.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {
            stmt.setString(1, nomeDigitado);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    String hashDoBanco = rs.getString("senha");

                    if(BCrypt.checkpw(senhaDigitada, hashDoBanco)) {
                        return true; //senha correta
                    }

                    else {
                        return false;//senha incorreta
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao autenticar usuário", e);
        }

        return false; // usuário não encontrado
    }
}