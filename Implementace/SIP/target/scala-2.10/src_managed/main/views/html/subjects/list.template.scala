
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
        Předměty  <small><a href=""""),_display_(Seq[Any](/*7.36*/routes/*7.42*/.SubjectController.create)),format.raw/*7.67*/("""">přidat předmět</a></small>
    """)))};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "SubjectController")/*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""

    <h3>Seznam předmětů</h3>

    <ul id="SubjectController">
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
                    DATE: Sun Nov 10 22:53:33 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/list.scala.html
                    HASH: 8f78053038c7bae0bf096edb2512517400ce1ef0
                    MATRIX: 789->1|941->85|954->90|1038->94|1109->130|1123->136|1169->161|1242->26|1270->79|1301->195|1339->198|1386->236|1426->238|1530->307|1547->315|1579->338|1589->349|1625->376|1665->378|1715->392|1729->397|1790->436|1832->452
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|34->7|36->1|38->5|39->8|41->10|41->10|41->10|46->15|46->15|46->15|46->16|46->16|46->16|47->17|47->17|47->17|48->19
                    -- GENERATED --
                */
            