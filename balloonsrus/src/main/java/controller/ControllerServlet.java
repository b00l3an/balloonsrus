
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brendan
 */
@WebServlet(name = "ControllerServlet",
        loadOnStartup =1,
        urlPatterns = {"/category",
                        "/addToCart",
                        "/viewCart",
                        "/updateCart",
                        "/checkout",
                        "/purchase"})

public class ControllerServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userPath = request.getServletPath();
        // If category page is requested
        if(userPath.equals("/category")){
            // Implement category request
        }
        // if cart page is requested
        else if (userPath.equals("/viewCart")){
            userPath = "/cart";
        }
        // if checkout is requested
        else if (userPath.equals("/checkout")){
            // Implement checkout request
        }
        String url = "WEB-INF/view/" + userPath + ".jsp";
        try{
            request.getRequestDispatcher(url).forward(request, response);
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userPath = request.getServletPath();
        
        // if addToCart is called
        if(userPath.equals("/addToCart")){
            //TODO implement addtocart
        }
        else if (userPath.equals("/updateCart")){
            // TODO implement updatecart
        }
        else if (userPath.equals("/purchase")){
            userPath = "/confirmation";
        }

        String url = "WEB-INF/view/" + userPath + ".jsp";
        try{
            request.getRequestDispatcher(url).forward(request, response);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
