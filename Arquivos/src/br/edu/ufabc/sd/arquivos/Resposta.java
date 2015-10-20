/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufabc.sd.arquivos;

/**
 *
 * @author igor.esteves
 */
public class Resposta implements java.io.Serializable{
    public static final int READ_FILE_OK = 0;
    public static final int READ_FILE_NOT_OK = -1;
    public static final int NEW_FILE_OK = 1;
    public static final int NEW_FILE_NOT_OK = -2;
    public static final int WRITE_FILE_OK = 2;
    public static final int WRITE_FILE_NOT_OK = -3;
    public static final int LIST_FILES_OK = 3;
    public static final int LIST_FILES_NOT_OK = -4;
    
    private int msg;
    private Arquivo file;

    public int getMsg() {
        return msg;
    }

    public Arquivo getFile() {
        return file;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }

    public void setFile(Arquivo file) {
        this.file = file;
    }
    
    
}
