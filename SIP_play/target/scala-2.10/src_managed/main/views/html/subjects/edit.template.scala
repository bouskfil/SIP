
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Subject],List[Teacher],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subjectForm: Form[Subject], teachers: List[Teacher]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.6*/title/*6.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.15*/("""
        Přidat předmět
    """)))};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "signup")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""

    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.Subjects.save(subjectForm.get.id))/*12.68*/ {_display_(Seq[Any](format.raw/*12.70*/("""

        <fieldset>
            <legend>Informace o předmětu</legend>



            """),_display_(Seq[Any](/*19.14*/inputText(
                subjectForm("name"),
                '_label -> "Název předmětu",
                '_help -> "Zadejte jméno předmětu.",
                '_error -> subjectForm.globalError
            ))),format.raw/*24.14*/("""

            """),_display_(Seq[Any](/*26.14*/inputText(
                subjectForm("katedra"),
                '_label -> "Katedra",
                '_help -> "Zadejte katedru."
            ))),format.raw/*30.14*/("""



            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Garant&nbsp;&nbsp;&nbsp;&nbsp;
            <select name="garant">
                <option value="-- Zadejte garanta --"></option>
                """),_display_(Seq[Any](/*37.18*/for(teacher <- teachers) yield /*37.42*/ {_display_(Seq[Any](format.raw/*37.44*/("""
                    <option value=""""),_display_(Seq[Any](/*38.37*/teacher/*38.44*/.name)),format.raw/*38.49*/("""">"""),_display_(Seq[Any](/*38.52*/teacher/*38.59*/.name)),format.raw/*38.64*/("""</option>
                """)))})),format.raw/*39.18*/("""
            </select>




        </fieldset>


        <div class="actions">
            <input type="submit" class="btn primary" value="Upravit">
            <a href=""""),_display_(Seq[Any](/*50.23*/routes/*50.29*/.Subjects.blank)),format.raw/*50.44*/("""" class="btn">Zrušit</a>
        </div>

    """)))})),format.raw/*53.6*/("""

""")))})))}
    }
    
    def render(subjectForm:Form[Subject],teachers:List[Teacher]): play.api.templates.HtmlFormat.Appendable = apply(subjectForm,teachers)
    
    def f:((Form[Subject],List[Teacher]) => play.api.templates.HtmlFormat.Appendable) = (subjectForm,teachers) => apply(subjectForm,teachers)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 14:09:19 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/edit.scala.html
                    HASH: d51a02c2c08a79cb978e310be4e281b55591d3a5
                    MATRIX: 803->1|983->113|996->118|1080->122|1148->54|1176->107|1207->151|1245->154|1281->181|1321->183|1363->190|1378->196|1443->252|1483->254|1606->341|1838->551|1889->566|2058->713|2389->1008|2429->1032|2469->1034|2542->1071|2558->1078|2585->1083|2624->1086|2640->1093|2667->1098|2726->1125|2933->1296|2948->1302|2985->1317|3062->1363
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|50->19|55->24|57->26|61->30|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|70->39|81->50|81->50|81->50|84->53
                    -- GENERATED --
                */
            