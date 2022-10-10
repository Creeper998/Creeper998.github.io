package com.java.web;

import com.java.pojo.Room;
import com.java.service.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/roomSelectServlet")
public class RoomSelectServlet extends HttpServlet {
    private RoomService service = new RoomService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        //调用BrandService完成查询
        String roomN = req.getParameter("roomN");
        String roomClass = req.getParameter("roomClass");
        String roomStatus = req.getParameter("roomStatus");
        String bedN = req.getParameter("bedN");
        String money = req.getParameter("money");
        String username = req.getParameter("username");
        Room room=new Room();
        if(roomN!=null&&!roomN.equals("")) {
            room.setRoomN(Integer.parseInt(roomN));
        }else room.setRoomN(null);
        room.setRoomClass(roomClass);
        room.setRoomStatus(roomStatus);
        if(bedN!=null&&!bedN.equals("")) {
            room.setBedN(Integer.parseInt(bedN));
        }else room.setBedN(null);
        room.setMoney(money);
        room.setUsername(username);
        System.out.println("room:"+room);
        List<Room> rooms = service.roomSelect(room);
        //存于request域

        req.setAttribute("rooms", rooms);
        //请求转发
        req.getRequestDispatcher("/roomInquireRes.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
