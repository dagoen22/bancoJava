/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import banco.conexao;

/**
 *
 * @author red
 */
public class consultas extends conexao{
    //preencher com statements sql
    public static boolean consultaConta(String conta, String senha){
        return true;
    }
    public static double consultaSaldo(){
        return 2000;
    }
    public static int consultaDepRealizados(){
        return 10;
    }
    public static int consultaRecebidos(){
        return 10;
    }
    public static int consultaSaqRealizados(){
        return 5;
    }
}
