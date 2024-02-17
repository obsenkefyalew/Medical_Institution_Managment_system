import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class doctor_info{
	public static void main(String s[]){
		Window w=new Window();
	}
}

class Window extends Frame{
	public Window(){
		super("Doctor Info:");
		setSize(600,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		Button b1=new Button("Appoint");
		Button b2=new Button("Appoint");
		Button b3=new Button("Appoint");
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		TextField tf4=new TextField(15);
		TextField tf5=new TextField(15);
		TextField tf6=new TextField(15);
		TextField tf7=new TextField(15);
		TextField tf8=new TextField(15);
		TextField tf9=new TextField(15);
		//---------------------------
		Label L1=new Label("                          Id                      ");
		Label L2=new Label("    Name                      ");
		Label L3=new Label("  Degree                      ");
		Label L4=new Label(" Appoint                 ");
		
		add(L1);add(L2);add(L3);add(L4);
		add(tf1);add(tf2);add(tf3);add(b1);
		add(tf4);add(tf5);add(tf6);add(b2);
		add(tf7);add(tf8);add(tf9);add(b3);
		setLayout(new FlowLayout());
	}
}