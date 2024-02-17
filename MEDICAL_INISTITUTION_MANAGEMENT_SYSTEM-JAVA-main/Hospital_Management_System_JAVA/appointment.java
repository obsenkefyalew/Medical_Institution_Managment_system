import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class appointment{
	public static void main(String s[]){
		Window w=new Window();
	}
}

class Window extends Frame{
	public Window(){
		super("Confirm Appointment :");
		setSize(260,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		Button b=new Button("Confirm Appointment");
		Button b2=new Button("Exit");
		//---------------------------
		Label L5=new Label("                             Appointment                                  ");
		Label L1=new Label("Doctor Name :");
		Label L2=new Label("Doctor ID :");
		Label L4=new Label("                                                ");
		
		add(L5);add(L1);add(tf2);add(L2);add(tf3);add(L4);add(b);add(b2);
		setLayout(new FlowLayout());
	}
}
