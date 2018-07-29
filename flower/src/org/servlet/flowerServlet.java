package org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.entity.flower;
import org.service.impl.flowerServiceImpl;
import org.service1.flowerService;

public class flowerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
	    String opr = req.getParameter("opr");
	    flowerService fs=new flowerServiceImpl();
	    if(opr.equals("select")){
	    	List<flower> list=fs.list();
	    	System.out.println(list.size());
	    	req.getSession().setAttribute("list", list);
	    	resp.sendRedirect("index.jsp");
	    }else if(opr.equals("insert")){
	    	flower f=new flower();
	    	String name=req.getParameter("name");
	    	String aname=req.getParameter("aname");
	    	String keshu=req.getParameter("keshu");
	    	String price=req.getParameter("price");
	    	String add=req.getParameter("add");
	    	System.out.println(name);
	    	f.setName(name);
	    	f.setAnothername(aname);
	    	f.setProperty(keshu);
	    	f.setPrice(Integer.parseInt(price));
	    	f.setProduction(add);
	    	int num=0;
	    	num=fs.insert(f);
	    	if(num==1){
	    		out.print("添加成功");
	    		req.setCharacterEncoding("utf-8");
	    		resp.sendRedirect("flowerServlet?opr=select");
	    	}else{
	    		out.print("添加失败");
	    	}
	    }
 	}
	
}
