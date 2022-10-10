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
import java.io.PrintWriter;


@WebServlet("/userInsertServlet")
public class UserInsertServlet extends HttpServlet {
    private UserService service =new UserService();
    private RoomService service1=new RoomService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String tel = req.getParameter("tel");
        String roomN = req.getParameter("roomN");
        User user=new User();
        user.setId(id);
        user.setUsername(username);
        user.setTel(tel);
        user.setRoomN(Integer.parseInt(roomN));
        Room room = service1.selectByRoomN(Integer.parseInt(roomN));

        service.insert(user);
        req.setAttribute("userInsert_msg", "添加成功");
        req.getRequestDispatcher("/userAdd.jsp").forward(req, resp);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
