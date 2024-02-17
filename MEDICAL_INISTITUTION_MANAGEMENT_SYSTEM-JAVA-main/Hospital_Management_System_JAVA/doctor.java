import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class doctor{
	public static void main(String s[]){
		Doctor w=new Doctor();
	}
}

class Doctor extends Frame{
	public Doctor(){
		super("Doctor Login :");
		setSize(250,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		Button b=new Button("OK");
		Button b2=new Button("Exit");
		//---------------------------
		Label L5=new Label("                              Doctor                                  ");
		Label L1=new Label("Name :");
		Label L2=new Label("        ID :");
		Label L3=new Label("Patient ID :");
		Label L4=new Label("                                                ");
		
		add(L5);add(L1);add(tf2);add(L2);add(tf3);add(L3);add(tf1);add(L4);add(b);add(b2);
		setLayout(new FlowLayout());
	}
}
