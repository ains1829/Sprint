package utilitaire;
import javax.servlet.*; 
import javax.servlet.http.*;
public class Utilitaire {
    
    public Utilitaire() {
    }
    public String servletPath(HttpServletRequest req, HttpServletResponse res){
        return req.getServletPath() ;
    }   
}
