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

@WebServlet("/broinfo")
public class BroInfoServlet extends HttpServlet {
    CourseDao dao=new CourseDaoImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException, IOException {
        String spid=req.getParameter("spid");
        String cpid=req.getParameter("cpid");
        List<CourseInfo> jibens = dao.searchstuinfo(spid,cpid);
        req.setAttribute("jibens",jibens);
        req.getRequestDispatcher("/view/mod_score.jsp").forward(req, resp);
    }
}
