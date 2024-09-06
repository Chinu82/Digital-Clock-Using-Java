import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Window extends JFrame{
    private JLabel heading;
    private JLabel clockLabel;

    private Font  font =new Font("",Font.BOLD,35); 
    Window(){
        setLayout(null);
        super.setTitle("Digital Clock");
        setSize(600,350);
        setLocation(500,200);
        this.createGUI();
        this.clockStart();
        setVisible(true);
    }
    public void createGUI(){

        heading = new JLabel("CLock");

        clockLabel = new JLabel("clock");

        heading.setFont(font);
        clockLabel.setFont(font);

        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }
    public void clockStart(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t = new Date().toString();
                clockLabel.setText(t);
            }
        });

        timer.start();
    }
}
