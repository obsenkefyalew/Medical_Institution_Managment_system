import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class firstpage{
	public static void main(String s[]){
		First_page f = new First_page();
	}
}

class First_page extends Frame implements ActionListener{
	public First_page(){
		super("Homepage");
		setSize(240,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		Button b=new Button("Sign In");
		Button b2=new Button("Create Account");
		Button b3=new Button("Exit");
		
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		//---------------------------
		Label L1=new Label("            FPS Medical College & Hospital            ");
		Label L2=new Label("       Do you have an Account?");
		add(L1);add(b);add(L2);add(b2);add(b3);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent a)
	{
		String st = a.getActionCommand();
		if(st == "Sign In")
		{	
			Sign_IN s1 = new Sign_IN(this);
			setVisible(false);
		}
		if(st == "Create Account")
		{	
			Registration r1 = new Registration(this);
			setVisible(false);
		}
		if(st == "Exit")
		{	
			System.exit(0);
		}
	}
}
class Sign_IN extends Frame implements ActionListener{
	private First_page f;
	private TextField tf1;
	private TextField tf2;
	private TextField tf3;
	private Label L6;
	public Sign_IN(First_page f1){
		super("Sign in");
		setSize(260,400);
		setVisible(true);
		f = f1;
		//--------------------------
		setLayout(new FlowLayout());
		tf1=new TextField(15);
		tf2=new TextField(15);
		tf3=new TextField(15);
		Button b=new Button("Login");
		Button b2=new Button("Back");
		b.addActionListener(this);
		b2.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
		//---------------------------
		Label L1=new Label("                       SIGN IN                                  ");
		Label L2=new Label("User Name :");
		Label L3=new Label("Password :");
		Label L4=new Label("Click Here To Login:");
		Label L5=new Label("ID :");
		L6=new Label("                               ");
		add(L1);add(L5);add(tf3);add(L2);add(tf1);add(L3);add(tf2);add(L4);add(b);add(b2);add(L6);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent a2)
	{
		String st = a2.getActionCommand();
		if(st == "Back")
		{	
			this.setVisible(false);
			f.setVisible(true);
		}
		if(tf1.getText().length() != 0 && tf2.getText().length() != 0 && tf3.getText().length() != 0)
		{
			if(st == "Login")
			{	
				if(tf3.getText().length() == 9)
				{
					this.setVisible(false);
					Doctor d = new Doctor();
				}
				else if(tf3.getText().length() == 8)
				{
					this.setVisible(false);
					Receptionist r = new Receptionist();
				}
				else
				{
					this.setVisible(false);
					Patient p = new Patient();
				}
			}
		}
		else
			L6.setText("Error");
	}
}
class Patient extends Frame implements ActionListener{
	public Patient(){
		super("Patient Account :");
		setSize(300,400);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		
		Button b=new Button("Doctor Info");
		Button b2=new Button("Test Info");
		Button b3=new Button("Exit");
		
		Label L1=new Label("User Name :");
		Label L2=new Label("User ID :");
		Label L3=new Label("                                                                   ");
		Label L4=new Label("                                            ");
		Label L5=new Label("                                            ");
		
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		//---------------------------
		
		add(L1);add(L4);add(L2);add(L5);add(b);add(b2);add(L3);add(b3);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent a2){
		String st = a2.getActionCommand();
		if(st == "Doctor Info")
		{	
			//Doctor_info di1 = new Doctor_info(this);
			setVisible(false);
		}
		if(st == "Test Info")
		{	
			Test_Info ti = new Test_Info(this);
			setVisible(false);
		}
		if(st == "Exit")
		{	
			System.exit(0);
		}
	}
}
class Test_Info extends Frame implements ActionListener{
	private Patient p;
	public Test_Info(Patient p1){
		super("Test Info:");
		setSize(500,400);
		setVisible(true);
		p = p1;
		//--------------------------
		setLayout(new FlowLayout());
		Button b5=new Button("Back");
		
		add(b5);
		setLayout(new FlowLayout());
	}
	public void actionPerformed(ActionEvent a2){
		String st = a2.getActionCommand();
		if(st.equals("Back"))
		{	
			this.setVisible(false);
			p.setVisible(true);
		}
		
	}
}
class Doctor extends Frame implements ActionListener{
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
		public void actionPerformed(ActionEvent a2){}
}
class Receptionist extends Frame implements ActionListener{
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
		public void actionPerformed(ActionEvent a2){}
}

//================================================================================================================
class Registration extends Frame implements ActionListener{
	private First_page f;
	private TextField tf1;
	private TextField tf2;
	private TextField tf3;
	private TextField tf4;
	private TextField tf5;
	private TextField tf6;
	private TextField tf7;
	private TextField tf8;
	private TextField tf9;
	private TextField tf10;
	private TextField tf11;
	private Label L99;
	public Registration(First_page f1){
		super("Registration :");
		setSize(600,700);
		setVisible(true);
		f = f1;
		//--------------------------
		setLayout(new FlowLayout());
		tf1=new TextField(15);
		tf2=new TextField(15);
		tf3=new TextField(15);
		tf4=new TextField(15);
		tf5=new TextField(15);
		tf6=new TextField(15);
		tf7=new TextField(15);
		tf8=new TextField(15);
		tf9=new TextField(15);
		tf10=new TextField(15);
		tf11=new TextField(15);
		Button b=new Button("Submit");
		Button b2=new Button("Back");
		
		b.addActionListener(this);
		b2.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		tf3.addActionListener(this);
		tf4.addActionListener(this);
		tf5.addActionListener(this);
		tf6.addActionListener(this);
		tf7.addActionListener(this);
		tf8.addActionListener(this);
		tf9.addActionListener(this);
		tf10.addActionListener(this);
		tf11.addActionListener(this);
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
		L99=new Label("                     ");
		//------------------------------
		add(L1);add(L2);add(tf1);add(L3);add(tf2);add(L4);add(tf3); add(L5);add(tf4);add(L12);add(tf5);add(L6);add(tf6);add(L7);
		add(tf7);add(L8);add(tf8);add(L9);add(tf9);add(L10);add(tf10);add(L11);add(tf11);add(L13);add(b);add(b2);add(L99);
		setLayout(new FlowLayout());

	}
	public void actionPerformed(ActionEvent a2)
	{
		String st = a2.getActionCommand();
		if(st == "Back")
		{	
			this.setVisible(false);
			f.setVisible(true);
		}
		if(st == "Submit" && tf1.getText().length() != 0 && tf2.getText().length() != 0 && tf3.getText().length() != 0 && 
		   tf4.getText().length() != 0 && tf5.getText().length() != 0 && tf6.getText().length() != 0 && tf7.getText().length() != 0 &&
		   tf8.getText().length() != 0 && tf9.getText().length() != 0 && tf10.getText().length() != 0 && tf11.getText().length() != 0)
		{
			String s = tf10.getText();
			if(s.equals(tf11.getText()))
			{
				this.setVisible(false);
				Submit s2 = new Submit(f);
			}
			else
				L99.setText("Incorrect Password !!!");
		}
		else
			L99.setText("Error");
		
	}
}
class Submit extends Frame implements ActionListener{
	private First_page f;
	public Submit(First_page f1){
		super("Submit");
		 f = f1;
		setSize(260,200);
		setVisible(true);
		//--------------------------
		setLayout(new FlowLayout());
		TextField tf1=new TextField(15);
		TextField tf2=new TextField(15);
		TextField tf3=new TextField(15);
		Button b=new Button("First_page");
		Button b2=new Button("Exit");
		
		b.addActionListener(this);
		b2.addActionListener(this);
		//---------------------------
		Label L1=new Label(" Your registration is complete ");
		Label L2=new Label("Your ID :");
		Label L3=new Label("     																				");
		
		add(L1);add(L2);add(tf1);add(L3);add(b);add(b2);
		setLayout(new FlowLayout());

	}
	
	public void actionPerformed(ActionEvent a)
	{
		String st = a.getActionCommand();
		if(st == "First_page")
		{	
			f.setVisible(true);
			setVisible(false);
		}
		if(st == "Exit")
		{	
			System.exit(0);
		}
	}
}


