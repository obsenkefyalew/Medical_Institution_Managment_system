import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class submit{
	public static void main(String s[]){
		Submit w = new Submit();

	}
}

class Submit extends Frame{
	public Submit(){
		super("Submit");
		setSize(260,200);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		Button b=new Button("Login");
		Button b2=new Button("Exit");
		//---------------------------
		Label L1=new Label(" Your registration is complete ");
		Label L2=new Label("Your ID :");
		Label L3=new Label("     																				");
		
		add(L1);add(L2);add(tf1);add(L3);add(b);add(b2);
		setLayout(new FlowLayout());

	}
}