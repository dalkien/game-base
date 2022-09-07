package com.co.madrigal.ink.service;

import com.co.madrigal.ink.repository.JDBCMySqlCarrera;

public class ConsultasService {

  private JDBCMySqlCarrera jdbcMySqlCarrera;

  public ConsultasService(JDBCMySqlCarrera jdbcMySqlCarrera) {
    this.jdbcMySqlCarrera = jdbcMySqlCarrera;
  }

  /*
  * CRUD
  * Create -> Insert en tabla
  * Read -> Select en tabla
  * Update -> Update en tabla
  * Delete -> Delete en tabla
  * */
  public void printInformation(){
    jdbcMySqlCarrera.getDataTable("participante");
  }
}
