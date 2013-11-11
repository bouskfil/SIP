
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Teacher,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(teacher: Teacher):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

<li data-project=""""),_display_(Seq[Any](/*3.20*/teacher/*3.27*/.id)),format.raw/*3.30*/("""">
    <a class="name" href="#">"""),_display_(Seq[Any](/*4.31*/teacher/*4.38*/.name)),format.raw/*4.43*/("""</a>
    <button class="delete" href="#">Smazat</button>
    <button class="edit" href="#">Upravit</button>

</li>"""))}
    }
    
    def render(teacher:Teacher): play.api.templates.HtmlFormat.Appendable = apply(teacher)
    
    def f:((Teacher) => play.api.templates.HtmlFormat.Appendable) = (teacher) => apply(teacher)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 11:01:55 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/teachers/item.scala.html
                    HASH: 07d5769b72ac0bb714c66b9ab1512b4348b93125
                    MATRIX: 783->1|895->19|951->40|966->47|990->50|1058->83|1073->90|1099->95
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4
                    -- GENERATED --
                */
            