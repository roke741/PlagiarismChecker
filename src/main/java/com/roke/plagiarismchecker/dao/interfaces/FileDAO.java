package com.roke.plagiarismchecker.dao.interfaces;

import java.io.File;
import java.io.IOException;

public interface FileDAO {
    String readFileContent(File file) throws IOException;
    boolean isFileEmpty(File file) throws IOException;
}
