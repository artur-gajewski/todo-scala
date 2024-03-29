package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models.Task

object Application extends Controller {

    val taskForm = Form(
        "label" -> nonEmptyText
    )

    def index = Action {
        Redirect(routes.Application.tasks)
    }

    def tasks = Action {
        Ok(views.html.index(Task.all(), taskForm))
    }

    def newTask = Action { implicit request =>
        taskForm.bindFromRequest.fold(
            errors => BadRequest(views.html.index(Task.all(), errors)),
            label => {
                Task.create(label)
                Redirect(routes.Application.tasks)
            }
        )
    }

    def deleteTask(id: Long) = Action { implicit request =>
        Task.delete(id)
        Redirect(routes.Application.tasks)
    }

    def viewTask(id: Long) = Action { implicit request =>
        Ok(views.html.view(Task.findById(id)))
    }

}