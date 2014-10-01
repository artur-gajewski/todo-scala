
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

    <h1>Task #"""),_display_(Seq[Any](/*7.16*/tasks/*7.21*/.head.id)),format.raw/*7.29*/("""</h1>

    <p>
        """),_display_(Seq[Any](/*10.10*/tasks/*10.15*/.head.label)),format.raw/*10.26*/("""
    </p>

    <p>
        """),_display_(Seq[Any](/*14.10*/form(routes.Application.deleteTask(tasks.head.id))/*14.60*/ {_display_(Seq[Any](format.raw/*14.62*/("""
            <input type="submit" value="Delete">
        """)))})),format.raw/*16.10*/("""
    </p>

    <a href=""""),_display_(Seq[Any](/*19.15*/routes/*19.21*/.Application.tasks)),format.raw/*19.39*/("""">Back to task list</a>

""")))})))}
    }
    
    def render(tasks:List[Task]): play.api.templates.HtmlFormat.Appendable = apply(tasks)
    
    def f:((List[Task]) => play.api.templates.HtmlFormat.Appendable) = (tasks) => apply(tasks)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 01 15:56:10 EEST 2014
                    SOURCE: /Users/arturgajewski/workspace/scala/workspace/todolist/app/views/view.scala.html
                    HASH: 14381914501883ea56e7f69bfe5d3838edbf90e5
                    MATRIX: 559->1|688->20|716->39|752->41|777->58|816->60|868->77|881->82|910->90|970->114|984->119|1017->130|1081->158|1140->208|1180->210|1271->269|1332->294|1347->300|1387->318
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|28->7|31->10|31->10|31->10|35->14|35->14|35->14|37->16|40->19|40->19|40->19
                    -- GENERATED --
                */
            