package com.co.madrigal.ink.repository;

import java.sql.*;

public class JDBCMySqlCarrera {

  public Statement getConnection() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con= DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/carrera?serverTimezone=UTC","root","Linkuei2");
      return con.createStatement();
    }catch(Exception e) {
      System.out.println(e);
      return null;
    }
  }

  public void getDataTable(String table){
    try {
      String query = "select * from " + table;
      ResultSet rst = getConnection().executeQuery(query);
      while (rst.next()){
        for (int i = 1; i <= rst.getMetaData().getColumnCount(); i++ ){
          System.out.print(rst.getString(i) + " | ");
        }
        System.out.println();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
