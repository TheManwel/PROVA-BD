package DAO;

import java.sql.*;

public class ExeculteSQL {
    private Connection con;


public ExeculteSQL(Connection con){
    setCon(con);
}

public Connection getCon(){
    return con;
}

public void setCon(Connection con){
    this.con = con;
}
}

