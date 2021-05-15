package com.tzy.www.servlet;
import com.tzy.www.dao.CourseDao;
import com.tzy.www.dao.daoImpl.CourseDaoImpl;
import com.tzy.www.po.CourseInfo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/bro")
public class BroStudentServlet extends HttpServlet {
    CourseDao dao= new CourseDaoImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String tpid=(String) req.getSession().getAttribute("username");
        System.out.println(tpid);
        List<CourseInfo> jibens = dao.searchstuinfo(tpid);
        req.setAttribute("jibens",jibens);
        req.getRequestDispatcher("/view/liulanstu.jsp").forward(req, resp);
    }
}