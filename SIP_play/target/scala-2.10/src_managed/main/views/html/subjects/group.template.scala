
package views.html.subjects

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
object group extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Subject],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(group: String, projects: List[Subject]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

<li data-group=""""),_display_(Seq[Any](/*3.18*/group)),format.raw/*3.23*/("""">
    <span class="toggle"></span>
    <h4 class="groupName">"""),_display_(Seq[Any](/*5.28*/group)),format.raw/*5.33*/("""</h4>
    <dl class="options">
        <dt>Možnosti</dt>
        <dd>
            <button class="btn primary">Nový předmět</button>
            <button class="btn primary">Odebrat Předmět</button>
        </dd>
    </dl>
    <ul>
    """),_display_(Seq[Any](/*14.6*/projects/*14.14*/.map/*14.18*/ { subject =>_display_(Seq[Any](format.raw/*14.31*/("""
        """),_display_(Seq[Any](/*15.10*/views/*15.15*/.html.subjects.item(subject))),format.raw/*15.43*/("""
    """)))})),format.raw/*16.6*/("""
    </ul>
</li>"""))}
    }
    
    def render(group:String,projects:List[Subject]): play.api.templates.HtmlFormat.Appendable = apply(group,projects)
    
    def f:((String,List[Subject]) => play.api.templates.HtmlFormat.Appendable) = (group,projects) => apply(group,projects)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 15:55:57 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/group.scala.html
                    HASH: d2a84f4376c6d4365ae17c02573f146a38a4ce87
                    MATRIX: 797->1|931->41|985->60|1011->65|1109->128|1135->133|1405->368|1422->376|1435->380|1486->393|1532->403|1546->408|1596->436|1633->442
                    LINES: 26->1|29->1|31->3|31->3|33->5|33->5|42->14|42->14|42->14|42->14|43->15|43->15|43->15|44->16
                    -- GENERATED --
                */
            