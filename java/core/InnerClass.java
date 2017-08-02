import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;

import javax.swing.Timer;

public class InnerClass {

    private boolean beep;

    public static void main(String[] args) throws IOException{
        InnerClass inn = new InnerClass(true);
        inn.Start();
    }

    public InnerClass(boolean beep) {
        this.beep = beep;
    }

    public void Start() throws IOException{
        Timer timer = new Timer(2000, new TimePrinter());
        timer.start();
        System.in.read();
    }

    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Date now=new Date();
            System.out.println("now is " + now);
            if (InnerClass.this.beep)
                System.out.println("beep...");
        }
    }
}