package com.hostel.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String room = request.getParameter("room");

        response.setContentType("text/html");

        response.getWriter().println("<h2>Student Registered Successfully</h2>");

        response.getWriter().println("<br>Name : " + name);
        response.getWriter().println("<br>Email : " + email);
        response.getWriter().println("<br>Mobile : " + mobile);
        response.getWriter().println("<br>Room : " + room);
    }
}
