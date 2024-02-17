import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class report{
	public static void main(String s[]){
		window w=new window();
	}
}

class window extends Frame{
	public window(){
		super("Test Info:");
		setSize(500,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		Label L5=new Label("           Serial :");
		Label L6=new Label("Report :");
		Button b=new Button("X-Ray");
		Button b2=new Button("C.B.C");
		Button b3=new Button("Ultrasonography");
		Button b4=new Button("Urine Test");
		Button b5=new Button("Back");
		//---------------------------
		Label L1=new Label("       1.       ");
		Label L2=new Label("       2.       ");
		Label L3=new Label("       3.       ");
		Label L4=new Label("       4.       ");
		Label L9=new Label("                           ");
		add(L5);add(L1);add(L2);add(L3);add(L4);add(L9);
		add(L6);add(b);add(b2);add(b3);add(b4);add(b5);
		setLayout(new FlowLayout());
	}
}