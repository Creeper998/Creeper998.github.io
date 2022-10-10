package com.java.web;

import com.java.pojo.Adm;
import com.java.service.AdmService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    AdmService service = new AdmService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String admName = req.getParameter("admName");
        String password = req.getParameter("password");
        String codeGen = req.getParameter("checkCode").toUpperCase(Locale.ROOT);
        Adm adm=service.login(admName,password);
        System.out.println(adm);
        if(!codeGen.equals(req.getSession().getAttribute("checkCodeGen"))){
            req.setAttribute("register1_msg", "验证码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            return;
        }
        if(adm!=null){
            HttpSession session = req.getSession();
            session.setAttribute("admName", admName);
            String contextPath = req.getContextPath();
            resp.sendRedirect(contextPath+"/selectAllServlet");
        }else {
            req.setAttribute("login_msg", "用户名或密码错误");

            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
