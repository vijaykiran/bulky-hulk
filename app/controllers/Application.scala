package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    
    
    
    //jhjh
    Ok(views.html.index("Bulky testing stuff is ready."))
  }

}
