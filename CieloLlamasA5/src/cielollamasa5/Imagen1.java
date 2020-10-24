/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cielollamasa5;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cielo Luz Elena Llamas Servin 18130122 Se imprementa el Runnable y
 * Timer para animar dos imagenes propuestas Elaborado el: 23/10/2020
 */
public class Imagen1 extends JFrame implements Runnable {

    Imagen1Panel P;

    int cont = 0, cont2 = 0;
    double menor = 1;

    Imagen1() {
        setTitle("18130122-Imagen1");
        P = new Imagen1Panel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(P);
        pack();
        Thread H1 = new Thread(this);
        H1.start();
        setVisible(true);
    }

    public static void main(String args[]) {
        new Imagen1();

    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(1000);
                if (P.punto1 == null && P.punto2 == null) {
                    P.punto1 = new Point(0, 0);
                    P.punto2 = P.punto1;
                    P.punto3 = new Point(102, 0);
                    P.punto4 = P.punto3;
                }
                P.punto2 = new Point(P.punto2.x + 5, P.punto2.y + 5);
                P.punto4 = new Point(P.punto4.x - 5, P.punto4.y + 5);
                P.repaint();
            } catch (Exception ex) {

                System.out.println("ERRRRPR" + ex);
            }
        }
    }

    class Imagen1Panel extends JPanel implements MouseMotionListener {

        BufferedImage img;
        Point punto1 = null, punto2 = null, punto3 = null, punto4 = null;

        public Imagen1Panel() {
            setPreferredSize(new Dimension(500, 500));
            addMouseMotionListener(this);
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(img, 0, 0, this);
            Shape Fondo = new Rectangle2D.Double(0, 0, this.getWidth(), this.getHeight());
            GradientPaint gp = new GradientPaint(0, 250, Color.white, 300, 0, Color.pink);
            g2d.setPaint(gp);
            g2d.fill(Fondo);
            g2d.drawRect(0, 0, 800, 600);
            g2d.setColor(Color.white);
            gp = new GradientPaint(0, 250, Color.black, 300, 250, Color.green);
            g2d.setPaint(gp);
            g2d.setStroke(new BasicStroke(4));
            GeneralPath medio = new GeneralPath();
            medio.moveTo(23, 148);
            medio.lineTo(31, 118);
            medio.lineTo(60, 107);
            medio.lineTo(45, 102);
            medio.lineTo(61, 97);
            medio.lineTo(33, 84);
            medio.lineTo(26, 52);
            medio.lineTo(57, 46);
            medio.lineTo(80, 64);
            medio.lineTo(77, 48);
            medio.lineTo(90, 59);
            medio.lineTo(87, 30);
            medio.lineTo(110, 9);
            medio.lineTo(133, 30);
            medio.lineTo(128, 61);
            medio.lineTo(140, 52);
            medio.lineTo(135, 67);
            medio.lineTo(161, 49);
            medio.lineTo(190, 59);
            medio.lineTo(183, 89);
            medio.lineTo(154, 100);
            medio.lineTo(167, 106);
            medio.lineTo(154, 110);
            medio.lineTo(182, 124);
            medio.lineTo(188, 153);
            medio.lineTo(158, 163);
            medio.lineTo(133, 141);
            medio.lineTo(136, 157);
            medio.lineTo(124, 146);
            medio.lineTo(127, 175);
            medio.lineTo(104, 197);
            medio.lineTo(81, 176);
            medio.lineTo(87, 146);
            medio.lineTo(74, 155);
            medio.lineTo(78, 140);
            medio.lineTo(54, 158);
            medio.closePath();
            // g2d.fill(medio);

            AffineTransform af = new AffineTransform();
            af.setToScale(0.5, 0.5);
            Shape chica = af.createTransformedShape(medio);
            af.setToTranslation(102, 60);
            chica = af.createTransformedShape(chica);
//            Shape Figurita1= af.createTransformedShape(chica);
//            af.setToTranslation(0, -60);
//            Figurita1 = af.createTransformedShape(chica);

            af = new AffineTransform();
            af.setToTranslation(50, 10);
            Shape Grande = af.createTransformedShape(medio);
//            g2d.fill(Grande);
            gp = new GradientPaint(0, 250, Color.red, 300, 250, Color.blue);
            g2d.setPaint(gp);
            //g2d.fill(chica);
            // g2d.draw(Figurita1);
            Shape Circulo = new Ellipse2D.Double(0, 0, 0, 0);
            
            Font font = new Font("Vivaldi Italic", Font.BOLD, 40);
        FontRenderContext frc = g2d.getFontRenderContext();
        GlyphVector gv = font.createGlyphVector(frc, "Accion: Se decrementa la ");
         GlyphVector gv2 = font.createGlyphVector(frc, " figura y se traslada");
         GlyphVector gv3 = font.createGlyphVector(frc, "Cielo Servin 18130122");
        Shape glifo = gv.getOutline(5, 250); //LUGAR DE PINTAR
        Shape glifo2 = gv2.getOutline(5, 290);
        Shape glifo3 = gv3.getOutline(5, 330);
       
        gp = new GradientPaint(0, 250, Color.BLACK, 200, 250, Color.blue);
        g2d.setPaint(gp);
        g2d.fill(glifo);
        g2d.fill(glifo2);
        g2d.fill(glifo3);
            

            menor -= .05;
            cont += 20;
            if (punto1 != null && punto2 != null && menor >= .5) {
                AffineTransform AF = new AffineTransform();
                AF.setToScale(menor, menor);
                Grande = AF.createTransformedShape(Grande);
                AF.setToTranslation(cont, 0);
                gp = new GradientPaint(100, 250, Color.black, 300, 250, Color.green);
                g2d.setPaint(gp);
                Grande = AF.createTransformedShape(Grande);
            }
            gp = new GradientPaint(100, 250, Color.black, 300, 250, Color.green);
            g2d.setPaint(gp);
            g2d.fill(Grande);
            if (punto3 != null && punto4 != null && menor >= .5) {
                AffineTransform AF = new AffineTransform();
                AF.setToScale(menor, menor);
                chica = AF.createTransformedShape(chica);
                AF.setToTranslation(cont, 0);
                gp = new GradientPaint(0, 250, Color.red, 300, 250, Color.blue);
                g2d.setPaint(gp);
                chica = AF.createTransformedShape(chica);
                System.out.println("MEnor:    " + menor);
                System.out.println("CHICA:   " + chica.getBounds());
            }else{
                menor=1;
                cont =0;
                cont2=0;
            }
            gp = new GradientPaint(0, 250, Color.red, 300, 250, Color.blue);
            g2d.setPaint(gp);
            g2d.fill(chica);
        }

        @Override
        public void mouseDragged(MouseEvent ev) {
        }

        @Override
        public void mouseMoved(MouseEvent ev) {
            Graphics g = getGraphics();
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.white);
            g2.fill(new Rectangle2D.Double(10, 480, 100, 20));
            g2.setColor(Color.black);
            g2.drawString("X:" + ev.getX() + " Y: " + ev.getY(), 10, 500);

        }
    }
}
