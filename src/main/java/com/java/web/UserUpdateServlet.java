package com.java.web;

import com.java.pojo.User;
import com.java.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userUpdateServlet")
public class UserUpdateServlet extends HttpServlet {
    private UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String tel = req.getParameter("tel");
        String roomN = req.getParameter("roomN");
        User user=new User();
        user.setId(id);user.setUsername(username);

        user.setTel(tel);
        if(roomN!=null) {
            user.setRoomN(Integer.parseInt(roomN));
        }else user.setRoomN(null);
        System.out.println(user);
        service.updateUser(user);
        req.setAttribute("userUpdate_msg","修改成功");
        req.getRequestDispatcher("/userUpdate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
