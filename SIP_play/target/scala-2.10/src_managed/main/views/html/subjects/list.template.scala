
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Subject],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subjects: List[Subject]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.6*/title/*6.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.15*/("""
        Předměty  <small><a href=""""),_display_(Seq[Any](/*7.36*/routes/*7.42*/.Subjects.blankCreate)),format.raw/*7.63*/("""">přidat předmět</a></small>
    """)))};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "subjects")/*10.31*/ {_display_(Seq[Any](format.raw/*10.33*/("""

    <h3>Seznam předmětů</h3>

    <ul id="subjects">
    """),_display_(Seq[Any](/*15.6*/subjects/*15.14*/.groupBy(_.katedra).map/*15.37*/ {/*16.9*/case (subject, subjects) =>/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
            """),_display_(Seq[Any](/*17.14*/views/*17.19*/.html.subjects.group(subject, subjects))),format.raw/*17.58*/("""
        """)))}})),format.raw/*19.6*/("""
    </ul>


""")))})))}
    }
    
    def render(subjects:List[Subject]): play.api.templates.HtmlFormat.Appendable = apply(subjects)
    
    def f:((List[Subject]) => play.api.templates.HtmlFormat.Appendable) = (subjects) => apply(subjects)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 14:12:04 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/list.scala.html
                    HASH: 4c64b50f0b9e1dc1e9e3101b1b245f543b6665eb
                    MATRIX: 789->1|941->85|954->90|1038->94|1109->130|1123->136|1165->157|1238->26|1266->79|1297->191|1335->194|1373->223|1413->225|1508->285|1525->293|1557->316|1567->327|1603->354|1643->356|1693->370|1707->375|1768->414|1810->430
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|34->7|36->1|38->5|39->8|41->10|41->10|41->10|46->15|46->15|46->15|46->16|46->16|46->16|47->17|47->17|47->17|48->19
                    -- GENERATED --
                */
            