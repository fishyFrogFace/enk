package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def cleanup = Action {
    Ok(views.html.index("Soppah Mario"))
  }

}