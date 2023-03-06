package br.gama.itau.spring03.exception;

public class NotFoundException extends RuntimeException {
    
    public NotFoundException(String msg) {
        super(msg);
    }
    
}
