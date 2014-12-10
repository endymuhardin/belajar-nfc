package com.muhardin.endy.belajar.nfc;

import java.util.List;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.smartcardio.TerminalFactory;
import javax.xml.bind.DatatypeConverter;

public class App {
    public static void main( String[] args ) throws Exception {
        // list card reader
        
        TerminalFactory fact = TerminalFactory.getDefault();
        System.out.println("Terminal Type = "+fact.getType());
        List<CardTerminal> readers = fact.terminals().list();
        
        System.out.println("Jumlah reader : "+readers.size());
        
        for (CardTerminal reader : readers) {
            System.out.println("Nama : "+reader.getName());
            
            System.out.println("Menunggu card ditempelkan");
            reader.waitForCardPresent(0);
            
            // Connect ke card
            Card card = reader.connect("*");
            System.out.println("Card Info : "+card);
            CardChannel channel = card.getBasicChannel();
            
            // Membaca UID
            byte[] apduBacaUid = new byte[]{
                (byte) 0xFF,
                (byte) 0xCA,
                (byte) 0x00,
                (byte) 0x00,
                (byte) 0x00
            };
            
            System.out.println("Mengirim command FF CA 00 00 00");
            
            CommandAPDU cmdBacaUid = new CommandAPDU(apduBacaUid);
            ResponseAPDU respBacaUid = channel.transmit(cmdBacaUid);
            
            System.out.println("Response : "+respBacaUid.toString());
            byte[] data = respBacaUid.getData();
            String responseData = DatatypeConverter.printHexBinary(data);
            System.out.println("Response Data : "+responseData);
            
            card.disconnect(false);
        }
    }
}
