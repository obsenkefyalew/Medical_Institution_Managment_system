import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class sign_next{
	public static void main(String s[]){
		Patient p =new Patient();
	}
}

class Patient extends Frame{
	public Patient(){
		super("Patient Account :");
		setSize(300,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		Button b=new Button("Doctor Info  ");
		Button b2=new Button("Test Info  ");
		Button b3=new Button("Exit");
		//---------------------------
		Label L1=new Label("User Name :");
		Label L2=new Label("User ID :");
		Label L3=new Label("                                                                   ");
		add(L1);add(tf1);add(L2);add(tf2);add(b);add(b2);add(L3);add(b3);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent a2)
	{
		String st = a2.getActionCommand();
		/*if(st == "Doctor Info")
		{	
			this.setVisible(false);
			f.setVisible(true);
		}
		if(st == "Test Info")
		{	
			this.setVisible(false);
			Patient p = new Patient(this);
		}
		if(st == "Exit")
		{	
			System.exit(0);
		}*/
	}
}

