import java.sql.*;
public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        /*
         import package
         load driver
         register driver
         create connection
         crate statement
         execute statement
         process result
         close connection
        */
        String url="jdbc:postgresql://localhost:5432/FirstDemo";
        String uname="postgres";
        String pass="0000";
        String show="select * from student";
        String up="update student set name='PS' where id=3";
        String del="delete from student where id=3";
        String ppst="insert into student values(?,?,?)";

        int id=5;
        String name="SDP";
        int mark=78;
         //Class.forName("org.postgresql.Driver");
         Connection con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        PreparedStatement ps=con.prepareStatement(ppst);
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,mark);
        //System.out.println(st.execute(ins));
        System.out.println(ps.execute());
        Statement st=con.createStatement();
        ResultSet rs = st.executeQuery(show);

        System.out.println("ID  ||   Name   ||   Marks   ||");
        while(rs.next()) {
            System.out.println(rs.getInt(1)+"  ||  "+rs.getString(2)+"  ||  "+ rs.getInt(3)+"  ||  ");
        }
        con.close();
        System.out.println("Connection Closed");
    }
}
/*Class.forName("org.postgresql.Driver");
Connection con=DriverManger.getConnection("jdbc:postgresql://localhost:5432/DB");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from student");
while(rs.next()){ System.out.print(rs.getInt(1));
    finally{st.close(); rs.close(); con.close()}*/

