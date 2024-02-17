import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class signin{
	public static void main(String s[]){
		Sign_IN s1=new Sign_IN();

	}
}

class Sign_IN extends Frame{
	public Sign_IN(Window w){
		super("Sign in");
		setSize(260,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		Button b=new Button("Login");
		Button b2=new Button("Back");
		//---------------------------
		Label L1=new Label("                       SIGN IN                                  ");
		Label L2=new Label("User Name :");
		Label L3=new Label("Password :");
		Label L4=new Label("Click Here To Login:");
		Label L5=new Label("ID :");

		add(L1);add(L5);add(tf3);add(L2);add(tf1);add(L3);add(tf2);add(L4);add(b);add(b2);
		setLayout(new FlowLayout());

	}
}
