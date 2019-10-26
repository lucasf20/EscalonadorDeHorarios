package Escalonador;
import java.sql.*;

public class BancoDeDados {

    private static Connection makeConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AlocacaoDeTurmas","lucas","lucas123");
            return connection;
        }catch (Exception a){
            System.out.println(a.getMessage());
            return null;
        }
    }

    public static String[] getCollunm(String collunmName, String table) {
        String opt = "";
        String query = "select " + collunmName + " from " + table + ";";
        try {
            Connection connection = makeConnection();
            PreparedStatement stm = connection.prepareStatement(query);
            ResultSet rst = stm.executeQuery();
            while(rst.next()){
                opt += rst.getString(1) + "\n";
            }
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
        return opt.split("\n");
    }

    public static String[] getCollunm(String collunmName, String table, String where) {
        String opt = "";
        String query = "select " + collunmName + " from " + table + "where " + where + ";";
        try {
            Connection connection = makeConnection();
            PreparedStatement stm = connection.prepareStatement(query);
            ResultSet rst = stm.executeQuery();
            while(rst.next()){
                opt += rst.getString(1) + "\n";
            }
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }
        return opt.split("\n");
    }
}
