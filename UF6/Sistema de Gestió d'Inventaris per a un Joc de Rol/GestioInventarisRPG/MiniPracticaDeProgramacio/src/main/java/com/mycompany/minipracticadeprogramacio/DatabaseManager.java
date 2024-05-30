package com.mycompany.minipracticadeprogramacio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager
{
    private Connection connection;

    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://172.17.0.2:5432/book", "postgres", "mysecretpassword");
            System.out.println("Connexio establerta.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Book getBook(int id) {
        String query = "SELECT * FROM books WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Book(rs.getInt("id"), rsgetString("Title"), rs.getString("Title"), rs.getString("Author"),rs.getString("Editorial"), rs.getInt("Stock"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void addBook(Book book) {
        String query = "INSERT INTO books (id, title, author, title, editorial, stock) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setInt(1, book.getId());
            stmt.setString(2, book.getTitle());
            stmt.setString(3, book.getAuthor());
            stmt.setString(4, book.getEditorial());
            stmt.setInt(5, book.getStock());
            stmt.executeUpdate();
            System.out.println("Llibre afegit.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Book book) {
        String query = "UPDATE books SET id = ?, title = ? WHERE author = ?, title = ? WHERE author = ?, title = ? WHERE stock = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);

            stmt.setInt(1, book.getId());
            stmt.setString(2, book.getTitle());
            stmt.setString(3, book.getAuthor());
            stmt.setString(4, book.getEditorial());
            stmt.setInt(5, book.getStock());
            
            stmt.executeUpdate();
            System.out.println("Llibre modificat.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int id) {
        String query = "DELETE FROM books WHERE id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Llibre eliminat.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connexio tancada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}