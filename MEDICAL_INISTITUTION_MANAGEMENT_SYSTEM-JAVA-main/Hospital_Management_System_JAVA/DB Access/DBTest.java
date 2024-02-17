import java.sql.ResultSet;
import java.sql.SQLException;
public class DBTest{
    public static void main(String[] args)throws SQLException{
        // TODO code application logic here
        String q="select * from student";
		DataAccess da=new DataAccess();
        ResultSet rs=null;
        rs=da.getData(q);
        while(rs.next()){
            String n = rs.getString("name");
			float cg = rs.getFloat("cgpa");
			String d = rs.getString("dept");
			System.out.println(n+" with "+cg+" in "+d);
        }
		//da.close();
		q="insert into student values('4','mithu','3.4','BBA')";
		//da.updateDB(q);
    }
}