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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Cielo Luz Elena Llamas Servin 18130122 Se imprementa el Runnable y
 * Timer para animar dos imagenes propuestas Elaborado el: 23/10/2020
 */
public class Imagen2 extends JFrame {

    Imagen2Panel P;
    int cont = 0, cont2 = 0;

    Imagen2() {
        setTitle("18130122-Imagen2");
        P = new Imagen2Panel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(P);
        pack();
        setVisible(true);
    }

    public static void main(String args[]) {
        new Imagen2();
    }

    class Imagen2Panel extends JPanel implements MouseMotionListener, ActionListener {

        BufferedImage img;
        Point punto1 = null, punto2 = null, punto3 = null, punto4 = null;

        public Imagen2Panel() {
            setPreferredSize(new Dimension(800, 600));
            addMouseMotionListener(this);
            Timer V = new Timer(1000, this);
            V.start();
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.drawImage(img, 0, 0, this);
            Shape Fondo = new Rectangle2D.Double(0, 0, this.getWidth(), this.getHeight());
            GradientPaint gp = new GradientPaint(0, 250, Color.white, 300, 0, Color.pink);
            g2d.setPaint(gp);
            g2d.fill(Fondo);
            g2d.setStroke(new BasicStroke(3));
            GeneralPath medio = new GeneralPath();
            medio.moveTo(211, 147);
            medio.lineTo(206, 147);
            medio.lineTo(197, 127);
            medio.lineTo(195, 163);

            medio.curveTo(183, 210, 113, 190, 146, 134);
            medio.curveTo(146, 134, -50, 202, 116, 280);
            medio.curveTo(116, 280, 83, 211, 155, 251);
            medio.curveTo(155, 251, 180, 200, 212, 273);

            medio.closePath();
            AffineTransform af = new AffineTransform();
            af.setToScale(-1, 1);
            Shape n2 = af.createTransformedShape(medio);
            af.setToTranslation(422, 0);
            n2 = af.createTransformedShape(n2);
            Area m = new Area(medio);
            m.add(new Area(n2));
            Shape c1;
            c1 = new Ellipse2D.Double(10, 102, 400, 220);
            af = new AffineTransform();
            af.setToScale(0.9, 0.9);
            Shape chica = af.createTransformedShape(c1);
            af.setToTranslation(20, 20);
            chica = af.createTransformedShape(chica);
            gp = new GradientPaint(40, 200, Color.green, 250, 400, Color.magenta);
            g2d.setPaint(gp);
            //g2d.fill(chica);
            Area c = new Area(chica);
            c.subtract(m);
            Area c1A2 = new Area(c1);
            c1A2.subtract(c);

            gp = new GradientPaint(0, 0, Color.blue, 100, 300, Color.black);
            g2d.setPaint(gp);
            // g2d.fill(c1A2);

            cont += 5;
            System.out.println("Cont" + cont);
            if (punto1 != null && punto2 != null && cont <= 150) {
                AffineTransform AF = new AffineTransform();
                chica = AF.createTransformedShape(chica);
                AF.setToTranslation(cont, cont);

                Color col = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
                g2d.setColor(col);
                chica = AF.createTransformedShape(chica);
                g2d.fill(chica);

            }
            if (punto1 != null && punto2 != null && cont <= 150) {
                AffineTransform AF = new AffineTransform();
                Shape bat = AF.createTransformedShape(c1A2);
                AF.setToTranslation(cont, cont);

                gp = new GradientPaint(0, 0, Color.blue, 100, 300, Color.black);
                g2d.setPaint(gp);
                bat = AF.createTransformedShape(bat);
                g2d.fill(bat);

            } else {
                cont = 0;
            }
            Font font = new Font("Vivaldi Italic", Font.BOLD, 40);
            FontRenderContext frc = g2d.getFontRenderContext();
            GlyphVector gv = font.createGlyphVector(frc, "Accion: Se Cambia color ");
            GlyphVector gv2 = font.createGlyphVector(frc, "a la figura y se traslada");
            GlyphVector gv3 = font.createGlyphVector(frc, "Cielo Servin 18130122");
            Shape glifo = gv.getOutline(400, 30); //LUGAR DE PINTAR
            Shape glifo2 = gv2.getOutline(400, 80);
            Shape glifo3 = gv3.getOutline(400, 140);
            gp = new GradientPaint(400, 250, Color.BLACK, 850, 0, Color.green);
            g2d.setPaint(gp);
            g2d.fill(glifo);
            g2d.fill(glifo2);
            g2d.fill(glifo3);

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

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                if (punto1 == null && punto2 == null) {
                    punto1 = new Point(0, 0);
                    punto2 = punto1;

                }
                System.out.println("Aqui entro");
                punto2 = new Point(punto2.x + 5, punto2.y + 5);
                this.repaint();
            } catch (Exception e) {
                System.out.println("Error" + e);
            }

        }
    }
}
