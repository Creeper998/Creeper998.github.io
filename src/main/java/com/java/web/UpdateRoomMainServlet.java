package com.java.web;

import com.java.pojo.Room;
import com.java.service.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateRoomMainServlet")
public class UpdateRoomMainServlet extends HttpServlet {
    private RoomService service = new RoomService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        String roomN = req.getParameter("roomN");
        String roomClass = req.getParameter("roomClass");
        String roomStatus = req.getParameter("roomStatus");
        String bedN = req.getParameter("bedN");
        String money = req.getParameter("money");
        String username = req.getParameter("username");
        Room room =new Room();
        if(roomN!=null&&!roomN.equals("")) {
            room.setRoomN(Integer.parseInt(roomN));
        }
        System.out.println(room);
        room.setRoomClass(roomClass);
        room.setRoomStatus(null);
        if(bedN!=null&&!bedN.equals("")) {
            room.setBedN(Integer.parseInt(bedN));
        }
        room.setMoney(money);
        room.setUsername(null);
        service.update(room);
        req.setAttribute("updateRoomMainServlet_msg","修改成功");
        req.getRequestDispatcher("/roomUpdate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
