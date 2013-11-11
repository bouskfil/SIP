
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
object item extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Subject,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subject: Subject):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

<li data-project=""""),_display_(Seq[Any](/*3.20*/subject/*3.27*/.id)),format.raw/*3.30*/("""">
    <div style="border: solid; padding: 20px">
    <a class="name" href="#">"""),_display_(Seq[Any](/*5.31*/subject/*5.38*/.name)),format.raw/*5.43*/("""</a>
    """),_display_(Seq[Any](/*6.6*/helper/*6.12*/.form(action = routes.SubjectController.delete(subject.id))/*6.71*/ {_display_(Seq[Any](format.raw/*6.73*/("""
        <input class="btn" type="submit" value="Smazat">
    """)))})),format.raw/*8.6*/("""
    """),_display_(Seq[Any](/*9.6*/helper/*9.12*/.form(action = routes.SubjectController.edit(subject.id))/*9.69*/ {_display_(Seq[Any](format.raw/*9.71*/("""
        <input class="btn" type="submit" value="Upravit">
    """)))})),format.raw/*11.6*/("""

    """),_display_(Seq[Any](/*13.6*/if(subject.garant != null)/*13.32*/{_display_(Seq[Any](format.raw/*13.33*/("""
        Garant:
        <ul>
            <li>"""),_display_(Seq[Any](/*16.18*/subject/*16.25*/.garant)),format.raw/*16.32*/("""</li>
        </ul>
    """)))}/*18.8*/else/*18.13*/{_display_(Seq[Any](format.raw/*18.14*/("""
        předmět nemá garanta<br>
    """)))})),format.raw/*20.6*/("""

    """),_display_(Seq[Any](/*22.6*/if(subject.teachers.isEmpty)/*22.34*/{_display_(Seq[Any](format.raw/*22.35*/("""
        <span>předmět nemá žádné učitele</span>
    """)))}/*24.7*/else/*24.12*/{_display_(Seq[Any](format.raw/*24.13*/("""
        Učitelé:
        <ul>
        """),_display_(Seq[Any](/*27.10*/for(teacher <- subject.teachers) yield /*27.42*/ {_display_(Seq[Any](format.raw/*27.44*/("""
            <li>"""),_display_(Seq[Any](/*28.18*/teacher/*28.25*/.name)),format.raw/*28.30*/("""</li>
        """)))})),format.raw/*29.10*/("""
        </ul>
    """)))})),format.raw/*31.6*/("""
    </div>
    <br>


</li>"""))}
    }
    
    def render(subject:Subject): play.api.templates.HtmlFormat.Appendable = apply(subject)
    
    def f:((Subject) => play.api.templates.HtmlFormat.Appendable) = (subject) => apply(subject)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 22:53:17 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/item.scala.html
                    HASH: cdcd81f266a90ac49f206074d29ee91ffbbabb6f
                    MATRIX: 783->1|895->19|951->40|966->47|990->50|1105->130|1120->137|1146->142|1190->152|1204->158|1271->217|1310->219|1403->282|1443->288|1457->294|1522->351|1561->353|1656->417|1698->424|1733->450|1772->451|1855->498|1871->505|1900->512|1943->539|1956->544|1995->545|2065->584|2107->591|2144->619|2183->620|2255->675|2268->680|2307->681|2383->721|2431->753|2471->755|2525->773|2541->780|2568->785|2615->800|2666->820
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|34->6|36->8|37->9|37->9|37->9|37->9|39->11|41->13|41->13|41->13|44->16|44->16|44->16|46->18|46->18|46->18|48->20|50->22|50->22|50->22|52->24|52->24|52->24|55->27|55->27|55->27|56->28|56->28|56->28|57->29|59->31
                    -- GENERATED --
                */
            