package com.java.web;

import com.java.pojo.Room;
import com.java.service.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateRoomDemoServlet")
public class UpdateRoomDemoServlet extends HttpServlet {
    private RoomService service = new RoomService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        System.out.println("id的是"+id);
        String[] split = id.split(",");
        String roomN =split[1].split("=")[1];
        System.out.println("roomN为"+roomN);
        String username = req.getParameter("username");
        System.out.println(roomN+","+username);
        Room room=new Room();
        room.setRoomN(Integer.parseInt(roomN));
        room.setRoomClass(null);
        room.setRoomStatus("空");
        room.setBedN(null);
        room.setMoney(null);
        room.setUsername("无");
        System.out.println(room);
        service.update(room);
        req.setAttribute("userUpdate_msg","修改成功");
        req.getRequestDispatcher("/userUpdate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
