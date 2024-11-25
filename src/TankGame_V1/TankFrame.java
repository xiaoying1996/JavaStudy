package TankGame_V1;

import javax.swing.*;

public class TankFrame extends JFrame {
    //定义一个Panel
    TankPanel mp = null;
    public static void main(String[] args) {
        TankFrame tankFrame = new TankFrame();
    }

    public TankFrame(){
        mp = new TankPanel();
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
