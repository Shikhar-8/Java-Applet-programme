import java.applet.*;
import java.awt.*;
import java.awt.event.*;// this library file for Action listner for BUTTON FUNCTIONING
public class DemoAwt extends Applet implements ActionListener// since java suppport single inheritence so i cant inherit another .Hece i will implementing a package calledACtion listener.
{
Button b1;
Label l1;
TextField t1;
public void init()// since web does not have contructor as windows have that why i have used init.
{
b1= new Button("ok");
l1=new Label("Enter 1st number");
t1= new TextField();
setLayout(null);// So that we set size of figures.

l1.setBounds(50,100,150,25);//(x,y,w,h)
t1.setBounds(205,100,100,25);
b1.setBounds(205,130,100,25);
b1.addActionListener(this);// whenever this is there there will be another file of Actionperformed as it would tell button what action to perform.
add(l1);
add(t1);
add(b1);
}
public void actionPerformed(ActionEvent ae)//object is created of actionevent 
// adding this class is important for BUTTON functioning otherwise error will come.
{
	if(ae.getSource()==b1)// here i have equal to b1 as how would i know which button is pressed. in this case b1 is pressed.
	{
		int a=Integer.parseInt(t1.getText());//getting text from t1 and converting to integer using Integer.parseInt
		if(a%2==0)
		{
			t1.setText("num is Even="+a);// to display output i have selected t1 textbox only(t1.setText()) to print my result.
		}
		else
		{
			t1.setText("num is odd="+a);// it is very important to add quotes in setText(""+a) if you are printing only values
		}
	}
}
	
} 
/*<applet Code="DemoAwt.java" height="400" width ="700">
</applet>*/