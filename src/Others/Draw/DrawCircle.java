package Others.Draw;

import javax.swing.*;
import java.awt.*;

/*
*演示如何在屏幕上画一个圆
* 1.线定义一个MyPanel，继承自JPanel，画图形就在面板上画
* 2.Frame 框架，窗口 ，在窗口中嵌入一个面板
 */

@SuppressWarnings({"all"})
public class DrawCircle extends JFrame
{

    private MyPanel mp  = null;
    public static void main(String[] args)
    { 
        new DrawCircle();
    }

    public DrawCircle()
    {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //设置点击窗口的小x，程序会退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel
{
    //Mypanel是一个画板
    //Graphics是一个画笔
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画一个圆形
        g.drawOval(10,10,100,100 );
        //画直线
        //drawLine(int x1,int y1,int x2,int y2);
        //画矩形边框
        //drawRect(int x,int y,int width,int height);
        //画椭圆边框
        //drawOval(int x,int y,int width,int height);
        //填充矩形
        //fillRect(int x,int y,int width,int height);
        //填充椭圆
        //fillOval(int x,int y,int width,int height);
        //画图片
        //Image image = Toolkit.getDefaultToolkit().createImage(Panel.class.getResource("/bg.png"));
        //drawImage(Image image,int x,int y,200,200,this);
        //画字符串
        //drawString(String str,nt x,int y);
        //设置画笔的字体
        //setFont(Font font);
        //设置画笔的颜色
        //setColor(Color c);
    }
}


