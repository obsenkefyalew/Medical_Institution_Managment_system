import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
public class registration{
	public static void main(String s[]){
		Registration w=new Registration();
	}
}


class Registration extends Frame{
	public Registration(){
		super("Registration :");
		setSize(600,700);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		TextField tf4=new TextField(15);
		TextField tf5=new TextField(15);
		TextField tf6=new TextField(15);
		TextField tf7=new TextField(15);
		TextField tf8=new TextField(15);
		TextField tf9=new TextField(15);
		TextField tf10=new TextField(15);
		TextField tf11=new TextField(15);
		TextField tf12=new TextField(15);
		Button b=new Button("Submit");
		Button b2=new Button("Back");
		//---------------------------
		Label L1=new Label("                                                        Registration                                                                          ");
		Label L2=new Label("        First name :");
		Label L3=new Label("                  Last name :");
		Label L4=new Label("                 Email :");
		Label L5=new Label("                   Phone No :");
		Label L12=new Label("Present address :");
		Label L6=new Label("               Blood Group :");
		Label L7=new Label("                     Age :");
		Label L8=new Label("                            Gender :");
		Label L9=new Label("   User Name :");
		Label L10=new Label("                  Password :");
		Label L11=new Label("  Confirm password :");
		Label L13=new Label("          							                        										");
		//------------------------------
		add(L1);add(L2);add(tf1);add(L3);add(tf2);add(L4);add(tf3); add(L5);add(tf4);add(L12);add(tf11);add(L6);add(tf5);add(L7);
		add(tf6);add(L8);add(tf7);add(L9);add(tf8);add(L10);add(tf9);add(L11);add(tf10);add(L13);add(b);add(b2);
		setLayout(new FlowLayout());

	}
}
