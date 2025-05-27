import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoMySQL {

    public static void main(String[] args) {
        // Dados de conexão
        String url = "jdbc:mysql://localhost:3306/escola";
        String usuario = "root";         // Substitua pelo seu usuário
        String senha = "root"; // Substitua pela sua senha

        try {
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão bem-sucedida!");

            // Criação do statement e execução de query
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM alunos");

            // Iteração sobre os dados retornados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Idade: " + idade);
            }

            // Fechando a conexão
            rs.close();
            stmt.close();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
