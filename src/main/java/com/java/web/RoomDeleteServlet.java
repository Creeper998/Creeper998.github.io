package com.java.web;

import com.java.service.RoomService;
import com.java.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/roomDeleteServlet")
public class RoomDeleteServlet extends HttpServlet {
    private RoomService service=new RoomService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        String roomN = req.getParameter("roomN");
        String[] split = roomN.split(",");
        String username=new String(split[1].getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        roomN=split[0];
        if(username.equals("无")) {
            service.roomDelete(roomN);
        }else {
            req.setAttribute("roomDelete_msg", "请先删除用户之后操作");
        }
        req.getRequestDispatcher("/selectAllServlet").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
