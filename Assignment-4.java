import java.sql.*;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "yourpassword");

            // Step 3: Prepare SQL Query
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            pst = con.prepareStatement(query);
            pst.setString(1, username);
            pst.setString(2, password);

            // Step 4: Execute Query
            rs = pst.executeQuery();

            // Step 5: Check Login Status
            if (rs.next()) {
                System.out.println("Login Successful! Welcome, " + username);
            } else {
                System.out.println("Invalid username or password.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close Connections
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        sc.close();
    }
}
