package com.ofss.processor;

import javax.servlet.ServletException;

public class CompileException extends ServletException{
	private static final long serialVersionUID = 1L;
    String errArray;
     
    public CompileException(String errArray) {
        this.errArray = errArray;
    }
     
    public String getErrors(){
        return errArray;
    }
}
