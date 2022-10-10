package com.java.web;

import com.java.pojo.Room;
import com.java.pojo.User;
import com.java.service.RoomService;
import com.java.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/selectByRoomNServlet")
public class SelectByRoomNServlet extends HttpServlet {
    private RoomService service=new RoomService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String roomN=request.getParameter("roomN");
        Room room=service.selectByRoomN(Integer.parseInt(roomN));

        if(room!=null){
            request.setAttribute("selectByRoomNServlet_msg","房间已存在");
            request.getRequestDispatcher("/roomAdd.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("/roomInsertServlet").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
