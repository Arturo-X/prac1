Menu profesor: añadir preguntas a un banco de reactivos (almacenados en archivo)
		-modificar reactivos
		-eliminar reactivos
		-reporte de calificaciones

menu alumno: aplicacion del examen y evaluacion*/
import java.awt.*;
import java.awt.event.*;
public class Examen implements ActionListener {
//declaracion 
Frame f;
CardLayout card;//card
Panel p1,p2,p3,p4,p5;
Label lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,eva;
Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27;
CheckboxGroup cg,c;
Button b1,b2,b3,b4,b5,b6;
Font tip;
int a; 


public Examen(){
a=0;
f = new Frame ("Exam");
 card = new CardLayout();//card


tip=new Font("SansSerif" , Font.PLAIN,20);


p1 = new Panel(); p2 = new Panel(); p3 = new Panel(); p4 = new Panel(); p5 =new Panel();
eva=new Label();
lb1 = new Label("¿Quien escribio las aventuras de Sherlock Holmes?");
lb1.setForeground(Color.cyan);
cb1=new Checkbox(" Agatha Christie",false,cg);
cb2=new Checkbox("Sir Arthur Conan Doyle",false,cg);
cb3=new Checkbox("Herman Hesse",false,cg);

lb2 = new Label("¿Cuales son las posibilidades de morir impactado por un rayo?");
lb2.setForeground(Color.black);
cb4=new Checkbox(" 1 en 10",false,cg);
cb5=new Checkbox("1 en 1 millon",false,cg);
cb6=new Checkbox("ninguna",false,cg);

lb3 = new Label("¿Cual de estas es una libreria de java?");
lb3.setForeground(Color.cyan);
cb7=new Checkbox(" java awt:*;",false,cg);
cb8=new Checkbox("<stdio.h>",false,cg);
cb9=new Checkbox("gonvil",false,cg);

lb4=new Label("¿Que pais tiene mayor indice de obesidad actualmente?");
lb4.setForeground(Color.black);
cb10=new Checkbox(" Estados Unidos",false,cg);
cb11=new Checkbox("Mexico",false,cg);
cb12=new Checkbox("Japon",false,cg);

lb5=new Label("¿De que esta compuesta el agua?");
lb5.setForeground(Color.cyan);
cb13=new Checkbox("Hidroxido de amonio",false,cg);
cb14=new Checkbox("Helio y oxigeno",false,cg);
cb15=new Checkbox("Hidrogeno y oxigeno",false,cg);

lb6=new Label("¿Existen los seres de otros planetas?");
lb6.setForeground(Color.black);
cb16=new Checkbox("Si",false,cg);
cb17=new Checkbox("no",false,cg);
cb18=new Checkbox("quien sabe",false,cg);

lb7=new Label("¿Que es fractal?");
lb7.setForeground(Color.cyan);
cb19=new Checkbox("Es un instrumento que refracta las imagenes y al hacerlo las vuelve 1000x veces mas grandes",false,cg);
cb20=new Checkbox("es un objeto geométrico cuya estructura básica, fragmentada o irregular, se repite a diferentes escalas",false,cg);
cb21=new Checkbox("ninguna de las anteriores",false,cg);

lb8=new Label("¿Los dinosaurios tenian plumas?");
lb8.setForeground(Color.black);
cb22=new Checkbox("si",false,cg);
cb23=new Checkbox("no",false,cg);
cb24=new Checkbox("no, solo Un reptil",false,cg);

lb9=new Label("Estas satisfecho con este cuestionario y sus preguntas ");
lb9.setForeground(Color.cyan);
cb25=new Checkbox("Si",false,cg);
cb26=new Checkbox("no",false,cg);
cb27=new Checkbox("no lo se/no me interesa",false,cg);

b1=new Button("siguiente");
b2=new Button("siguiente");
b3=new Button("siguiente");
b4=new Button("siguiente");
b5=new Button("siguiente");
b6=new Button("evaluar");
c=new CheckboxGroup();

f.setLayout(card);

//anadir 

p1.setBackground(Color.lightGray);
p1.setLayout(new GridLayout(12,12,12,5));
p1.add(lb1);

p1.add(cb1);
p1.add(cb2);
p1.add(cb3);

p1.setLayout(new GridLayout(10,10,10,1));
p1.add(lb2);

p1.add(cb4);
p1.add(cb5);
p1.add(cb6);

p2.setBackground(Color.lightGray);
p2.setLayout(new GridLayout(10,10,10,1));
p2.add(lb3);

p2.add(cb7);
p2.add(cb8);
p2.add(cb9);

p2.setLayout(new GridLayout(10,10,10,1));
p2.add(lb4);


p2.add(cb10);
p2.add(cb11);
p2.add(cb12);

p3.setBackground(Color.lightGray);
p3.setLayout(new GridLayout(10,10,10,1));
p3.add(lb5);


p3.add(cb13);
p3.add(cb14);
p3.add(cb15);

p3.setLayout(new GridLayout(10,10,10,1));
p3.add(lb6);

p3.add(cb16);
p3.add(cb17);
p3.add(cb18);

p4.setBackground(Color.lightGray);
p4.setLayout(new GridLayout(10,10,10,1));
p4.add(lb7);


p4.add(cb19);
p4.add(cb20);
p4.add(cb21);

p4.setLayout(new GridLayout(10,10,10,1));
p4.add(lb8);

p4.add(cb22);
p4.add(cb23);
p4.add(cb24);

p5.setBackground(Color.lightGray);
p5.setLayout(new GridLayout(13,13,13,1));
p5.add(lb9);

p5.add(cb25);
p5.add(cb26);
p5.add(cb27);

p5.add(eva);

p1.add(b1);
p2.add(b2);
p3.add(b3);
p4.add(b4);
p5.add(b5);
p5.add(b6);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);

f.setFont(tip);

f.add(p1, "First"); f.add(p2, "Second"); f.add(p3, "Third");

f.add(p4, "Fourth"); f.add(p5, "Fifth");
card.show(f, "First");
f.setSize(700,400);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e){

  if(e.getActionCommand()=="siguiente"){
      card.next(f);
}
else  if(e.getActionCommand()=="evaluar"){
if(cb2.getState()==true)
a++;else a--;
if(cb5.getState()==true)
a++;else a--;
if(cb7.getState()==true)
a++;else a--;
if(cb11.getState()==true)
a++;else a--;

if(cb15.getState()==true)
a++;else a--;
if(cb16.getState()==true)
a++;else a--;

if(cb20.getState()==true)
a++;else a--;
if(cb22.getState()==true)
a++;else a--;

if(cb27.getState()==true)
a++;else a--;
System.out.println(a);
eva.setText("Las r3spu3stas corr3ctas son " +a);
if(a>=9){
eva.setText("Bien tu evaluacion ha terminado con todas las respuestas correctas!!!");
} 
eva.setForeground(Color.red);
}

//f.dispose();


}



//main 
public static void main(String args[]){
Examen obj=new Examen();

}
}