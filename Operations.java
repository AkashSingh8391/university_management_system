package myPackage;

import java.sql.*;
import java.util.Scanner;

public class Operations {
    private Connection conn;

    public Operations() {
        conn = dbConnection.getConnection();
    }

    public void addStudent(String name, String email, int courseId) {
        String query = "INSERT INTO students (name, email, course_id) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, courseId);
            stmt.executeUpdate();
            System.out.println("Student added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listStudents() {
        String query = "SELECT * FROM students";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("ID\tName\t\tEmail\t\tCourse ID");
            while (rs.next()) {
                System.out.printf("%d\t%s\t\t%s\t\t%d\n", rs.getInt("id"), rs.getString("name"),
                        rs.getString("email"), rs.getInt("course_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addFaculty(String name, String department) {
        String query = "INSERT INTO faculty (name, department) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, department);
            stmt.executeUpdate();
            System.out.println("Faculty added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listFaculty() {
        String query = "SELECT * FROM faculty";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("ID\tName\t\tDepartment");
            while (rs.next()) {
                System.out.printf("%d\t%s\t\t%s\n", rs.getInt("id"), rs.getString("name"), rs.getString("department"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCourse(String name, int credits) {
        String query = "INSERT INTO courses (name, credits) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, credits);
            stmt.executeUpdate();
            System.out.println("Course added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listCourses() {
        String query = "SELECT * FROM courses";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("ID\tName\t\tCredits");
            while (rs.next()) {
                System.out.printf("%d\t%s\t\t%d\n", rs.getInt("id"), rs.getString("name"), rs.getInt("credits"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
