@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        // Logic to save data (e.g., in a database or text file)
        PrintWriter out = response.getWriter();
        out.println("Registration Successful for: " + name + " with email " + email);
    }
}
