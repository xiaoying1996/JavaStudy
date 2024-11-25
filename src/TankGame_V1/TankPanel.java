package TankGame_V1;

import javax.swing.*;
import java.awt.*;

/*
 *坦克大战的绘图区域
 */
public class TankPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public TankPanel(){
        hero = new Hero(100,100);//初始化自己的坦克
    }

    @Override
    public void paint(Graphics g) {
         super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色
    }
}
