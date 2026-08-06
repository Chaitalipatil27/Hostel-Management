package com.hostel.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/room")
public class RoomServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String roomNo = request.getParameter("roomNo");
        String capacity = request.getParameter("capacity");
        String available = request.getParameter("available");

        response.setContentType("text/html");

        response.getWriter().println("<h2>Room Saved Successfully</h2>");

        response.getWriter().println("<br>Room No : " + roomNo);
        response.getWriter().println("<br>Capacity : " + capacity);
        response.getWriter().println("<br>Available Beds : " + available);
    }
}
