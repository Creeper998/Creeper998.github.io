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
import java.util.List;

@WebServlet("/userSelectServlet")
public class UserSelectServlet extends HttpServlet {
    private UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=UTF-8");
        //调用BrandService完成查询
        String id = req.getParameter("id");
        String username = req.getParameter("username");
        String tel = req.getParameter("tel");
        String roomN = req.getParameter("roomN");
        User user=new User();
        user.setId(id);
        user.setUsername(username);
        user.setTel(tel);
        if(roomN!=null&&!roomN.equals("")) {
            user.setRoomN(Integer.parseInt(roomN));
        }else user.setRoomN(null);
        List<User> users = service.userSelect(user);
        //存于request域

        req.setAttribute("users", users);
        //请求转发
        req.getRequestDispatcher("/userInquireRes.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
