package com.pereligins.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "TestDbServlet", urlPatterns = {"/TestDbServlet"})
public class TestDbServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = "root";
        String pass = "root";

        String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String driver = "com.mysql.jdbc.Driver";

        try {

            PrintWriter out = response.getWriter();
            out.println("Connecting to database " + jdbcUrl);

            Class.forName(driver);

            Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);

            out.println("SUCCESS!");


        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }


    }
}
