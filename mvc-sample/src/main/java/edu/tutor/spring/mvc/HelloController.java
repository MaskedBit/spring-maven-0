package edu.tutor.spring.mvc;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Date;

public class HelloController implements Controller
{
    private static final Logger m_logger = Logger.getLogger(HelloController.class);

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	m_logger.info("handleRequest() called");

    	String now = (new Date()).toString();
        m_logger.info("Returning hello view with " + now);

        return new ModelAndView("WEB-INF/jsp/hello.jsp", "now", now);
    }

}
