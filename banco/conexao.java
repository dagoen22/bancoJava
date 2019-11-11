/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author red
 */
public class conexao {
  //preencher tudo o que estiver como null
  public Connection con = null;
  private final String hostName = null;
  private final String userName = null;
  private final String password = null;

  private final String name = null;
  private final String port = null;
  private final String prefix = null;
  
  private final String params = prefix + hostName + ":"+port+"/" + name + "/";
  
  
  
  public conexao(){
    super();
  }
  
  public Connection getConnection() {
    try {
      if (con == null) {
        con = DriverManager.getConnection(params, userName, password);
      } else if (con.isClosed()) {
        con = null;
        return getConnection();
      }
    } catch (Exception e) {
        return null;
    }
    return con;
  }
}
