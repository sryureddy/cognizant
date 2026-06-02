import java.sql.*;

public class j32 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
            );

            PreparedStatement ps =
                con.prepareStatement("INSERT INTO students VALUES(?, ?)");

            ps.setInt(1, 101);
            ps.setString(2, "Ravi");
            ps.executeUpdate();

            PreparedStatement ps2 =
                con.prepareStatement("UPDATE students SET name=? WHERE id=?");

            ps2.setString(1, "Ram");
            ps2.setInt(2, 101);
            ps2.executeUpdate();

            System.out.println("Record Inserted and Updated");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}