package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
    	return ok(views.html.index.render("Hello World"));
    }
    
    public static Result actors() {
        return TODO;
    }
    
    public static Result directors() {
        return TODO;
    }
    
    public static Result studio() {
        return TODO;
    }
    
    public static Result genre() {
        return TODO;
    }
    
    public static Result releaseDate() {
        return TODO;
    }
  
}
