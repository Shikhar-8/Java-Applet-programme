import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DemoForm extends Applet implements ActionListener
{
String a1="";
String a2="";
String a3="";
String a4="";
String a5="";
String a6="";
String a7="";
String a8="";
String a9="";
String a10="";
 Button b1;
 Label l1;
 Label l2;
 Label l3;
 Label l4;
 Label l5;
 Label l6;
 Label l7;
 Label l8;
 Label l9;
 Label l10;
 TextField t1;
 TextField t2;
 TextField t3;
 TextField t4;
  TextField t5;
 TextField t6;
 TextField t7;
 TextField t8;
  TextField t9;
 TextField t10;
 TextField t11;
  
  public void init()
  {
  b1=new Button("Submit");
  l1=new Label("Enter First name");
  l2=new Label("Enter Middle name");
  l3=new Label("Enter Last name");
  l4=new Label("Enter City");
  l5=new Label("Enter State");
  l6=new Label("Enter Religon");
  l7=new Label("Enter Address");
  l8=new Label("Enter This");
  l9=new Label("Enter That");
  l10=new Label("Enter and That");

  t1=new TextField();
  t2=new TextField();
  t3=new TextField();
  t4=new TextField();
  t5=new TextField();
  t6=new TextField();
  t7=new TextField();
  t8=new TextField();
  t9=new TextField();
  t10=new TextField();
  t11=new TextField();



  setLayout(null);
  l1.setBounds(50,100,100,25);
  l2.setBounds(50,130,100,25);
  l3.setBounds(50,160,100,25);
  l4.setBounds(50,190,100,25);
  l5.setBounds(50,220,100,25);
  l6.setBounds(50,250,100,25);
  l7.setBounds(50,280,100,25);
  l8.setBounds(50,310,100,25);
  l9.setBounds(50,340,100,25);
  l10.setBounds(50,370,100,25);
  t1.setBounds(200,100,100,25);
  t2.setBounds(200,130,100,25);
  t3.setBounds(200,160,100,25);
  t4.setBounds(200,190,100,25);
  t5.setBounds(200,220,100,25);
  t6.setBounds(200,250,100,25);
  t7.setBounds(200,280,100,25);
  t8.setBounds(200,310,100,25);
  t9.setBounds(200,340,100,25);
  t10.setBounds(200,370,100,25);
  t11.setBounds(125,460,100,25);
  b1.setBounds(125,420,100,25);

  b1.addActionListener(this);

  add(t1);
  add(t2);
    add(t3);
  add(t4);
    add(t5);
  add(t6);
    add(t7);
  add(t8);
    add(t9);
  add(t10);
    add(t11);
  add(b1);
    add(l1);
  add(l2);
    add(l3);
  add(l4);
  add(l5);
  add(l6);
    add(l7);
  add(l8);
    add(l9);
  add(l10);
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		a1=t1.getText();// i have taken these because only after pressing button only it will check values of textfield.
		a2=t2.getText();
		a3=t3.getText();
		a4=t4.getText();
		a5=t5.getText();
		a6=t6.getText();
		a7=t7.getText();
		a8=t8.getText();
		a9=t9.getText();
		a10=t10.getText();
		

		if(a1.equals("") || a2.equals("") || a3.equals("") || a4.equals("") || a5.equals("") || a6.equals("") || a7.equals("") || a8.equals("") || a9.equals("") || a10.equals(""))
          {
           t11.setText("Please fill all entries");
		}
		else 
		{
			t11.setText("Record Successfull");
		}


	}

}

  }
  
  /*<applet Code="DemoForm.java" height="1500" width = "1500">
</applet>*/