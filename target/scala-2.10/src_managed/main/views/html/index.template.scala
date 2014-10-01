
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""

    <h1>Add a new task</h1>

    """),_display_(Seq[Any](/*9.6*/form(routes.Application.newTask)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
        """),_display_(Seq[Any](/*10.10*/inputText(taskForm("label")))),format.raw/*10.38*/("""
        <input type="submit" value="Create">
    """)))})),format.raw/*12.6*/("""

    <h2>"""),_display_(Seq[Any](/*14.10*/tasks/*14.15*/.size)),format.raw/*14.20*/(""" task(s)</h2>

    <ul>
        """),_display_(Seq[Any](/*17.10*/tasks/*17.15*/.map/*17.19*/ { task =>_display_(Seq[Any](format.raw/*17.29*/("""
            <li>
                <a href=""""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Application.viewTask(task.id))),format.raw/*19.63*/("""">"""),_display_(Seq[Any](/*19.66*/task/*19.70*/.id)),format.raw/*19.73*/(""" - """),_display_(Seq[Any](/*19.77*/task/*19.81*/.label)),format.raw/*19.87*/("""</a>
            </li>
        """)))})),format.raw/*21.10*/("""
    </ul>

""")))})))}
    }
    
    def render(tasks:List[Task],taskForm:Form[String]): play.api.templates.HtmlFormat.Appendable = apply(tasks,taskForm)
    
    def f:((List[Task],Form[String]) => play.api.templates.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 01 11:02:57 EEST 2014
                    SOURCE: /Users/arturgajewski/workspace/scala/workspace/todolist/app/views/index.scala.html
                    HASH: 5d9672a1df8344017a221d464f802d4cea2083f4
                    MATRIX: 573->1|726->44|754->63|790->65|815->82|854->84|924->120|964->152|1003->154|1049->164|1099->192|1181->243|1228->254|1242->259|1269->264|1338->297|1352->302|1365->306|1413->316|1493->360|1508->366|1560->396|1599->399|1612->403|1637->406|1677->410|1690->414|1718->420|1782->452
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|30->9|30->9|30->9|31->10|31->10|33->12|35->14|35->14|35->14|38->17|38->17|38->17|38->17|40->19|40->19|40->19|40->19|40->19|40->19|40->19|40->19|40->19|42->21
                    -- GENERATED --
                */
            