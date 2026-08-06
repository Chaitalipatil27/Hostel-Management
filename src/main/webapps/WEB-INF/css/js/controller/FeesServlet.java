package com.hostel.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fees")
public class FeesServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String studentId = request.getParameter("studentId");
        String studentName = request.getParameter("studentName");
        String amount = request.getParameter("amount");

        response.setContentType("text/html");

        response.getWriter().println("<h2>Fees Submitted Successfully</h2>");

        response.getWriter().println("<br>Student ID : " + studentId);
        response.getWriter().println("<br>Student Name : " + studentName);
        response.getWriter().println("<br>Amount : ₹" + amount);
    }
}
