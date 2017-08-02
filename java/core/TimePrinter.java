import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

import javax.swing.Timer;

public class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        Date now = new Date();
        System.out.println("Now is " + now);
    }

    public static void main(String[] args) throws IOException {
        ActionListener listener = new TimePrinter();
        Timer timer = new Timer(2000, listener);
        timer.start();
        System.in.read();        
    }
}