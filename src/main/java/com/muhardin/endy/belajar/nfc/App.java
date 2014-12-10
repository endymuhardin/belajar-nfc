package com.muhardin.endy.belajar.nfc;

import java.util.List;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;

public class App {
    public static void main( String[] args ) throws CardException {
        // list card reader
        
        TerminalFactory fact = TerminalFactory.getDefault();
        List<CardTerminal> readers = fact.terminals().list();
        
        System.out.println("Jumlah reader : "+readers.size());
        
        for (CardTerminal reader : readers) {
            System.out.println("Nama : "+reader.getName());
        }
    }
}
