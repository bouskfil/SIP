
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
object edit extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Subject],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subjectForm: Form[Subject]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.6*/title/*6.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.15*/("""
        Přidat předmět
    """)))};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "signup")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""

    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.SubjectController.save(subjectForm.get.id))/*12.77*/ {_display_(Seq[Any](format.raw/*12.79*/("""

        <fieldset>
            <legend>Informace o předmětu</legend>

            """),_display_(Seq[Any](/*17.14*/inputText(
                subjectForm("name"),
                '_label -> "Název předmětu",
                '_help -> "Zadejte jméno předmětu.",
                '_error -> subjectForm.globalError
            ))),format.raw/*22.14*/("""

            """),_display_(Seq[Any](/*24.14*/inputText(
                subjectForm("katedra"),
                '_label -> "Katedra",
                '_help -> "Zadejte katedru."
            ))),format.raw/*28.14*/("""

            """),_display_(Seq[Any](/*30.14*/select(
                subjectForm("garant"),
                options = options(Teacher.getAllNames),
                '_default -> "--- Vyberte garanta ---",
                '_label -> "Garant",
                '_help -> "Vyberte garanta."
            ))),format.raw/*36.14*/("""
            """),_display_(Seq[Any](/*37.14*/textarea(
                subjectForm("information"),
                '_label -> "Informace",
                '_help -> "Zadejte informace o předmětu."
            ))),format.raw/*41.14*/("""
        </fieldset>

        <div class="actions">
            <input type="submit" class="btn primary" value="Upravit">
            <a href=""""),_display_(Seq[Any](/*46.23*/routes/*46.29*/.SubjectController.blank)),format.raw/*46.53*/("""" class="btn">Zrušit</a>
        </div>

    """)))})),format.raw/*49.6*/("""

""")))})))}
    }
    
    def render(subjectForm:Form[Subject]): play.api.templates.HtmlFormat.Appendable = apply(subjectForm)
    
    def f:((Form[Subject]) => play.api.templates.HtmlFormat.Appendable) = (subjectForm) => apply(subjectForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 10 22:52:56 CET 2013
                    SOURCE: /Users/MacBook/Dropbox/FEL/05_SI/SIP_play/app/views/subjects/edit.scala.html
                    HASH: 881474afd589f22516cbb3b106c9d7130dc84d43
                    MATRIX: 789->1|944->88|957->93|1041->97|1109->29|1137->82|1168->126|1206->129|1242->156|1282->158|1324->165|1339->171|1413->236|1453->238|1574->323|1806->533|1857->548|2026->695|2077->710|2353->964|2403->978|2590->1143|2770->1287|2785->1293|2831->1317|2908->1363
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|48->17|53->22|55->24|59->28|61->30|67->36|68->37|72->41|77->46|77->46|77->46|80->49
                    -- GENERATED --
                */
            