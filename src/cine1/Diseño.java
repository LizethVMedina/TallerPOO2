/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lizeth
 */
public class Diseño extends JFrame implements ActionListener{

    JPanel p1,p2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10; 
    
    int acumulador=0;
    
    public Diseño()
    {
       Pelicula pe1=new Pelicula("El extraño mundo de Jack","Henry Selick","Rey de calabazas quiere celebrar navidad a su manera",1996);
       Pelicula pe2=new Pelicula("Coraline","Henry Selik","Niña descubre un puerta secreta que la lleva a una realidad alterna",2009);
       Pelicula pe3=new Pelicula("Beetlejuice, el super fantasma","Tim Burton","Difunta pareja quiere recuperar su casa",1988);
       Pelicula pe4=new Pelicula("El cadaver de la novia","Tim Burton","Pianista accidentalmente se casa con una mujer digunta",2005);
       Pelicula pe5=new Pelicula("El joven manos de tijeras","Tim Burton","Siendo un diseño de un inventor fallecido se convierte en una celebridad",1991);
       Pelicula pe6=new Pelicula("La princesa y el sapo","John Musker, Ron Clements","Mundos opuestos se encuentran tras un hechizo lanzado por un brujo y luchan para encontrar la solución",2009);
       Pelicula pe7=new Pelicula("Shrek","Andrew Adamson, Vicky Jenson","La soledad de un ogro lo lleva a cumplir una mision para poder seguir asi pero esta tenia otros planes para el",2001);
       Pelicula pe8=new Pelicula("Un jefe en pañales","Tom McGrath","La llegada de su hermanito hara que todo se salga de control en la vida de tim",2017);
       Pelicula pe9=new Pelicula("Madagascar","Tom McGrath,Eric Darnell","Cuatro animales mimados se escapan del zoologico ahora deben sobrevivir en la selva",2005);     
       Pelicula pe10=new Pelicula("Como entrenar a tu dragon","Dean DeBlois, Chris Sanders","",2010);
       ArrayList caja=new ArrayList();
     
        caja.add(pe1);
        caja.add(pe2);
        caja.add(pe3);
        caja.add(pe4);
        caja.add(pe5);
        caja.add(pe6);
        caja.add(pe7);
        caja.add(pe8);
        caja.add(pe9);
        caja.add(pe10);
        setBounds(100,100,800,500);
        setLayout(new GridLayout());    
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel(caja.get(0).toString());
        t1 = new JTextField(10);
        b1 = new JButton("Vender Boletos: EL extraño mundo");
        b1.addActionListener(this);
        b1.setActionCommand("Vender Boletos: EL extraño mundo");
        p1.add(l1);
        p2.add(t1);
        p2.add(b1);
        p1.setBackground(Color.cyan);
        l2 = new JLabel(caja.get(1).toString());
        t2 = new JTextField(10);
        b2= new JButton("Vender Boletos: Coraline");
        b2.addActionListener(this);
        b2.setActionCommand("Vender Boletos: Coraline");
        p1.add(l2);
        p2.add(t2);
        p2.add(b2);
        p2.setBackground(Color.orange);
        l3 = new JLabel(caja.get(2).toString());
        t3 = new JTextField(10);
        b3= new JButton("Vender Boletos: Beetlejuice");
        b3.addActionListener(this);
        b3.setActionCommand("Vender Boletos: Beetlejuice");
        p1.add(l3);
        p2.add(t3);
        p2.add(b3);
        l4 = new JLabel(caja.get(3).toString());
        t4 = new JTextField(10);
        b4= new JButton("Vender Boletos: EL cadaver");
        b4.addActionListener(this);
        b4.setActionCommand("Vender Boletos: EL cadaver");
        p1.add(l4);
        p2.add(t4);
        p2.add(b4);
        l5 = new JLabel(caja.get(4).toString());
        t5 = new JTextField(10);
        b5= new JButton("Vender Boletos: EL joven manos");
        b5.addActionListener(this);
        b5.setActionCommand("Vender Boletos: EL joven manos");
        p1.add(l5);
        p2.add(t5);
        p2.add(b5);
        l6 = new JLabel(caja.get(5).toString());
        t6 = new JTextField(10);
        b6= new JButton("Vender Boletos: Princesa y sapo");
        b6.addActionListener(this);
        b6.setActionCommand("Vender Boletos: Princesa y sapo");
        p1.add(l6);
        p2.add(t6);
        p2.add(b6);
        l7 = new JLabel(caja.get(6).toString());
        t7 = new JTextField(10);
        b7= new JButton("Vender Boletos: Shrek");
        b7.addActionListener(this);
        b7.setActionCommand("Vender Boletos: Shrek");
        p1.add(l7);
        p2.add(t7);
        p2.add(b7);
        l8 = new JLabel(caja.get(7).toString());
        t8 = new JTextField(10);
        b8= new JButton("Vender Boletos: Un jefe");
        b8.addActionListener(this);
        b8.setActionCommand("Vender Boletos: Un jefe");
        p1.add(l8);
        p2.add(t8);
        p2.add(b8);
        l9 = new JLabel(caja.get(8).toString());
        t9 = new JTextField(10);
        b9= new JButton("Vender Boletos: Madagascar");
        b9.addActionListener(this);
        b9.setActionCommand("Vender Boletos: Madagascar");
        p1.add(l9);
        p2.add(t9);
        p2.add(b9);
        l10 = new JLabel(caja.get(9).toString());
        t10 = new JTextField(10);
        b10= new JButton("Vender Boletos: Entrenar dragon");
        b10.addActionListener(this);
        b10.setActionCommand("Vender Boletos: Entrenar dragon");
        p1.add(l10);
        p2.add(t10);
        p2.add(b10);
        b11 = new JButton("Total");
        b11.addActionListener(this);
        b11.setActionCommand("Total");
        p2.add(b11);
        add(p1);
        add(p2);
        setVisible(true);

    }
       
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
         int  acu1,acu2,acu3,acu4,acu5,acu6,acu7,acu8,acu9,acu10, r1=0,r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0,r9=0,r10=0;
        if(ae.getActionCommand().equals("Vender Boletos: El extraño")){
            acu1=Integer.parseInt(t1.getText());
            acumulador+=acu1; 
            r1+=acu1;
    }
          if(ae.getActionCommand().equals("Vender Boletos: Coraline")){
            acu2=Integer.parseInt(t2.getText());
            acumulador+=acu2; 
            r2+=acu2;
        }

        if(ae.getActionCommand().equals("Vender Boletos: Beetlejuice")){

             acu3=Integer.parseInt(t3.getText());
            acumulador+=acu3; 
            r3+=acu3; 
        }

        if(ae.getActionCommand().equals("Vender Boletos: El cadaver")){
            acu4=Integer.parseInt(t4.getText());
            acumulador+=acu4; 
            r4+=acu4;
        }

        if(ae.getActionCommand().equals("Vender Boletos: El joven manos")){
            acu5=Integer.parseInt(t5.getText());
            acumulador+=acu5; 
            r5+=acu5;
        }

        if(ae.getActionCommand().equals("Vender Boletos: Princesa y sapo")){
            acu6=Integer.parseInt(t6.getText());
            acumulador+=acu6; 
            r6+=acu6;
        }

        if(ae.getActionCommand().equals("Vender Boletos: Shrek")){
            acu7=Integer.parseInt(t7.getText());
            acumulador+=acu7; 
            r7+=acu7;
        }

        if(ae.getActionCommand().equals("Vender Boletos: Un jefe")){

            acu8=Integer.parseInt(t8.getText());
            acumulador+=acu8; 
            r8+=acu8;
        }

        if(ae.getActionCommand().equals("Vender Boletos: Madagascar")){
            acu9=Integer.parseInt(t9.getText());
            acumulador+=acu9; 
            r9+=acu9;
        }

        if(ae.getActionCommand().equals("Vender Boletos: Entrenar dragon")){
            acu10=Integer.parseInt(t10.getText());
            acumulador+=acu10; 
            r10+=acu10;
        }

        if(ae.getActionCommand().equals("Total")){

            JOptionPane.showMessageDialog(null,"Total pelicula 1:"+r1+
                   "\nTotal pelicula 2:"+r2+
                    "\nTotal pelicula 3:"+r3+
                    "\nTotal pelicula 4:"+r4+
                    "\nTotal pelicula 5:"+r5+
                    "\nTotal pelicula 6:"+r6+
                    "\nTotal pelicula 7:"+r7+
                    "\nTotal pelicula 8:"+r8+
                    "\nTotal pelicula 9:"+r9+
                    "\nTotal pelicula 10:"+r10+
                    "\nEl total de la venta es:"+acumulador);
        }
    }
    }
  