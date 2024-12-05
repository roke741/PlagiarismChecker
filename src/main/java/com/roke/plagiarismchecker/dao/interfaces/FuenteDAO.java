package com.roke.plagiarismchecker.dao.interfaces;

import java.sql.SQLException;

public interface FuenteDAO {
    String[] listarFuentes() throws SQLException;
}
