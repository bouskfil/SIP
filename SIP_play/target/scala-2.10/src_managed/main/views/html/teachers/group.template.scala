
package views.html.teachers

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Teacher],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(group: String, teachers: List[Teacher]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

<li data-group=""""),_display_(Seq[Any](/*3.18*/group)),format.raw/*3.23*/("""">
    <span class="toggle"></span>
    <dl class="options">
        <dt>Možnosti</dt>
        <dd>
            <button class="newTeacher">Nový učitel</button>
            <button class="deleteTeacher">Odebrat učitele</button>
        </dd>
    </dl>
    <ul>
    """),_display_(Seq[Any](/*13.6*/teachers/*13.14*/.map/*13.18*/ { teacher =>_display_(Seq[Any](format.raw/*13.31*/("""
        """),_display_(Seq[Any](/*14.10*/views/*14.15*/.html.teachers.item(teacher))),format.raw/*14.43*/("""
    """)))})),format.raw/*15.6*/("""
    </ul>
</li>"""))}
    }
    
    def render(group:String,teachers:List[Teacher]): play.api.templates.HtmlFormat.Appendable = apply(group,teachers)
    
    def f:((String,List[Teacher]) => play.api.templates.HtmlFormat.Appendable) = (group,teachers) => apply(group,teachers)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 11:01:55 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/teachers/group.scala.html
                    HASH: 0644c1b37080e499b9d0102d11a89068d5646ce3
                    MATRIX: 797->1|931->41|985->60|1011->65|1311->330|1328->338|1341->342|1392->355|1438->365|1452->370|1502->398|1539->404
                    LINES: 26->1|29->1|31->3|31->3|41->13|41->13|41->13|41->13|42->14|42->14|42->14|43->15
                    -- GENERATED --
                */
            