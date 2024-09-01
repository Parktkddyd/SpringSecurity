package com.syp.SpringSecurity;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class MYSQLConnectionTest {
    private static final String Driver =
            "com.mysql.cj.jdbc.Driver";
    private static final String URL =
            "jdbc:mysql://127.0.0.1:3306/springsecurity?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PW = "rootpw";

    @Test
    public void testConnection() throws Exception{
        Class.forName(Driver);

        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
            System.out.println(con);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
