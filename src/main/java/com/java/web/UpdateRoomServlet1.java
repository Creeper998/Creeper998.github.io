package com.java.web;

import com.java.pojo.Room;
import com.java.pojo.User;
import com.java.service.RoomService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateRoomServlet1")
public class UpdateRoomServlet1 extends HttpServlet {
    private RoomService service = new RoomService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        String roomN = req.getParameter("roomN");
        String username = req.getParameter("username");
        System.out.println(roomN + "," + username);
        Room room = new Room();
        room.setRoomN(Integer.parseInt(roomN));
        room.setRoomClass(null);
        room.setRoomStatus("已满");
        room.setBedN(null);
        room.setMoney(null);
        room.setUsername(username);
        Room room1 = service.selectByRoomN(Integer.parseInt(roomN));
        if(room1.getUsername().equals("无")) {
            boolean update = service.update(room, id);
            if (update) {
                req.getRequestDispatcher("/userInsertServlet").forward(req, resp);
            } else {
                req.setAttribute("userInsert_msg", "用户已存在");
                req.getRequestDispatcher("/userAdd.jsp").forward(req, resp);
            }
        }else{
            req.setAttribute("userInsert_msg", "此房间已满");
            req.getRequestDispatcher("/userAdd.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
