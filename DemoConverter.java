import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoConverter extends Applet implements ActionListener
{
	String a1="";// used for storing selected option.
	String a2="";
	Button b1;
	Label l1;
	Label l2;
	Label l3;
	Label l4;
	Choice ch1;
	Choice ch2;	
	TextField t1;
	TextField t2;
	public void init()
	{
	b1=new Button("Convert");
	l1=new Label("Enter Input Type");
	l4=new Label("Result");
	l2=new Label("Select Input Type");
	l3=new Label("Select Output Type");
	t1=new TextField();
	t2=new TextField();
	ch1=new Choice();
	ch2=new Choice();

	setLayout(null);
	l1.setBounds(50,100,150,25);
	l2.setBounds(50,130,150,25);
	l3.setBounds(50,160,150,25);
	l4.setBounds(50,190,150,25);
	t1.setBounds(205,100,150,25);
	ch1.setBounds(205,130,150,25);
	ch2.setBounds(205,160,150,25);
	t2.setBounds(205,190,150,25);	
	b1.setBounds(100,220,150,25);
	b1.addActionListener(this);

    ch1.addItem("Select");
    ch1.addItem("KM");
    ch1.addItem("Miles");
    ch1.addItem("Foot");
    ch1.addItem("Inch");

    ch2.addItem("Select");
    ch2.addItem("KM");
    ch2.addItem("Miles");
    ch2.addItem("Foot");
    ch2.addItem("Inch");
   
	add(l1);
	add(t1);
	add(b1);
	add(l2);
	add(l3);
	add(t2);
	add(ch1);
	add(l4);
	add(ch2);

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			double a=Double.parseDouble(t1.getText());
			double b=0.0;
			a1=ch1.getSelectedItem();// here i am storing selected option in a1 , then i will compare that stored value and operations.
			a2=ch2.getSelectedItem();
			if(a1.equals("KM") && a2.equals("Miles"))
			{
				b=a*0.621;
			}
			else if(a1.equals("KM") && a2.equals("Foot"))
			{
				b=a*3280;
			}
			else if(a1.equals("KM") && a2.equals("Inch"))
			{
				b=a*39370;
			}
			else if(a1.equals("Miles") && a2.equals("KM"))
			{
				b=a*1.609;
			}
			else if(a1.equals("Miles") && a2.equals("Foot"))
			{
				b=a*222;
			}
			else if(a1.equals("Miles") && a2.equals("Inch"))
			{
				b=a*3970;
			}
			if(a1.equals("Foot") && a2.equals("Miles"))
			{
				b=a*621;
			}
			else if(a1.equals("Foot") && a2.equals("KM"))
			{
				b=a*352;
			}
			else if(a1.equals("Foot") && a2.equals("Inch"))
			{
				b=a*0.35;
			}
			else if(a1.equals("Inch") && a2.equals("Miles"))
			{
				b=a*3.621;
			}
			else if(a1.equals("Inch") && a2.equals("Foot"))
			{
				b=a*32.80;
			}
			else if(a1.equals("Inch") && a2.equals("KM"))
			{
				b=a*30;
			}
			t2.setText(""+b);


		}
	}
}
/*<applet Code="DemoConverter.java" height="1500" width = "1500">
</applet>*/