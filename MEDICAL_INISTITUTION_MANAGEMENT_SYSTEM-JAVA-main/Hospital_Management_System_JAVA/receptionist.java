import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class receptionist{
	public static void main(String s[]){
		Receptionist w=new Receptionist();
	}
}

class Receptionist extends Frame{
	public Receptionist(){
		super("Patient info :");
		setSize(260,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		Button b=new Button("OK");
		Button b2=new Button("Exit");
		//---------------------------
		Label L5=new Label("                             Receptionist                                  ");
		Label L1=new Label("Patient ID:");
		Label L2=new Label("Ammount Paid :");
		Label L4=new Label("                                                ");
		
		add(L5);add(L1);add(tf2);add(L2);add(tf3);add(L4);add(b);add(b2);
		setLayout(new FlowLayout());
	}
}
