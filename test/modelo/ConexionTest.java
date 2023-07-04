/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Estremor
 */
public class ConexionTest {
    
    public ConexionTest() {
    }


    /**
     * Test of getConnection method, of class Conexion.
     */
    @Test
    public void testGetConnection() throws SQLException {
        System.out.println("getConnection");
        Conexion instance = new Conexion();
        String expResult = "1";
         String sql="select '1' from dual";
         String result="";
         try{
         ResultSet rs = instance.getConnection().prepareStatement(sql).executeQuery();
         //System.out.println(rs.getArray(sql));
     
         while(rs.next()){
             result = rs.getString(1);
             System.out.println(rs.getString(1));
         }
         
        
     }catch(Exception e){
     }
         
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
